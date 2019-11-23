package com.liferay.training;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;


public class DownloadEBook {
    public static void main(String args[]) throws IOException {

        String siteUrl = "https://www.d4j.cn";

        int pageNumber = 1;

        ArrayList<String> info = new ArrayList<>();

        File csv = new File("/Users/macbook/Downloads/Info.csv");

        FileWriter fileWriter = new FileWriter(csv);

        fileWriter.write("ID , URL , CODE\n");

        for(int i=1 ; i<=pageNumber ; i++){
            String pageUrl = siteUrl + "/page/" + i;

            try {
                URL url = new URL(pageUrl);

                Document doc = Jsoup.parse(url, 5000);

                Elements elements = doc.select("h2[class=kratos-entry-title-new] > a");

                for(Element element:elements){
                    String link = element.attr("href");

                    URL bookUrl = new URL(link);

                    Document bookPage = Jsoup.parse(bookUrl,5000);

                    Elements downloads= bookPage.select("a:contains(点击下载)");

                    for(Element ele : downloads){
                        String downloadLink = ele.attr("href");

                        URL downloadUrl = new URL(downloadLink);

                        Document downloadPage = Jsoup.parse(downloadUrl,5000);

                        Elements baidu = downloadPage.select("a:contains(百度网盘)");

                        String baiduLink = baidu.attr("href");

                        Element code = downloadPage.selectFirst("font");

                        String baiduCode = code.text();

                        String id = String.valueOf(info.size() + 1);

                        info.add(id + " , " + baiduLink + " , " + baiduCode);
                    }
                }
            }

            catch (SocketTimeoutException e){
                System.out.println("Page" + i + "fail");
            }

            for (String entry : info) {
                fileWriter.write(entry + "\n");
            }
        }

        fileWriter.close();
    }

}

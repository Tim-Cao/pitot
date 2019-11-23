package com.liferay.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;
import java.util.concurrent.TimeUnit;

public class DownloadSelenium {
    public static void main(String args[]) throws InterruptedException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url =
                "jdbc:mysql://0.0.0.0:7306/download?useUnicode=true&characterEncoding=UTF-8&useFastDateParsing=false";

        String username = "root";

        String password = "";

        System.setProperty("webdriver.chrome.driver","/Users/macbook/Downloads/chromedriver");

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Info;");

        WebDriver selenium = new ChromeDriver();

        while(resultSet.next()) {
            String baiduLink = resultSet.getString("URL");

            String code = resultSet.getString("CODE");

            selenium.get(baiduLink);

            selenium.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            while(selenium.findElements(By.xpath(
                    "//a[contains(@title,'提取文件')]")).size() == 0){
                selenium.get(baiduLink);
            }

            selenium.findElement(
                    By.xpath("//div[contains(@class,'verify-input') and *[contains(.,'请输入提取码')]]//input")).
                    sendKeys(code);

            selenium.findElement(By.xpath("//a[contains(@title,'提取文件')]")).click();

            Thread.sleep(2000);

            selenium.switchTo().newWindow(WindowType.fromString("tab"));
        }
        Thread.sleep(20000);

        connection.close();

        selenium.quit();
    }

}

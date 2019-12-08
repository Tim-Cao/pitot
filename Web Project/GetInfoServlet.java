public class GetInfoServlet extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String startPageValue = request.getParameter("startPage");
      
      try{
        int startPage = Integer.parseInt(startPageValue);
        int endPage = Integer.parseInt(request.getParameter("endPage"));
      }
      catch (Exception e){
        System.out.println("Data type error!");
      }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
  
  RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
	rd.forward(request, response);
  request.setAttribute("bookInfos", bookInfos);
}

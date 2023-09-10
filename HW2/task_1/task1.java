package HW2.task_1;


public class task1 {
    public static void main(String[] args) throws Exception {
        String [] list = lib.ReadLineFromFile("dataForSelect.txt"); 
        System.out.println(list[0]); 
        // select * from students where name='Ivanov' and country='Russia' and city='Moscow'
        StringBuilder resultSelect = LineInList(list[0]); 
        System.out.println(resultSelect);
      }
      public static StringBuilder LineInList(String line) {
          String line1 = line.replace("{", "").replace("}", "").replace("\"", "");          
          System.out.println(line1);
          StringBuilder result = new StringBuilder("select * from students where ");
  
          String [] arrayData = line1.split(", ");
          for (int i = 0; i < arrayData.length; i++) {
              String[] arrData = arrayData[i].split(":");
              if(!arrData[1].strip().equals("null")) {
                      if(i > 0) result.append(" and ");
                      result.append(arrData[0]);
                      result.append("=");
                      result.append("'" + arrData[1].strip() + "'");
              }
              
          }
          return result;
      }
}

package lesson6_hw;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/** Создать множество ноутбуков. */
public class Shop { 
    
       private static Set<Notebook> sales=new HashSet<>();
       
    public static void main(String[] args) {
        sales.add(new Notebook("ASUS","VivoBook 17 X705MA-BX163",17.3,"1600 x 900","Intel",1100,8,256,"Linux","серый",1687));
        sales.add(new Notebook("HP","ProBook 455 G8 32R76EA",15.6,"1920 x 1080","AMD",1900,32,512,"Windows 10 Pro","серебристый",3497));
        sales.add(new Notebook("Lenovo","Legion 5 Pro 16ACH6H 82JQ000PRK",16.0,"2560 x 1600","AMD",3300,16,512,"без ОС","серый",4495));
        sales.add(new Notebook("HP","250 G8 27K11EA",15.6,"1366 x 768","Intel",1100,4,1000,"без ОС","темно-серый",949));
        sales.add(new Notebook("HP","250 G8 3V5F7EA",15.6,"1920 x 1080","Intel",1100,8,256,"без ОС","темно-серый",1385));
        sales.add(new Notebook("Lenovo","Legion 5 Pro 16ACH6H 82JQ00HARU",16.0,"2560 x 1600","AMD",3200,32,1024,"Windows 11","серый",4700));
        sales.add(new Notebook("Lenovo","IdeaPad 1 11ADA05 82GV003SRK",11.6,"1366 x 768","AMD",1200,4,128,"без ОС","серый",1078));
        sales.add(new Notebook("Hyundai","HyBook HT14CCIC44EGP",14.1,"1366 x 768","Intel",1100,4,128,"Windows 10","серый",899));
        sales.add(new Notebook("Acer","Aspire 1 A114-33-P7VD NX.A7VER.00A",14.0,"1366 x 768","Intel",1100,8,128,"Linux","серебристый",1389));
        sales.add(new Notebook("Apple","Macbook Air 13 M2 2022 MLY33",13.6,"2560 x 1664","Apple M2",3200,8,256,"Mac OS","темно-синий",3765));
        sales.add(new Notebook("MSI","Modern 14 C11M-019XBY",14.0,"1920 x 1080","Intel",3000,8,256,"без ОС","серебристый",2050));
        sales.add(new Notebook("MSI","GF63 Thin 10SCXR-222US",15.6,"1920 x 1080","Intel",2500,8,256,"Windows 10","черный",2144)); 
        user();
    }

/** просмотр доступных значений из сортированого списка */
public static void getAvaible(String key,Set<Notebook> list) {
   System.out.println("Доступные варианты");
   Set<Object> linked = new TreeSet<>();
   for (Notebook val : list) {
      linked.add(showValues(key, val));
   }
   System.out.println(linked);
}
/**получить значение по ключу */
private static Object showValues(String key,Notebook name){
   Object result=null;
   switch (key) {
      case ("dispSize"):result=name.getDispSize();break;
      case ("resolution"):result=name.getResolution();break;
      case ("cpuManu"):result=name.getCpuManu();break;
      case ("cpuFreq"):result=name.getCpuFreq();break;
      case ("ram"):result=name.getram();break;
      case ("driveSize"):result=name.getDriveSize();break;
      case ("system"):result=name.getSystem();break;
      case ("price"):result=name.getPrice();break;
      case ("brand"):result=name.getBrand();break;
      default:
         break;
   }
   return result;
}

public static void user() {
   Set<Notebook> resultNotebooks=new LinkedHashSet<>();
   resultNotebooks.addAll(sales);
   Set<Notebook> temp=new LinkedHashSet<>();
    Map<String,Object> filter = new HashMap<>();
    String info = 
    "0. Показать результат\n"
    +"1. Производитель\n"
    +"2. Диагональ\n"
    +"3. Разрешение\n"
    +"4. Производитель CPU\n"
    +"5. Частота CPU\n"
    +"6. Объем ОЗУ\n"
    +"7. Объем диска\n"
    +"8. Операционная система\n"
    +"9. Цена \t q для выхода";    
    String[] substr=info.split("\n"); // для удобства вывода подсказки    
    Scanner sc=new Scanner(System.in);
    String  selector = null;

    while (true) {
       for (int i = 0; i < substr.length; i++) {
          System.out.printf("%-25s %s %n", substr[i], substr[++i]);
       }
       
       selector = sc.next();

       if (selector.equalsIgnoreCase("q")) {
          return;
       }

       chooseFilter(selector, filter, resultNotebooks);
       for (Map.Entry<String, Object> current : filter.entrySet()) {

          String key = current.getKey();
          Object filterValue = current.getValue();
          Object value = null;

          for (Notebook element : resultNotebooks) {
             value = showValues(key, element);
             if (identicalValues(value, filterValue)) {
                temp.add(element);
             }
          }
          resultNotebooks.clear();
          resultNotebooks.addAll(temp);
          temp.clear();
       }
    }
}

/** проверка на идентичность */
private static boolean identicalValues(Object valProduct,Object valFilter){  
   if (valProduct instanceof Integer) {
      int temp = Integer.parseInt(valFilter.toString());
      return ((int) valProduct >= temp);
   }

   if (valProduct instanceof Double) {
      double temp = Double.parseDouble(valFilter.toString());
      return ((double) valProduct >= temp);
   }

   if ((valProduct.toString()).equalsIgnoreCase(valFilter.toString())) {
      return true;
   }

   return false;
}

/**запрос минимальных значений для указанных критериев - сохранить параметры фильтрации можно также в Map. */
private static void chooseFilter(String input, Map<String, Object> memory,Set<Notebook> userList) {
   String key = null;
   Object value = null;
   switch (input) {
      case ("1"): key = "brand"; break;   
      case ("2"): key = "dispSize";  break;
      case ("3"): key = "resolution"; break;
      case ("4"): key = "cpuManu"; break;
      case ("5"): key = "cpuFreq"; break;
      case ("6"): key = "ram"; break;
      case ("7"): key = "driveSize"; break;
      case ("8"): key = "system"; break;
      case ("9"): key = "price"; break;
      case ("0"): System.out.println(userList); return;
      default: break;
   }
   getAvaible(key,userList);
   Scanner setValue = new Scanner(System.in);
   value = setValue.nextLine();
   memory.put(key,value);
  
}

}


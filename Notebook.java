public class Notebook {
    
    String name_model;
    String OS;
    Double CPU;
    int RAM;
    int VC; 
    int HDD; 
    String color;
    int price;

    public void info() {
        System.out.println();
        System.out.printf("Название модели: %s \n", name_model);
        System.out.printf("Операционная система %s \n", OS);
        System.out.printf("Процессор: %s Gz\n", CPU);
        System.out.printf("Оперативная память: %d Gb \n", RAM);
        System.out.printf("Видеокарта: %s Gb\n", VC);
        System.out.printf("Жесткий диск: %d Gb \n", HDD);
        System.out.printf("Цвет: %s \n", color);
        System.out.printf("Цена: %d тугриков \n", price);
    }

    public boolean equals(Object o) {
        Notebook t = (Notebook) o;
        return CPU >= t.CPU && RAM >= t.RAM && VC >= t.VC && HDD >= t.HDD;
    }
}

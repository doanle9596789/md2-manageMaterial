import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        materials[0] = new CrispyFlour("1", "bột mì", LocalDate.of(2012, 12, 24), 25, 2);
        materials[1] = new CrispyFlour("2", "bột gao", LocalDate.of(2022, 12, 23), 23, 6);
        materials[2] = new CrispyFlour("3", "bột đậu", LocalDate.of(2021, 12, 22), 26, 8);
        materials[3] = new CrispyFlour("4", "bột khoai", LocalDate.of(2012, 10, 22), 27, 8);
        materials[4] = new CrispyFlour("5", "bột gạo nếp", LocalDate.of(2011, 5, 3), 28, 5);
        materials[5] = new Meat("6", "lợn", LocalDate.now(), 50, 1);
        materials[6] = new Meat("7", "gà", LocalDate.now(), 60, 1);
        materials[7] = new Meat("8", "ngan", LocalDate.now(), 70, 1);
        materials[8] = new Meat("9", "vịt", LocalDate.now(), 80, 1);
        materials[9] = new Meat("10", "bò", LocalDate.now(), 90, 1);
        System.out.println("sản phẩm có trong kho là;");
        for (Material k : materials
        ) {
            System.out.println(k.toString());
        }

    }
//    public static LocalDate expirationdate(Material[]materials){
//        for (Material k:materials
//             ) {
//
//        }
//    }

}

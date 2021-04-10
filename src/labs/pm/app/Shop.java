/*
 * Copyright (C) 2021 carlosdeltoro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} clase que representa el incio
 *
 * @version 4.0
 * @author carlosdeltoro
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ProductManager pm = new ProductManager(Locale.US);
        pm.createProduct(101, "tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);

//tambien se puede crear de esta manera.
        pm.printProductReport(101);
        pm.reviewProduct(101, Rating.NOT_RATED, "comantario tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "comantario tea1");
        pm.reviewProduct(101, Rating.FOUR_STAR, "comantario 2");
        pm.reviewProduct(101, Rating.FOUR_STAR, "comantario 3");
        pm.reviewProduct(101, Rating.FIVE_STAR, "comantario 4");
        pm.reviewProduct(101, Rating.THREE_STAR, "comantario 5");
        pm.printProductReport(101);

        Product p2 = pm.createProduct(101, "coffe", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "comantario coffe");
        p2 = pm.reviewProduct(p2, Rating.TWO_STAR, "comantario coffe1");
        p2 = pm.reviewProduct(p2, Rating.FOUR_STAR, "comantario coffe2");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(101, "Cake", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p3 = pm.reviewProduct(p3, Rating.THREE_STAR, "comantario Cake");
        p3 = pm.reviewProduct(p3, Rating.TWO_STAR, "comantario Cake 1");
        p3 = pm.reviewProduct(p3, Rating.FOUR_STAR, "comantario Cake2");
        pm.printProductReport(p3);

        Product p4 = pm.createProduct(101, "Cookie", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "comantario Cookie");
        p4 = pm.reviewProduct(p4, Rating.TWO_STAR, "comantario Cookie 1");
        p4 = pm.reviewProduct(p4, Rating.FOUR_STAR, "comantario Cookie 2");
        pm.printProductReport(p4);

//        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "EXCELENTE ");
//        pm.printProductReport();
//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        System.out.println(p6.equals(p7));
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//        
//        System.out.println(p3.getBestBefore());
//        System.out.println(p2.getBestBefore());
//        
//        if(p3 instanceof Food){
//            LocalDate bestBefore= ((Food)p3).getBestBefore();
//        }
        //p1.setId(101);
        //p1.setName("tea");
        //p1.setPrice(BigDecimal.valueOf(1.99));
//        System.out.println(p1.getId() +" "+p1.getName()+" " +p1.getDiscount()
//        +" "+p1.getRating().getStars());
//        System.out.println(p2.getId() +" "+p2.getName()+" " +p2.getDiscount()
//        +" "+p2.getRating().getStars());
//        System.out.println(p3.getId() +" "+p3.getName()+" " +p3.getDiscount()
//        +" "+p3.getRating().getStars());
//        System.out.println(p4.getId() +" "+p4.getName()+" " +p4.getDiscount()
//        +" "+p4.getRating().getStars());
//        System.out.println(p5.getId() +" "+p5.getName()+" " +p5.getDiscount()
//        +" "+p5.getRating().getStars());
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
//        
    }

}

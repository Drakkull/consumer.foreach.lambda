package engine;

import entities.PriceUpdate;
import entities.Product;
import entities.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            List<Product> list = new ArrayList<>();

            list.add(new Product("TV", 900.00));
            list.add(new Product("Vibrator", 40.00));
            list.add(new Product("PC", 4444.00));
            list.add(new Product("Toy", 25.00));

          List<String> names= list.stream().map(new UpperCaseName()).collect(Collectors.toList());

          names.forEach(System.out::println);



        }

    }

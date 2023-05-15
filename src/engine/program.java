package engine;

import entities.PriceUpdate;
import entities.Product;
import entities.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            List<Product> list = new ArrayList<>();

            list.add(new Product("TV", 900.00));
            list.add(new Product("Vibrator", 40.00));
            list.add(new Product("PC", 4444.00));
            list.add(new Product("Toy", 25.00));

            //Deleting this one down below
            //Function<Product, String> func = p -> p.getName().toUpperCase();
            //Copying the "func" and turning it into a lambda inline expression inside map ()
            List<String> names= list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

          names.forEach(System.out::println);



        }

    }

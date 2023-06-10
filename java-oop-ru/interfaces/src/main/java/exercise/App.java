package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n){
        return homes.stream()
                .sorted((h1, h2) -> h1.compareTo(h2)) // Comparator.comparing(Home::getArea)) // Home::compareTo
                .limit(n)
                .map(Home::toString)// преобразование из хоум в стринг //  мап в первую очередь сопоставляет что было и то будет после мапы . Мапинг это сопотавление объектов.
                .collect(Collectors.toList());

       // homes.sort(Comparator.comparing(Home::getArea));


    }
}
// END
// сортет говорит что делать , метод сорт не знает как сравнивать два объекта
// компаратор говорит как делать , методу нужна информация как сравнивать объекты
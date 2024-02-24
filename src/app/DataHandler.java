package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class DataHandler {

    public String handleData(List<User> list) {

        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();

        Stream<User> allData = list.stream();
        Stream<User> filteredData = allData.filter(user ->
                user.getEmail().contains("123"));

        filteredData.forEach(user ->
                sb.append(count.getAndIncrement())
                        .append(")").append(user)
                        .append("\n"));

        return sb.toString();
    }
}

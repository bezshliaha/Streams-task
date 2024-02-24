package app;

import java.util.Arrays;
import java.util.List;

public class DataProvider {

    public List<User> getData() {
        return Arrays.asList(
                new User("Nikolay", "Nik123@gmail.com"),
                new User("Marina", "123Mar@gmail.com"),
                new User("Emilia", "Emi123@gmail.com"),
                new User("Eugene", "Eug767@gmail.com"),
                new User("Elena", "Ele345@gmail.com")
        );
    }
}

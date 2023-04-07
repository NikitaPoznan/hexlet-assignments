package exercise;

import java.util.List;

// BEGIN
class App {
    private final static List<String> FREE_DOMAINS = List.of("gmail.com","yandex.ru" , "hotmail.com");

    public static long getCountOfFreeEmails(List<String> emails){

        return emails.stream()
                .map(email -> email.split("@")[1])
                .filter(dom -> FREE_DOMAINS.contains(dom))
                .count();

    }
    public static long getCountOfFreeEmails1(List<String> emails){

        int result = 0;
        for (String email : emails) {
            String dom = email.split("@")[1];
            if (FREE_DOMAINS.contains(dom)) {
                result ++;
            }
        }
        return result;
    }

}
// END



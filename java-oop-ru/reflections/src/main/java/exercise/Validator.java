package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for(Field field : fields) {
            field.setAccessible(true);
            try{
                if(field.isAnnotationPresent(NotNull.class) && (field.get(address) == null)) {
                    result.add(field.getName());
                }
                } catch(IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return result;

    }
}
// END

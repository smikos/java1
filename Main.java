import java.util.HashMap;

public class Main{


public static void main(final String[] args) {
var dict = new HashMap<String, String>();
dict.put("88001124333", "Дмитрий Смирнов");
dict.put("88001665333", "Иван Максимов");
dict.put("88001116333", "Иван Максимов");
dict.put("88001127432", "Иван Лютый");
dict.put("88001118453", "Сергей Краснов");
dict.put("88001638145", "Сергей Краснов");
dict.put("88001425214", "Сергей Максимов");
dict.put("88001423215", "Сергей Максимов");
dict.put("88001422216", "Сергей Максимов");
dict.put("88001231374", "Михаил Лютый");

var a = get(dict);

a.entrySet().stream()
.sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
.forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
}

public static HashMap<String, Integer> get(HashMap<String, String> dict){
var result = new HashMap<String, Integer>();
for (var item : dict.entrySet()) {
if (result.containsKey(item.getValue())) {
var key = item.getValue();
var value = result.get(item.getValue());
result.replace(key, value + 1);
} else {
result.put(item.getValue(), 1);
}
}
return result;
}
}

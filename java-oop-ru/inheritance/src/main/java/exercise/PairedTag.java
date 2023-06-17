package exercise;

import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    private String body;
    private List<Tag> children;

    public String toString() {
        String name = getName();
        String attributes = makeAttributes();
        String value = children.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(""));
        return String.format("<%s%s>%s%s</%s>", name, attributes, body, value, name);
    }
}
// END

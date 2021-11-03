public class LombokBuilderIssue {

    public static void main(String[] args) {
        Record.builder().field(1).build();
    }
}

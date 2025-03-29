class MicroBlog {
    public static void main(String[] args) {
        MicroBlog blog = new MicroBlog();
        System.out.println(blog.truncate("What I cannot create, I do not understand."));
        System.out.println(blog.truncate("Eschew obfuscation, espouse elucidation."));
        System.out.println(blog.truncate("Short"));
        System.out.println(blog.truncate("So long and thanks for all the fish"));
    }
    public String truncate(String input) {
        return input.length() <= 5 ? input : input.substring(0, input.offsetByCodePoints(0, 5));
    }
}

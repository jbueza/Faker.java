package com.github.jbueza.Faker.Generators;

import java.util.Random;

public class LoremIpsumGenerator {

    protected String standard = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private String[] words = {"a", "ac", "accumsan", "ad", "adipiscing", "aenean", "aliquam", "aliquet", "amet", "ante", "aptent", "arcu", "at", "auctor", "augue", "bibendum", "blandit", "class", "commodo", "condimentum", "congue", "consectetur", "consequat", "conubia", "convallis", "cras", "cubilia", "cum", "curabitur", "curae", "cursus", "dapibus", "diam", "dictum", "dictumst", "dignissim", "dis", "dolor", "donec", "dui", "duis", "egestas", "eget", "eleifend", "elementum", "elit", "enim", "erat", "eros", "est", "et", "etiam", "eu", "euismod", "facilisi", "facilisis", "fames", "faucibus", "felis", "fermentum", "feugiat", "fringilla", "fusce", "gravida", "habitant", "habitasse", "hac", "hendrerit", "himenaeos", "iaculis", "id", "imperdiet", "in", "inceptos", "integer", "interdum", "ipsum", "justo", "lacinia", "lacus", "laoreet", "lectus", "leo", "libero", "ligula", "litora", "lobortis", "lorem", "luctus", "maecenas", "magna", "magnis", "malesuada", "massa", "mattis", "mauris", "metus", "mi", "molestie", "mollis", "montes", "morbi", "mus", "nam", "nascetur", "natoque", "nec", "neque", "netus", "nibh", "nisi", "nisl", "non", "nostra", "nulla", "nullam", "nunc", "odio", "orci", "ornare", "parturient", "pellentesque", "penatibus", "per", "pharetra", "phasellus", "placerat", "platea", "porta", "porttitor", "posuere", "potenti", "praesent", "pretium", "primis", "proin", "pulvinar", "purus", "quam", "quis", "quisque", "rhoncus", "ridiculus", "risus", "rutrum", "sagittis", "sapien", "scelerisque", "sed", "sem", "semper", "senectus", "sit", "sociis", "sociosqu", "sodales", "sollicitudin", "suscipit", "suspendisse", "taciti", "tellus", "tempor", "tempus", "tincidunt", "torquent", "tortor", "tristique", "turpis", "ullamcorper", "ultrices", "ultricies", "urna", "ut", "varius", "vehicula", "vel", "velit", "venenatis", "vestibulum", "vitae", "vivamus", "viverra", "volutpat", "vulputate"};

    private String[] punctuation = {".", "?"};
    private String _n = System.getProperty("line.separator");
    private Random random = new Random();

    public String randomWord() {
        return words[random.nextInt(words.length - 1)];
    }

    public String randomPunctuation() {
        return punctuation[random.nextInt(punctuation.length - 1)];
    }

    public String words(int count) {
        StringBuilder s = new StringBuilder();
        while (count-- > 0)
            s.append(randomWord()).append(" ");
        return s.toString().trim();
    }

    public String sentenceFragment() {
        return words(random.nextInt(10) + 3);
    }

    public String sentence() {
        String w = randomWord();
        StringBuilder s = new StringBuilder(w.substring(0, 1).toUpperCase())
                .append(w.substring(1)).append(" ");

        if (random.nextBoolean()) {
            int r = random.nextInt(3) + 1;
            for (int i = 0; i < r; i++)
                s.append(sentenceFragment()).append(", ");
        }
        return s.append(sentenceFragment()).append(randomPunctuation())
                .toString();
    }

    public String sentences(int count) {
        StringBuilder s = new StringBuilder();
        while (count-- > 0)
            s.append(sentence()).append("  ");
        return s.toString().trim();
    }

    public String paragraph(boolean useStandard) {
        return useStandard ? standard : sentences(random.nextInt(3) + 2);
    }

    public String paragraph() {
        return paragraph(false);
    }

    public String paragraphs(int count, boolean useStandard) {
        StringBuilder s = new StringBuilder();
        while (count-- > 0) {
            s.append(paragraph(useStandard)).append(_n).append(_n);
            useStandard = false;
        }
        return s.toString().trim();
    }

    public String paragraphs(int count) {
        return paragraphs(count, false);
    }
}

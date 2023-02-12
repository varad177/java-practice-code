class pattern {
    public static void main(String[] args) {
        int k, l;
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j > i; j--)
                System.out.print(" ");

            for (k = 65; k <= 65 + i; k++)

                System.out.print((char) (k));

            for (l = k - 1; l > 65; l--)

                System.out.print((char) (l - 1));
            System.out.println();

        }
    }
}
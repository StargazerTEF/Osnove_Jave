package p18_09_2023.Zadatak1;

    public abstract class PlatnaKartica {
        protected double sum;
        protected String cardNumber;
        protected int year;
        protected int month;

        public PlatnaKartica(double sum, String cardNumber, int year, int month) {
            this.sum = sum;
            this.cardNumber = cardNumber;
            this.year = year;
            this.month = month;
        }

        public void dodajSredstva(double vrednost) {
            this.sum += vrednost;
        }

        public abstract void izvrsiTransakciju(double vrednost);

        public abstract void print();

        public double getSum() {
            return sum;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }
    }

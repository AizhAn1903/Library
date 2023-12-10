public class Library {
        private String name;
        private String author;

        private Integer id;
        public Library(String name, String author, Integer id) {
            this.name = name;
            this.author = author;

            this.id = id;

        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }


        public Integer getId() {
            return id;
        }



        @Override
        public String toString() {
            return "id: "+id+ " "+ name +" "+"("+ author +")" ;
        }
}

public class Library {
        private String name;
        private String author;
        private Boolean status;
        private Integer id;
        public Library(String name, String author, Boolean status, Integer id) {
            this.name = name;
            this.author = author;
            this.status = status;
            this.id = id;

        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public Boolean getStatus() {
            return status;
        }


        public Integer getId() {
            return id;
        }



        @Override
        public String toString() {
            return "id: "+id+ " "+ name +" "+"("+ author +")"+ " статус " + status;
        }
}

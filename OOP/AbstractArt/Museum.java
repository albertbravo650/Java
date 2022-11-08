public class Museum {
    public static void main(String[] args) {
        Painting painting1 = new Painting("first one", "Dave Chapelle", "A painting by Dave Chapelle", "Oil");
        Painting painting2 = new Painting("seconddd one", "Bob Ross", "A painting by Bob Ross", "Acrylic");
        Painting painting3 = new Painting("thirddd", "Joe Rogan", "A painting by Joe Rogan", "Water Color");
        Sculpture sculpture1 = new Sculpture("first sculp", "Elon Musk", "A sculpture by Elon Musk", "Marble");
        Sculpture sculpture2 = new Sculpture("second sculp", "Lana Del Rey", "A sculpture by Lana", "Porcelain");
        

        painting1.viewArt();
        sculpture1.viewArt();
    }
}
public class VorontsovGeorgii {
    public static int obj_cnt;

    public VorontsovGeorgii() {
        obj_cnt += 1;
        System.out.printf("There already are %d objects%n", obj_cnt);
    }

    public static void main(String[] args) {
        VorontsovGeorgii o1 = new VorontsovGeorgii();
        VorontsovGeorgii o2 = new VorontsovGeorgii();
        VorontsovGeorgii o3 = new VorontsovGeorgii();
    }
}

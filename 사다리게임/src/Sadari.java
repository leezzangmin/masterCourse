public class Sadari {
    private int[][] sadari;

    Sadari(int userNumber, int sadariNumber){
        sadari = new int[sadariNumber][userNumber-1];
        generateRandomSadari();
    }

    private void generateRandomSadari(){
        for(int i = 0; i < sadari.length; i++){
            for(int j = 0; j < sadari[0].length; j++){
                sadari[i][j] = Math.random() > 0.5 ? 0 : 1 ;
            }
        }
    }

    public int[][] getSadari(){
        return sadari;
    }

}

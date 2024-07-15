// Nama : Ricky Wijaya\
// NIM : 18222043
// Praktikum : 1
// Tanggal : 26 Februari 2024
// Deskripsi : Hide n Seek

public class HideNSeek {
    private String seeker;
    private int player;
    private int playerFound;

    /**
    * HideNSeek constructor
    * @param seeker
    * @param player
    * /
    */
    public HideNSeek(String seeker, int player) {
        this.seeker = seeker;
        this.player = player;
    }

    /**
     * getSeeker
     * @return seeker
     */
    public String getSeeker() {
        return seeker;
    }

    /**
     * getPlayer
     * @return player
     */
    public int getPlayer() {
        return player;
    }

    /**
     * getPlayerFound
     * @return playerFound
     */
    public int getPlayerFound() {
        return playerFound;
    }

    /**
     * Menambahkan playerFound sebanyak 1
     * dengan syarat masih ada player yang belum ditemukan
     * @return void
     */
    public void foundPlayer() {
        if (playerFound < getPlayer()){
            playerFound += 1;
        } 
        
    }
}
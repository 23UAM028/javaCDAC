import java.sql.*;
import java.util.Scanner;

public class Music {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n---/ Music Management Menu /---");
            System.out.println("1. Add Artist");
            System.out.println("2. Add Album");
            System.out.println("3. Add Track");
            System.out.println("4. Show All Artists");
            System.out.println("5. Show All Albums");
            System.out.println("6. Show All Tracks");
            System.out.println("7. Show Tracks by Artist ID");
            System.out.println("8. Show Tracks by Album ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter artist ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter artist name: ");
                    String aname = sc.nextLine();

                    Connection con1 = DBUtil.getConnection();
                    String sql1 = "INSERT INTO Artist VALUES (?, ?)";
                    PreparedStatement ps1 = con1.prepareStatement(sql1);
                    ps1.setInt(1, aid);
                    ps1.setString(2, aname);
                    ps1.executeUpdate();
                    System.out.println("Artist added.");
                    break;

                case 2:
                    System.out.print("Enter album ID: ");
                    int albId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter album title: ");
                    String albTitle = sc.nextLine();

                    Connection con2 = DBUtil.getConnection();
                    String sql2 = "INSERT INTO Album VALUES (?, ?)";
                    PreparedStatement ps2 = con2.prepareStatement(sql2);
                    ps2.setInt(1, albId);
                    ps2.setString(2, albTitle);
                    ps2.executeUpdate();
                    System.out.println("Album added.");
                    break;

                case 3:
                    System.out.print("Enter track ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter track title: ");
                    String ttitle = sc.nextLine();
                    System.out.print("Enter album ID: ");
                    int talbId = sc.nextInt();
                    System.out.print("Enter artist ID: ");
                    int tartId = sc.nextInt();

                    Connection con3 = DBUtil.getConnection();
                    String sql3 = "INSERT INTO Track VALUES (?, ?, ?, ?)";
                    PreparedStatement ps3 = con3.prepareStatement(sql3);
                    ps3.setInt(1, tid);
                    ps3.setString(2, ttitle);
                    ps3.setInt(3, talbId);
                    ps3.setInt(4, tartId);
                    ps3.executeUpdate();
                    System.out.println("Track added.");
                    break;

                case 4:
                    Connection con4 = DBUtil.getConnection();
                    Statement st4 = con4.createStatement();
                    ResultSet rs4 = st4.executeQuery("SELECT * FROM Artist");
                    System.out.println("Artists:");
                    while (rs4.next()) {
                        System.out.println(rs4.getInt(1) + " - " + rs4.getString(2));
                    }
                    break;

                case 5:
                    Connection con5 = DBUtil.getConnection();
                    Statement st5 = con5.createStatement();
                    ResultSet rs5 = st5.executeQuery("SELECT * FROM Album");
                    System.out.println("Albums:");
                    while (rs5.next()) {
                        System.out.println(rs5.getInt(1) + " - " + rs5.getString(2));
                    }
                    break;

                case 6:
                    Connection con6 = DBUtil.getConnection();
                    Statement st6 = con6.createStatement();
                    ResultSet rs6 = st6.executeQuery("SELECT * FROM Track");
                    System.out.println("Tracks:");
                    while (rs6.next()) {
                        System.out.println(rs6.getInt(1) + " - " + rs6.getString(2)
                                + " (Album: " + rs6.getInt(3) + ", Artist: " + rs6.getInt(4) + ")");
                    }
                    break;

                case 7:
                    System.out.print("Enter artist ID: ");
                    int artistId = sc.nextInt();
                    Connection con7 = DBUtil.getConnection();
                    PreparedStatement ps7 = con7.prepareStatement("SELECT * FROM Track WHERE artist_id = ?");
                    ps7.setInt(1, artistId);
                    ResultSet rs7 = ps7.executeQuery();
                    System.out.println("Tracks by Artist:");
                    while (rs7.next()) {
                        System.out.println(rs7.getInt(1) + " - " + rs7.getString(2));
                    }
                    break;

                case 8:
                    System.out.print("Enter album ID: ");
                    int albumId = sc.nextInt();
                    Connection con8 = DBUtil.getConnection();
                    PreparedStatement ps8 = con8.prepareStatement("SELECT * FROM Track WHERE album_id = ?");
                    ps8.setInt(1, albumId);
                    ResultSet rs8 = ps8.executeQuery();
                    System.out.println("Tracks in Album:");
                    while (rs8.next()) {
                        System.out.println(rs8.getInt(1) + " - " + rs8.getString(2));
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}

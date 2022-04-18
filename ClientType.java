package edu.ucalgary.ensf409;
import java.sql.*;
/**
 * @author Alex Burn
 * @version 1.6
 */
enum ClientType {

    MALE {

        /**
         * @return int
         */
        public int toCalories() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Calories from daily_client_needs where Client = \"Adult Male\"";
            ResultSet rs = line2.executeQuery(Query1);
            int Calor = 0;
            while (rs.next()) {
                Calor = rs.getInt("Calories");
            }
            makeConnection().close();
            return Calor;
        }
        /**
         * @return int
         */

        public int toWholeGrain() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select WholeGrains from daily_client_needs where Client = \"Adult Male\"";
            ResultSet rs = line2.executeQuery(Query1);
            int WholeGrain = 0;
            while (rs.next()) {
                WholeGrain = rs.getInt("WholeGrains");
            }
            makeConnection().close();
            return WholeGrain * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toProtein() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Protein from daily_client_needs where Client = \"Adult Male\"";
            ResultSet rs = line2.executeQuery(Query1);
            int protien = 0;
            while (rs.next()) {
                protien = rs.getInt("Protein");
            }
            makeConnection().close();
            return protien * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toOther() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Other from daily_client_needs where Client = \"Adult Male\"";
            ResultSet rs = line2.executeQuery(Query1);
            int other = 0;
            while (rs.next()) {
                other = rs.getInt("Other");
            }
            makeConnection().close();
            return other * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toFruitAndVeggies() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select FruitVeggies from daily_client_needs where Client = \"Adult Male\"";
            ResultSet rs = line2.executeQuery(Query1);
            int FV = 0;
            while (rs.next()) {
                FV = rs.getInt("FruitVeggies");
            }
            makeConnection().close();
            return FV * toCalories() / 100;
        }

    },
    FEMALE {
        /**
         * @return int
         */
        public int toCalories() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Calories from daily_client_needs where Client = \"Adult Female\"";
            ResultSet rs = line2.executeQuery(Query1);
            int Calor = 0;
            while (rs.next()) {
                Calor = rs.getInt("Calories");
            }
            makeConnection().close();
            return Calor;
        }
        /**
         * @return int
         */

        public int toWholeGrain() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select WholeGrains from daily_client_needs where Client = \"Adult Female\"";
            ResultSet rs = line2.executeQuery(Query1);
            int WholeGrain = 0;
            while (rs.next()) {
                WholeGrain = rs.getInt("WholeGrains");
            }
            makeConnection().close();
            return WholeGrain * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toProtein() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Protein from daily_client_needs where Client = \"Adult Female\"";
            ResultSet rs = line2.executeQuery(Query1);
            int protien = 0;
            while (rs.next()) {
                protien = rs.getInt("Protein");
            }
            makeConnection().close();
            return protien * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toOther() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Other from daily_client_needs where Client = \"Adult Female\"";
            ResultSet rs = line2.executeQuery(Query1);
            int other = 0;
            while (rs.next()) {
                other = rs.getInt("Other");
            }
            makeConnection().close();
            return other * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toFruitAndVeggies() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select FruitVeggies from daily_client_needs where Client = \"Adult Female\"";
            ResultSet rs = line2.executeQuery(Query1);
            int FV = 0;
            while (rs.next()) {
                FV = rs.getInt("FruitVeggies");
            }
            makeConnection().close();
            return FV * toCalories() / 100;
        }
    },
    CHILDU8 {
        /**
         * @return int
         */
        public int toCalories() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Calories from daily_client_needs where Client = \"Child under 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int Calor = 0;
            while (rs.next()) {
                Calor = rs.getInt("Calories");
            }
            makeConnection().close();
            return Calor;
        }
        /**
         * @return int
         */

        public int toWholeGrain() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select WholeGrains from daily_client_needs where Client = \"Child under 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int WholeGrain = 0;
            while (rs.next()) {
                WholeGrain = rs.getInt("WholeGrains");
            }
            makeConnection().close();
            return WholeGrain * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toProtein() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Protein from daily_client_needs where Client = \"Child under 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int protien = 0;
            while (rs.next()) {
                protien = rs.getInt("Protein");
            }
            makeConnection().close();
            return protien * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toOther() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Other from daily_client_needs where Client = \"Child under 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int other = 0;
            while (rs.next()) {
                other = rs.getInt("Other");
            }
            makeConnection().close();
            return other * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toFruitAndVeggies() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select FruitVeggies from daily_client_needs where Client = \"Child under 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int FV = 0;
            while (rs.next()) {
                FV = rs.getInt("FruitVeggies");
            }
            makeConnection().close();
            return FV * toCalories() / 100;
        }
    },
    CHILDO8 {
        /**
         * @return int
         */
        public int toCalories() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Calories from daily_client_needs where Client = \"Child over 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int Calor = 0;
            while (rs.next()) {
                Calor = rs.getInt("Calories");
            }
            makeConnection().close();
            return Calor;
        }
        /**
         * @return int
         */

        public int toWholeGrain() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select WholeGrains from daily_client_needs where Client = \"Child over 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int WholeGrain = 0;
            while (rs.next()) {
                WholeGrain = rs.getInt("WholeGrains");
            }
            makeConnection().close();
            return WholeGrain * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toProtein() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Protein from daily_client_needs where Client = \"Child over 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int protien = 0;
            while (rs.next()) {
                protien = rs.getInt("Protein");
            }
            makeConnection().close();
            return protien * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toOther() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select Other from daily_client_needs where Client = \"Child over 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int other = 0;
            while (rs.next()) {
                other = rs.getInt("Other");
            }
            makeConnection().close();
            return other * toCalories() / 100;
        }
        /**
         * @return int
         */

        public int toFruitAndVeggies() throws SQLException {
            Statement line2 = makeConnection().createStatement();
            String Query1 = " Select FruitVeggies from daily_client_needs where Client = \"Child over 8\"";
            ResultSet rs = line2.executeQuery(Query1);
            int FV = 0;
            while (rs.next()) {
                FV = rs.getInt("FruitVeggies");
            }
            makeConnection().close();
            return FV * toCalories() / 100;
        }
    };

    // abstract classes.
    public abstract int toFruitAndVeggies() throws SQLException;

    public abstract int toCalories() throws SQLException;

    public abstract int toOther() throws SQLException;

    public abstract int toWholeGrain() throws SQLException;

    public abstract int toProtein() throws SQLException;

    /**
     * 
     * @return Connection
     * @throws SQLException
     */
    public Connection makeConnection() throws SQLException {

        Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost/food_inventory", "student",
                "esnf");
        Statement line = myConnection.createStatement();
        String Query = "use food_inventory";
        ResultSet rs = line.executeQuery(Query);

        return myConnection;

    }

    public static void main(String[] args) throws SQLException {
        ClientType c = ClientType.MALE;
        ClientType c1 = ClientType.FEMALE;
        int value = c.toWholeGrain();
        int value1 = c1.toCalories();

        System.out.println(value);
        System.out.println(value1);

    }

}

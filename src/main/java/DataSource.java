public class DataSource {


     static {
         String configFile = "database.properties";

    }
    DataSource() {}

  /*  public ArrayList<Classes.User>getAllUser() throws SQLException
    {
        String SQL_QUERY = String.format("SELECT * FROM public.\"users\";");
        ArrayList users=null;
        try (Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement( SQL_QUERY );
             ResultSet rs = pst.executeQuery();) {
            users = new ArrayList<>();
            Classes.User user;
            while ( rs.next() ){
                user=new Classes.User();
                user.setUser_id(rs.getInt( "user_id" ) );
                user.setUser_name(rs.getString( "user_name" ) );
                user.setRole_id(rs.getInt( "role_id" ) );
                user.setAge(rs.getInt( "Age" ) );
                users.add(user);
            }

        }


        return users;
    }*/
/*
    public ArrayList<> getAllDataRoboCar() {
        String SQL__QUERY = String.format("SELECT * FROM public.\"users\";");
        ArrayList robotsCar = null;

        try {
            Connection con = this.getConnection();

            try {
                PreparedStatement pst = con.prepareStatement(SQL__QUERY);

                try {
                    ResultSet rs = pst.executeQuery();

                    try {
                        robotsCar = new ArrayList();

                        while(rs.next()) {
                            RoboCar robocar = new RoboCar();
                            robocar.setId(rs.getInt("id"));
                            robocar.setName(rs.getString("name"));
                            robocar.setPowerOfAccumulator(rs.getInt("powerOfAccumulator"));
                            robotsCar.add(robocar);
                        }
                    } catch (Throwable var11) {
                        if (rs != null) {
                            try {
                                rs.close();
                            } catch (Throwable var10) {
                                var11.addSuppressed(var10);
                            }
                        }

                        throw var11;
                    }

                    if (rs != null) {
                        rs.close();
                    }
                } catch (Throwable var12) {
                    if (pst != null) {
                        try {
                            pst.close();
                        } catch (Throwable var9) {
                            var12.addSuppressed(var9);
                        }
                    }

                    throw var12;
                }

                if (pst != null) {
                    pst.close();
                }
            } catch (Throwable var13) {
                if (con != null) {
                    try {
                        con.close();
                    } catch (Throwable var8) {
                        var13.addSuppressed(var8);
                    }
                }

                throw var13;
            }

            if (con != null) {
                con.close();
            }
        } catch (SQLException var14) {
            var14.printStackTrace();
        }

        return robotsCar;
    }*/
}
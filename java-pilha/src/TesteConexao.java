public class TesteConexao {
    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch(IllegalStateException ex){
            System.out.println("erro na execução");
        }

        //---------------------------------------------------

        /*Conexao con = null;
        try{
            con = new Conexao();
            con.leDados();
        }catch(IllegalStateException ex){
            System.out.println("erro na conexão");
        }finally{
            con.close();
        }*/
    }
}

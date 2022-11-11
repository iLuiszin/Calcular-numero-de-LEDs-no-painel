class Challenge {
    public static Integer calculaTotalLeds(Integer altura,Integer largura) {
      
      altura = altura + 1;
      largura = largura + 1;
      int vertices = 0;
      
      if(altura == 1 || largura == 1){
        
        vertices = 0;
        
      }else{
        vertices = altura*largura;
      }
      
      return vertices;
    }
  
}

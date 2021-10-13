
@Controleer
class HelloController{

  @RequestMapping("/greetings")
  public void greetings(){
    System.out.println("Hey, There");
  }
  
}

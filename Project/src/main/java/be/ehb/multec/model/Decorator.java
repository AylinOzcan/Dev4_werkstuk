package be.ehb.multec.model;

public abstract class Decorator extends Mask {
 protected Mask mask;
 protected Decorator(Mask mask){ this.mask = mask;}

 protected String getDescription(){
  String res = "";
  return res;
 }
}

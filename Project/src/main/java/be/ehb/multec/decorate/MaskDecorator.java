package be.ehb.multec.decorate;

public abstract class MaskDecorator extends Mask {
 protected Mask mask;

 protected MaskDecorator(Mask mask){
  this.mask = mask;
 }

 @Override
 protected double cost() {
  return mask.cost();
 }
}

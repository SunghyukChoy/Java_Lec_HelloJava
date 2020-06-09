interface AAA {}
interface BBB {}
interface CCC extends AAA, BBB { // 인터페이스 다중 상속 가능.
	
}
interface DDD {}
class EEE {}
class FFF extends EEE implements CCC, DDD {}
class GGG extends FFF {}
public class InterfaceTest2 {

}

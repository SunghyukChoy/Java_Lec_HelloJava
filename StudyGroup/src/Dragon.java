import java.util.Scanner;

public class Dragon {

	static String name;

	static int menu;

	static int night_Hp = 1000;

	static int dragon_Hp = 3000;

	static int turn = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(">>>>>>>>>> 용 죽이기 <<<<<<<<<<");

		System.out.println("1. 시작하기");

		System.out.println("2. 종료");

		switch (sc.nextInt()) {

		case 1:

			System.out.println("시작");

			start();

			break;

		case 2:

			System.out.println("종료");

			end();

			break;

		}

	}

	public static void start() {

		Scanner sc = new Scanner(System.in);

		System.out.println("서기 432, 발할라는  평화로운 땅이었다.");

		System.out.println("허나, 어느날 갑자기 찾아온 어둠.. 다름 아닌 용이었다.");

		System.out.println("대지는 불에타며, 물은 말라 없어졌으며, 사람들은 비명을 지르기 시작했다.");

		System.out.println("오.. 신이시여 우리를 구원해 주소서..");

		System.out.println("....");

		System.out.println("");

		System.out.println("");

		System.out.println("용사의 이름을 입력해주세요 : ");

		name = sc.next();

		if (name != null) {

			System.out.println("============================");

			System.out.println("용사 " + name + " 는(은) 용을 처치하고 발할라를 구원하기 위해 용의 앞에 모습을 나타냈다.");

			System.out.println("============================");

			while (turn < 30) {

				if (turn < 10) {

					System.out.println("============================");

					System.out.println("1. 횡베기");

					System.out.println("2. 종베기");

					System.out.println("3. 대지 가르기");

					menu = sc.nextInt();

					switch (menu) {

					case 1:

						attack();

						turn++;

						break;

					case 2:

						attack();

						turn++;

						break;

					case 3:

						attack();

						turn++;

						break;

					}

					if (turn == 10) {

						System.out.println("============================");

						System.out.println("수십 번의 합을 주고 받으며 용사는 각성하였다.");

						System.out.println("새로운 스킬을 획득 하셨습니다.");

						System.out.println("'팬텀 블레이드'");

						System.out.println("");

					}

					if (turn >= 10) {

						while (turn < 30) {

							System.out.println("============================");

							System.out.println("1. 횡베기");

							System.out.println("2. 종베기");

							System.out.println("3. 대지 가르기");

							System.out.println("4. 팬텀 블레이드");

							menu = sc.nextInt();

							switch (menu) {

							case 1:

								attack();

								turn++;

								break;

							case 2:

								attack();

								turn++;

								break;

							case 3:

								attack();

								turn++;

								break;

							case 4:

								attack();

								turn++;

								break;

							}

							if (turn == 20) {

								System.out.println("============================");

								System.out.println("끝이 보이지 않는 싸움.. ");

								System.out.println("깊은 곳에서 깨달음을 얻는다.");

								System.out.println("새로운 스킬을 획득 하셨습니다.");

								System.out.println("'드래곤 저지먼트'");

								System.out.println("");

							}

							if (turn >= 20) {

								while (turn < 30) {

									System.out.println("============================");

									System.out.println("1. 횡베기");

									System.out.println("2. 종베기");

									System.out.println("3. 대지 가르기");

									System.out.println("4. 팬텀 블레이드");

									System.out.println("5. 드래곤 저지먼트");

									menu = sc.nextInt();

									switch (menu) {

									case 1:

										attack();

										turn++;

										break;

									case 2:

										attack();

										turn++;

										break;

									case 3:

										attack();

										turn++;

										break;

									case 4:

										attack();

										turn++;

										break;

									case 5:

										attack();

										turn++;

										break;

									}
									if (turn == 29) {

										turn = 32;

										end();

									}

								}

							}

						}

					}

				}

			}

		}

	}

	public static void attack() {

		if (menu == 1) {

			int a = (int) (Math.random() * 81) + 20;

			dragon_Hp -= a;

			System.out.println("");

			System.out.println("============================");

			System.out.println("용사 " + name + "는(은) '횡베기'를 시전하였다.");

			System.out.println("휙!!!");

			System.out.println("용은 " + a + " 데미지를 받았다.");

			System.out.println("현재 용의 체력 : " + dragon_Hp);

			System.out.println("");

			dragon_Attack();

		} else if (menu == 2) {

			int a = (int) (Math.random() * 81) + 20;

			dragon_Hp -= a;

			System.out.println("");

			System.out.println("============================");

			System.out.println("용사 " + name + "는(은) '종베기'를 시전하였다.");

			System.out.println("용은 " + a + " 데미지를 받았다.");

			System.out.println("현재 용의 체력 : " + dragon_Hp);

			System.out.println("");

			dragon_Attack();

		} else if (menu == 3) {

			int a = (int) (Math.random() * 131) + 20;

			dragon_Hp -= a;

			System.out.println("");

			System.out.println("============================");

			System.out.println("용사 " + name + "는(은) '대지 가르기'를 시전하였다.");

			System.out.println("히야압..!!");

			System.out.println("콰지지직");

			System.out.println("용은 " + a + " 데미지를 받았다.");

			System.out.println("현재 용의 체력 : " + dragon_Hp);

			System.out.println("");

			dragon_Attack();

		} else if (menu == 4) {

			int a = (int) (Math.random() * 151) + 30;

			dragon_Hp -= a;

			System.out.println("");

			System.out.println("============================");

			System.out.println("용사 " + name + "는(은) '팬텀 블레이드'를 시전하였다.");

			System.out.println("'팬텀 블레이드!!!!'");

			System.out.println("섬광같은 속도로 검을 내질렀다.");

			System.out.println("용은 " + a + " 데미지를 받았다.");

			System.out.println("현재 용의 체력 : " + dragon_Hp);

			System.out.println("");

			dragon_Attack();

		} else if (menu == 5) {

			int a = (int) (Math.random() * 170) + 50;

			dragon_Hp -= a;

			System.out.println("");

			System.out.println("============================");

			System.out.println("용사 " + name + "는(은) '드래곤 저지먼트'를 시전하였다.");

			System.out.println("'드래곤 저지먼트!!!!'");

			System.out.println("찰나의 순간 세상은 밝게 빛이 났으며");

			System.out.println("발할라의 종말을 맞이 한 듯 했다.");

			System.out.println("용은 " + a + " 데미지를 받았다.");

			System.out.println("현재 용의 체력 : " + dragon_Hp);

			System.out.println("");

			dragon_Attack();

		}

		if (dragon_Hp <= 0) {

			turn = 31;

			end();

		} else if (night_Hp <= 0) {

			turn = 31;

			end();

		}

	}

	public static void dragon_Attack() {

		int a = (int) (Math.random() * 8) + 1;

		int b = (int) (Math.random() * 151) + 50;

		if (a == 1) {

			night_Hp -= b;

			System.out.println("");

			System.out.println("용은 불을 뿜었다.");

			System.out.println("강력한 불은 대지를 불태우고, 용사를 위기로 몰았다.");

			System.out.println("용사는 " + b + " 데미지를 받았다.");

			System.out.println("현재 용사 " + name + "의 체력 : " + night_Hp);

			System.out.println("");

		} else if (a == 3) {

			night_Hp -= 10;

			System.out.println("");

			System.out.println("용의 날카로운 발톱이 용사의 목을 노렸다.");

			System.out.println("용사는 방패를 머리위로 올려 용의 공격을 막아냈다.");

			System.out.println("용사는 " + 10 + " 데미지를 받았다.");

			System.out.println("현재 용사 " + name + "의 체력 : " + night_Hp);

			System.out.println("");

		} else if (a == 5) {

			night_Hp -= 0;

			System.out.println("");

			System.out.println("하늘 높이 난 용은 용사를 향해 돌격하였다.");

			System.out.println("용사는 재빠른 몸놀림으로 공격을 피했다.");

			System.out.println("용사는 " + 0 + " 데미지를 받았다.");

			System.out.println("현재 용사 " + name + "의 체력 : " + night_Hp);

			System.out.println("");

		} else if (a == 7) {

			night_Hp -= 100;

			System.out.println("");

			System.out.println("용은 꼬리를 이용해  용사에게 휘둘렀다.");

			System.out.println("용사는 재빠르게 몸을 날렸으나");

			System.out.println("용의 빠른 기습공격에 제대로 피하지 못했다.");

			System.out.println("용사는 " + 100 + " 데미지를 받았다.");

			System.out.println("현재 용사 " + name + "의 체력 : " + night_Hp);

			System.out.println("");

		}

	}

	public static void end() {

		if (dragon_Hp <= 0) {

			System.out.println("============================");

			System.out.println("용사 " + name + " 는(은) 용에게 승리하였다.");

			System.out.println("용사의 몸은 망신창이가 되었지만");

			System.out.println("용사의 몸을 감싸 안듯 하늘에선 비가 내렸다.");

			System.out.println("용사의 몸은 깨끗이 씻겨나갔으며");

			System.out.println("불에 타오르던 발할라는 봄을 맞이하는 듯 하였다.");

			System.out.println("============================");

		} else if (night_Hp <= 0 || turn == 32) {

			System.out.println("============================");

			System.out.println("용사 " + name + " 는(은) 용에게 패배하였고");

			System.out.println("평화의 땅 발할라는 불속에 잠겨 사라졌으며");

			System.out.println("사람들의 모습은 어디에서도 찾을 수 없었다.");

			System.out.println("하늘은 칙칙하고 어두웠으며 대지에는 재만이 남았다.");

			System.out.println("============================");

		}

	}

}

package innerclass.game;

import innerclass.game.Room.Bed.Mattress;

public class Room {

	public static String roomName;
	
	// �ڲ��� ��һ�� static ��ΪǶ����
	private static class Table {
		 String tableName = "ʵľ����";
		
		Table(){
			roomName ="2-101";
		}
		public  String getTableName() {
			return tableName;
		}
		
		public String getRoomName() {
			return roomName;
		}
		
	}

	static class Bed {
		static int length = 220;

		public static void printLength() {
			System.out.println("Bed lenght= " + length);
		}

		static class Mattress {
			static int length = 210;
			public  void printLength() {
				System.out.println("Mattress length=" + length);
			}
		}
	}

	public static void main(String[] args) {
		Bed.printLength();
		Mattress mattress=new Mattress();
		mattress.printLength();
		
		Table table=new Table();
		System.out.println("RoomName="+table.getRoomName()+
				"  tableName="+table.getTableName());
	}

}

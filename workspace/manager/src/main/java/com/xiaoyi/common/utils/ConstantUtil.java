package com.xiaoyi.common.utils;

public class ConstantUtil {
	
	public static enum Type {
		STU_GO(1),
		TEA_GO(-1);
		
		private int type;
		private Type(int type){
			this.type=type;
		}
		
		public int getValue(){
			return type;
		}
		@Override
		public String toString(){
			return (type==1)?"学生上门":"老师上门";			
		}
	}
	
	public static enum Level{
		PRIMARY(1),
		MIDDLE(2),
		HIGH(3);
		
		private int level;
		private Level(int level){
			this.level=level;
		}
		public int getValue(){
			return level;
		}
		@Override
		public String toString(){
			switch(level){
			case 1:
				return "小学";
			case 2: 
				return "初中";
			case 3: 
				return "高中";
			}
			return "null";
		}
	}
	
	public static enum Grade{
		ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
		
		private int grade;
		
		private Grade(int grade){
			this.grade = grade;
		}
		public int getValue(){
			return grade;
		}
		@Override
		public String toString(){
			switch(grade){
			case 1:
				return "一年级";
			case 2:
				return "二年级";
			case 3:
				return "三年级";
			case 4:
				return "四年级";
			case 5:
				return "五年级";
			case 6: 
				return "六年级";
			}
		
			return "null";
		}
	}
	
	public static enum Course{
		CHN(1),MATH(2),ENG(3),POL(4),HIS(5),GEO(6),PHY(7),CHE(8),BIO(9);
		private int courseId;
		private Course(int courseId){
			this.courseId = courseId;
		}
		
		public int getValue(){
			return courseId;
		}
		
		@Override
		public String toString(){
			switch(courseId){
			case 1:
				return "语文";
			case 2:
				return "数学";
			case 3:
				return "外语";
			case 4: 
				return "政治";
			case 5:
				return "历史";
			case 6:
				return "地理";
			case 7:
				return "物理";
			case 8:
				return "化学";
			case 9:
				return "生物";
			}			
			return "null";
		}	
	}
	/**
	 * primary-小学, middle-中学, high- 高中
	 * 1-9:语数外、政史地、物化生
	 * C-语文,M-数学,E-英语,P-政治,H-历史,G-地理,PH-物理,CH-化学,B-生物
	*/
	public static enum LessonType{
		
		//学生上门
		PRIMARY_ONE_C(111),PRIMARY_ONE_M(112),PRIMARY_ONE_E(113),PRIMARY_ONE_P(114),PRIMARY_ONE_H(115),PRIMARY_ONE_G(116),PRIMARY_ONE_PH(117),PRIMARY_ONE_CH(118),PRIMARY_ONE_B(119),
		PRIMARY_TWO_C(121),PRIMARY_TWO_M(122),PRIMARY_TWO_E(123),PRIMARY_TWO_P(124),PRIMARY_TWO_H(125),PRIMARY_TWO_G(126),PRIMARY_TWO_PH(127),PRIMARY_TWO_CH(128),PRIMARY_TWO_B(129),
		PRIMARY_THREE_C(131),PRIMARY_THREE_M(132),PRIMARY_THREE_E(133),PRIMARY_THREE_P(134),PRIMARY_THREE_H(135),PRIMARY_THREE_G(136),PRIMARY_THREE_PH(137),PRIMARY_THREE_CH(138),PRIMARY_THREE_B(139),
		PRIMARY_FOUR_C(141),PRIMARY_FOUR_M(142),PRIMARY_FOUR_E(143),PRIMARY_FOUR_P(144),PRIMARY_FOUR_H(145),PRIMARY_FOUR_G(146),PRIMARY_FOUR_PH(147),PRIMARY_FOUR_CH(148),PRIMARY_FOUR_B(149),
		PRIMARY_FIVE_C(151),PRIMARY_FIVE_M(152),PRIMARY_FIVE_E(153),PRIMARY_FIVE_P(154),PRIMARY_FIVE_H(155),PRIMARY_FIVE_G(156),PRIMARY_FIVE_PH(157),PRIMARY_FIVE_CH(158),PRIMARY_FIVE_B(159),
		PRIMARY_SIX_C(161),PRIMARY_SIX_M(162),PRIMARY_SIX_E(163),PRIMARY_SIX_P(164),PRIMARY_SIX_H(165),PRIMARY_SIX_G(166),PRIMARY_SIX_PH(167),PRIMARY_SIX_CH(168),PRIMARY_SIX_B(169),
		//老师上门
		_PRIMARY_ONE_C(-111),_PRIMARY_ONE_M(-112),_PRIMARY_ONE_E(-113),_PRIMARY_ONE_P(-114),_PRIMARY_ONE_H(-115),_PRIMARY_ONE_G(-116),_PRIMARY_ONE_PH(-117),_PRIMARY_ONE_CH(-118),_PRIMARY_ONE_B(-119),
		_PRIMARY_TWO_C(-121),_PRIMARY_TWO_M(-122),_PRIMARY_TWO_E(-123),_PRIMARY_TWO_P(-124),_PRIMARY_TWO_H(-125),_PRIMARY_TWO_G(-126),_PRIMARY_TWO_PH(-127),_PRIMARY_TWO_CH(-128),_PRIMARY_TWO_B(-129),
		_PRIMARY_THREE_C(-131),_PRIMARY_THREE_M(-132),_PRIMARY_THREE_E(-133),_PRIMARY_THREE_P(-134),_PRIMARY_THREE_H(-135),_PRIMARY_THREE_G(-136),_PRIMARY_THREE_PH(-137),_PRIMARY_THREE_CH(-138),_PRIMARY_THREE_B(-139),
		_PRIMARY_FOUR_C(-141),_PRIMARY_FOUR_M(-142),_PRIMARY_FOUR_E(-143),_PRIMARY_FOUR_P(-144),_PRIMARY_FOUR_H(-145),_PRIMARY_FOUR_G(-146),_PRIMARY_FOUR_PH(-147),_PRIMARY_FOUR_CH(-148),_PRIMARY_FOUR_B(-149),
		_PRIMARY_FIVE_C(-151),_PRIMARY_FIVE_M(-152),_PRIMARY_FIVE_E(-153),_PRIMARY_FIVE_P(-154),_PRIMARY_FIVE_H(-155),_PRIMARY_FIVE_G(-156),_PRIMARY_FIVE_PH(-157),_PRIMARY_FIVE_CH(-158),_PRIMARY_FIVE_B(-159),
		_PRIMARY_SIX_C(-161),_PRIMARY_SIX_M(-162),_PRIMARY_SIX_E(-163),_PRIMARY_SIX_P(-164),_PRIMARY_SIX_H(-165),_PRIMARY_SIX_G(-166),_PRIMARY_SIX_PH(167),_PRIMARY_SIX_CH(-168),_PRIMARY_SIX_B(-169),
		
		//学生上门
		MIDDLE_ONE_C(211),MIDDLE_ONE_M(211),MIDDLE_ONE_E(213),MIDDLE_ONE_P(214),MIDDLE_ONE_H(215),MIDDLE_ONE_G(216),MIDDLE_ONE_PH(217),MIDDLE_ONE_CH(218),MIDDLE_ONE_B(219),
		MIDDLE_TWO_C(221),MIDDLE_TWO_M(222),MIDDLE_TWO_E(223),MIDDLE_TWO_P(224),MIDDLE_TWO_H(225),MIDDLE_TWO_G(226),MIDDLE_TWO_PH(227),MIDDLE_TWO_CH(228),MIDDLE_TWO_B(229),
		MIDDLE_THREE_C(331),MIDDLE_THREE_M(332),MIDDLE_THREE_E(333),MIDDLE_THREE_P(334),MIDDLE_THREE_H(335),MIDDLE_THREE_G(336),MIDDLE_THREE_PH(337),MIDDLE_THREE_CH(338),MIDDLE_THREE_B(339),
		//老师上门
		_MIDDLE_ONE_C(-211),_MIDDLE_ONE_M(-211),_MIDDLE_ONE_E(-213),_MIDDLE_ONE_P(-214),_MIDDLE_ONE_H(-215),_MIDDLE_ONE_G(-216),_MIDDLE_ONE_PH(-217),_MIDDLE_ONE_CH(-218),_MIDDLE_ONE_B(-219),
		_MIDDLE_TWO_C(-221),_MIDDLE_TWO_M(-222),_MIDDLE_TWO_E(-223),_MIDDLE_TWO_P(-224),_MIDDLE_TWO_H(-225),_MIDDLE_TWO_G(-226),_MIDDLE_TWO_PH(-227),_MIDDLE_TWO_CH(-228),_MIDDLE_TWO_B(-229),
		_MIDDLE_THREE_C(-331),_MIDDLE_THREE_M(-332),_MIDDLE_THREE_E(-333),_MIDDLE_THREE_P(-334),_MIDDLE_THREE_H(-335),_MIDDLE_THREE_G(-336),_MIDDLE_THREE_PH(-337),_MIDDLE_THREE_CH(-338),_MIDDLE_THREE_B(-339),
		
		//学生上门
		HIGH_ONE_C(311),HIGH_ONE_M(312),HIGH_ONE_E(313),HIGH_ONE_P(314),HIGH_ONE_H(315),HIGH_ONE_G(316),HIGH_ONE_PH(317),HIGH_ONE_CH(318),HIGH_ONE_B(319),
		HIGH_TWO_C(321),HIGH_TWO_M(323),HIGH_TWO_E(323),HIGH_TWO_P(324),HIGH_TWO_H(325),HIGH_TWO_G(326),HIGH_TWO_PH(327),HIGH_TWO_CH(328),HIGH_TWO_B(329),
		HIGH_THREE_C(331),HIGH_THREE_M(332),HIGH_THREE_E(333),HIGH_THREE_P(334),HIGH_THREE_H(335),HIGH_THREE_G(336),HIGH_THREE_PH(337),HIGH_THREE_CH(338),HIGH_THREE_B(339),
		//老师上门
		_HIGH_ONE_C(-311),_HIGH_ONE_M(-312),_HIGH_ONE_E(-313),_HIGH_ONE_P(-314),_HIGH_ONE_H(-315),_HIGH_ONE_G(-316),_HIGH_ONE_PH(-317),_HIGH_ONE_CH(-318),_HIGH_ONE_B(-319),
		_HIGH_TWO_C(-331),_HIGH_TWO_M(-332),_HIGH_TWO_E(-333),_HIGH_TWO_P(-334),_HIGH_TWO_H(-335),_HIGH_TWO_G(-336),_HIGH_TWO_PH(-337),_HIGH_TWO_CH(-338),_HIGH_TWO_B(-339),
		_HIGH_THREE_C(-331),_HIGH_THREE_M(-332),_HIGH_THREE_E(-333),_HIGH_THREE_P(-334),_HIGH_THREE_H(-335),_HIGH_THREE_G(-336),_HIGH_THREE_PH(-337),_HIGH_THREE_CH(-338),_HIGH_THREE_B(-339);

		
		private int type;
		
		private LessonType(int type){
			this.type = type;
		}
		
		public int getValue(){
			return type;
		}
		/**
		 * 返回年级ID
		 * @return
		 */
		public int getGradeId(){
			
			if(type>0){
				return type/10%10;
			}else{
				return -type/10%10;
			}
		}
		/**
		 * 返回年级名
		 * @return
		 */
		public String getGradeName(){
			for(Grade g : Grade.values()){
				if(g.getValue() == getGradeId()){
					return g.toString();
				}
			}
			return null;
		}
		
		/**
		 * 获取科目Id
		 * @return
		 */
		public int getCourseId(){
			if(type>0){
				return type%10;
			}
			return -type%10;
		}
		/**
		 * 获取科目名称
		 */
		public String getCourseName(){
			for(Course c : Course.values()){
				if(c.getValue() == getCourseId()){
					return c.toString();
				}
			}
			return null;
		}
		
		/**
		 * 获取Level
		 */
		public int getLevel(){
			if(type>0){
				return type/100;
			}else{
				return -type/100;
			}
		}
		
		/**
		 * 获取学生层次（小学，初中，高中）
		 * @return
		 */
		public String getLevelName(){
			for(Level l : Level.values()){
				if(l.getValue()==getLevel()){
					return l.toString();
				}
			}
			return null;
		}
		
		/**
		 * 获取类型（学生上门、老师上门）
		 * @return
		 */
		public int getType(){
			return type/Math.abs(type);
		}
		public String getTypeName(){
			return (type>0)?Type.STU_GO.toString():Type.TEA_GO.toString();
		}
		
	}

}

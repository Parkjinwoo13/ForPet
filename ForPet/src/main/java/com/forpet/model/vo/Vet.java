package com.forpet.model.vo;

import java.util.List;

public class Vet {

	private int vetSeq;  //�������� �Ϸù�ȣ
	private String vetName; //���� �̸�
	private String vetAddress; //�����ּ�
	private String vetPhone; //���� ��ȭ��ȣ
	private int vetDaySTime; //�������Ͻ��۽ð� (24H)
	private int vetDayETime; //������������ð� (24H)
	private int vetSatSTime;//���������۽ð� (24H)
	private int vetSatETime;//�����������ð� (24H)
	private int vetSunSTime;//�����Ͽ��ϰ����Ͻ��۽ð� (24H)
	private int vetSunETime;//�����Ͽ��ϰ���������ð� (24H)
	private String vetComment; //�ΰ�����
	
	public Vet() {
		// TODO Auto-generated constructor stub
	}

	public int getVetSeq() {
		return vetSeq;
	}

	public void setVetSeq(int vetSeq) {
		this.vetSeq = vetSeq;
	}

	public String getVetName() {
		return vetName;
	}

	public void setVetName(String vetName) {
		this.vetName = vetName;
	}

	public String getVetAddress() {
		return vetAddress;
	}

	public void setVetAddress(String vetAddress) {
		this.vetAddress = vetAddress;
	}

	public String getVetPhone() {
		return vetPhone;
	}

	public void setVetPhone(String vetPhone) {
		this.vetPhone = vetPhone;
	}

	public int getVetDaySTime() {
		return vetDaySTime;
	}

	public void setVetDaySTime(int vetDaySTime) {
		this.vetDaySTime = vetDaySTime;
	}

	public int getVetDayETime() {
		return vetDayETime;
	}

	public void setVetDayETime(int vetDayETime) {
		this.vetDayETime = vetDayETime;
	}

	public int getVetSatSTime() {
		return vetSatSTime;
	}

	public void setVetSatSTime(int vetSatSTime) {
		this.vetSatSTime = vetSatSTime;
	}

	public int getVetSatETime() {
		return vetSatETime;
	}

	public void setVetSatETime(int vetSatETime) {
		this.vetSatETime = vetSatETime;
	}

	public int getVetSunSTime() {
		return vetSunSTime;
	}

	public void setVetSunSTime(int vetSunSTime) {
		this.vetSunSTime = vetSunSTime;
	}

	public int getVetSunETime() {
		return vetSunETime;
	}

	public void setVetSunETime(int vetSunETime) {
		this.vetSunETime = vetSunETime;
	}

	public String getVetComment() {
		return vetComment;
	}

	public void setVetComment(String vetComment) {
		this.vetComment = vetComment;
	}

		public Vet(int vetSeq, String vetName, String vetAddress, String vetPhone, int vetDaySTime, int vetDayETime,
			int vetSatSTime, int vetSatETime, int vetSunSTime, int vetSunETime, String vetComment) {
		super();
		this.vetSeq = vetSeq;
		this.vetName = vetName;
		this.vetAddress = vetAddress;
		this.vetPhone = vetPhone;
		this.vetDaySTime = vetDaySTime;
		this.vetDayETime = vetDayETime;
		this.vetSatSTime = vetSatSTime;
		this.vetSatETime = vetSatETime;
		this.vetSunSTime = vetSunSTime;
		this.vetSunETime = vetSunETime;
		this.vetComment = vetComment;
	}

	@Override
	public String toString() {
		return "Vet [vetSeq=" + vetSeq + ", vetName=" + vetName + ", vetAddress=" + vetAddress + ", vetPhone="
				+ vetPhone + ", vetDaySTime=" + vetDaySTime + ", vetDayETime=" + vetDayETime + ", vetSatSTime="
				+ vetSatSTime + ", vetSatETime=" + vetSatETime + ", vetSunSTime=" + vetSunSTime + ", vetSunETime="
				+ vetSunETime + ", vetComment=" + vetComment + "]";
	}

	
	
	
}

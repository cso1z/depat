package mediatorpattern;

import java.util.logging.Handler;

public class MainBoard extends Mediator {

	private CDDevice cdDevice;// �����豸
	private CPU cpu;// CPU
	private SoundCard soundCard;// �����豸
	private GraphicsCard graphicsCard;// �Կ��豸

	@Override
	public void changed(Colleague c) {
		// ����ǹ�����ȡ������
		if (c == cdDevice) {
			HandlerCD((CDDevice) c);
		} else if (c == cpu) {
			// ���CPU����������
			HandlerCPU((CPU) c);
		}
	}

	/*
	 * ���������ȡ���ݺ��������豸�Ľ���
	 */
	private void HandlerCD(CDDevice c) {
		cpu.decodeData(cdDevice.read());

	}

	/*
	 * ����CPU��ȡ���ݺ��������豸�Ľ���
	 */
	private void HandlerCPU(CPU c) {
		soundCard.soundPlay(cpu.getDataSound());
		graphicsCard.videoPlay(cpu.getDataVideo());
	}
	/*
	 * ����CD�豸
	 */
	public void setCDDevice(CDDevice cdDevice) {
		this.cdDevice = cdDevice;
	}
	/*
	 * ����CPU
	 */
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
 /*
  * ���������豸
  */
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
 
	/*
	 * �����Կ��豸
	 */
	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	} }

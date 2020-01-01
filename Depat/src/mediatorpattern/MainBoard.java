package mediatorpattern;

import java.util.logging.Handler;

public class MainBoard extends Mediator {

	private CDDevice cdDevice;// 光驱设备
	private CPU cpu;// CPU
	private SoundCard soundCard;// 声卡设备
	private GraphicsCard graphicsCard;// 显卡设备

	@Override
	public void changed(Colleague c) {
		// 如果是光驱读取了数据
		if (c == cdDevice) {
			HandlerCD((CDDevice) c);
		} else if (c == cpu) {
			// 如果CPU处理完数据
			HandlerCPU((CPU) c);
		}
	}

	/*
	 * 处理光驱读取数据后与其他设备的交互
	 */
	private void HandlerCD(CDDevice c) {
		cpu.decodeData(cdDevice.read());

	}

	/*
	 * 处理CPU读取数据后与其他设备的交互
	 */
	private void HandlerCPU(CPU c) {
		soundCard.soundPlay(cpu.getDataSound());
		graphicsCard.videoPlay(cpu.getDataVideo());
	}
	/*
	 * 设置CD设备
	 */
	public void setCDDevice(CDDevice cdDevice) {
		this.cdDevice = cdDevice;
	}
	/*
	 * 设置CPU
	 */
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
 /*
  * 设置声卡设备
  */
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
 
	/*
	 * 设置显卡设备
	 */
	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	} }

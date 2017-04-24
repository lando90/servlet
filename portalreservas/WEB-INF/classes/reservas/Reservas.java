package reservas;
import java.sql.Date;
public class Reservas
{
	//ATRIBUTES
	private int id;
	private int idUser;
	private int idRoom;
	private Date checkinDate;
	private Date checkoutDate;
	private int signal;
	private int nChildren;
	
	//CONSTRUCTORS
	public Reservas ()
	{
		
	}
	
	public Reservas(int id,int idUser,int idRoom,Date checkinDate, Date checkoutDate,int signal,int nChildren )
	{
		this.id=id;
		this.idUser=idUser;
		this.idRoom=idRoom;
		this.checkinDate=checkinDate;
		this.checkoutDate=checkoutDate;
		this.signal=signal;
		this.nChildren=nChildren;
	}
	
	//GETTERS
	public int getId()
	{
		return id;
	}
	
	public int getIdUser()
	{
		return idUser;
	}
	
	public int getIdRoom()
	{
		return idRoom;
	}
	public Date getCheckInDate()
	{
		return checkinDate;
	}
	public Date getCheckOutDate()
	{
		return checkoutDate;
	}
	public int getSignal()
	{
		return signal;
	}
	
	public int getNChildren()
	{
		return nChildren;
	}
	
	//SETTERS
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setIdUser(int user)
	{
		this.idUser=user;
	}
	
	public void setIdRoom(int room)
	{
		this.idRoom=room;
	}
	public void setCheckInDate(Date dat)
	{
		this.checkinDate=dat;
	}
	public void setCheckOutDate(Date dat)
	{
		this.checkoutDate=dat;
	}
	public void setSignal(int signal)
	{
		this.signal=signal;
	}
	
	public void setNChildren(int nChild)
	{
		this.nChildren=nChild;
	}
	
}
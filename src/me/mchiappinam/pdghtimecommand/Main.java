package me.mchiappinam.pdghtimecommand;

import java.io.File;
import java.util.Calendar;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private int horaAutoStart1;
	private int horaAutoStart2;
	private int horaAutoStart3;
	private int horaAutoStart4;
	private int horaAutoStart5;
	private int horaAutoStart6;
	private int horaAutoStart7;
	private int horaAutoStart8;
	private int horaAutoStart9;
	private int horaAutoStart10;
	private int horaAutoStart11;
	private int horaAutoStart12;
	private int horaAutoStart13;
	private int horaAutoStart14;
	private int horaAutoStart15;
	private int horaAutoStart16;
	private int horaAutoStart17;
	private int horaAutoStart18;
	private int horaAutoStart19;
	private int horaAutoStart20;
	private int horaAutoStart21;
	private int horaAutoStart22;
	private int horaAutoStart23;
	private int horaAutoStart24;

	private int minAutoStart1;
	private int minAutoStart2;
	private int minAutoStart3;
	private int minAutoStart4;
	private int minAutoStart5;
	private int minAutoStart6;
	private int minAutoStart7;
	private int minAutoStart8;
	private int minAutoStart9;
	private int minAutoStart10;
	private int minAutoStart11;
	private int minAutoStart12;
	private int minAutoStart13;
	private int minAutoStart14;
	private int minAutoStart15;
	private int minAutoStart16;
	private int minAutoStart17;
	private int minAutoStart18;
	private int minAutoStart19;
	private int minAutoStart20;
	private int minAutoStart21;
	private int minAutoStart22;
	private int minAutoStart23;
	private int minAutoStart24;
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHTimeCommand] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHTimeCommand] §2Acesse: http://pdgh.net/");
	}
	
	@Override
    public void onEnable() {
		File file = new File(getDataFolder(),"config.yml");
		if(!file.exists()) {
			try {
				saveResource("config_template.yml",false);
				File file2 = new File(getDataFolder(),"config_template.yml");
				file2.renameTo(new File(getDataFolder(),"config.yml"));
			}
			catch(Exception e) {}
		}
		horaAutoStart1 = Integer.parseInt(getConfig().getString("AutoStart1.Hora").substring(0,2));
		horaAutoStart2 = Integer.parseInt(getConfig().getString("AutoStart2.Hora").substring(0,2));
		horaAutoStart3 = Integer.parseInt(getConfig().getString("AutoStart3.Hora").substring(0,2));
		horaAutoStart4 = Integer.parseInt(getConfig().getString("AutoStart4.Hora").substring(0,2));
		horaAutoStart5 = Integer.parseInt(getConfig().getString("AutoStart5.Hora").substring(0,2));
		horaAutoStart6 = Integer.parseInt(getConfig().getString("AutoStart6.Hora").substring(0,2));
		horaAutoStart7 = Integer.parseInt(getConfig().getString("AutoStart7.Hora").substring(0,2));
		horaAutoStart8 = Integer.parseInt(getConfig().getString("AutoStart8.Hora").substring(0,2));
		horaAutoStart9 = Integer.parseInt(getConfig().getString("AutoStart9.Hora").substring(0,2));
		horaAutoStart10 = Integer.parseInt(getConfig().getString("AutoStart10.Hora").substring(0,2));
		horaAutoStart11 = Integer.parseInt(getConfig().getString("AutoStart11.Hora").substring(0,2));
		horaAutoStart12 = Integer.parseInt(getConfig().getString("AutoStart12.Hora").substring(0,2));
		horaAutoStart13 = Integer.parseInt(getConfig().getString("AutoStart13.Hora").substring(0,2));
		horaAutoStart14 = Integer.parseInt(getConfig().getString("AutoStart14.Hora").substring(0,2));
		horaAutoStart15 = Integer.parseInt(getConfig().getString("AutoStart15.Hora").substring(0,2));
		horaAutoStart16 = Integer.parseInt(getConfig().getString("AutoStart16.Hora").substring(0,2));
		horaAutoStart17 = Integer.parseInt(getConfig().getString("AutoStart17.Hora").substring(0,2));
		horaAutoStart18 = Integer.parseInt(getConfig().getString("AutoStart18.Hora").substring(0,2));
		horaAutoStart19 = Integer.parseInt(getConfig().getString("AutoStart19.Hora").substring(0,2));
		horaAutoStart20 = Integer.parseInt(getConfig().getString("AutoStart20.Hora").substring(0,2));
		horaAutoStart21 = Integer.parseInt(getConfig().getString("AutoStart21.Hora").substring(0,2));
		horaAutoStart22 = Integer.parseInt(getConfig().getString("AutoStart22.Hora").substring(0,2));
		horaAutoStart23 = Integer.parseInt(getConfig().getString("AutoStart23.Hora").substring(0,2));
		horaAutoStart24 = Integer.parseInt(getConfig().getString("AutoStart24.Hora").substring(0,2));

		minAutoStart1 = Integer.parseInt(getConfig().getString("AutoStart1.Hora").substring(2,4));
		minAutoStart2 = Integer.parseInt(getConfig().getString("AutoStart2.Hora").substring(2,4));
		minAutoStart3 = Integer.parseInt(getConfig().getString("AutoStart3.Hora").substring(2,4));
		minAutoStart4 = Integer.parseInt(getConfig().getString("AutoStart4.Hora").substring(2,4));
		minAutoStart5 = Integer.parseInt(getConfig().getString("AutoStart5.Hora").substring(2,4));
		minAutoStart6 = Integer.parseInt(getConfig().getString("AutoStart6.Hora").substring(2,4));
		minAutoStart7 = Integer.parseInt(getConfig().getString("AutoStart7.Hora").substring(2,4));
		minAutoStart8 = Integer.parseInt(getConfig().getString("AutoStart8.Hora").substring(2,4));
		minAutoStart9 = Integer.parseInt(getConfig().getString("AutoStart9.Hora").substring(2,4));
		minAutoStart10 = Integer.parseInt(getConfig().getString("AutoStart10.Hora").substring(2,4));
		minAutoStart11 = Integer.parseInt(getConfig().getString("AutoStart11.Hora").substring(2,4));
		minAutoStart12 = Integer.parseInt(getConfig().getString("AutoStart12.Hora").substring(2,4));
		minAutoStart13 = Integer.parseInt(getConfig().getString("AutoStart13.Hora").substring(2,4));
		minAutoStart14 = Integer.parseInt(getConfig().getString("AutoStart14.Hora").substring(2,4));
		minAutoStart15 = Integer.parseInt(getConfig().getString("AutoStart15.Hora").substring(2,4));
		minAutoStart16 = Integer.parseInt(getConfig().getString("AutoStart16.Hora").substring(2,4));
		minAutoStart17 = Integer.parseInt(getConfig().getString("AutoStart17.Hora").substring(2,4));
		minAutoStart18 = Integer.parseInt(getConfig().getString("AutoStart18.Hora").substring(2,4));
		minAutoStart19 = Integer.parseInt(getConfig().getString("AutoStart19.Hora").substring(2,4));
		minAutoStart20 = Integer.parseInt(getConfig().getString("AutoStart20.Hora").substring(2,4));
		minAutoStart21 = Integer.parseInt(getConfig().getString("AutoStart21.Hora").substring(2,4));
		minAutoStart22 = Integer.parseInt(getConfig().getString("AutoStart22.Hora").substring(2,4));
		minAutoStart23 = Integer.parseInt(getConfig().getString("AutoStart23.Hora").substring(2,4));
		minAutoStart24 = Integer.parseInt(getConfig().getString("AutoStart24.Hora").substring(2,4));
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
		            String ComandoAutoStart1 = getConfig().getString("AutoStart1.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart1)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart1)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart1);
		}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart2 = getConfig().getString("AutoStart2.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart2)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart2)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart2);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart3 = getConfig().getString("AutoStart3.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart3)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart3)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart3);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart4 = getConfig().getString("AutoStart4.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart4)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart4)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart4);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	        		String ComandoAutoStart5 = getConfig().getString("AutoStart5.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart5)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart5)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart5);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart6 = getConfig().getString("AutoStart6.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart6)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart6)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart6);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart7 = getConfig().getString("AutoStart7.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart7)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart7)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart7);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart8 = getConfig().getString("AutoStart8.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart8)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart8)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart8);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart9 = getConfig().getString("AutoStart9.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart9)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart9)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart9);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart10 = getConfig().getString("AutoStart10.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart10)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart10)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart10);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart11 = getConfig().getString("AutoStart11.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart11)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart11)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart11);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart12 = getConfig().getString("AutoStart12.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart12)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart12)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart12);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart13 = getConfig().getString("AutoStart13.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart13)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart13)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart13);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart14 = getConfig().getString("AutoStart14.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart14)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart14)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart14);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart15 = getConfig().getString("AutoStart15.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart15)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart15)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart15);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart16 = getConfig().getString("AutoStart16.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart16)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart16)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart16);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart17 = getConfig().getString("AutoStart17.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart17)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart17)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart17);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart18 = getConfig().getString("AutoStart18.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart18)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart18)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart18);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart19 = getConfig().getString("AutoStart19.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart19)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart19)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart19);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart20 = getConfig().getString("AutoStart20.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart20)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart20)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart20);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart21 = getConfig().getString("AutoStart21.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart21)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart21)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart21);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart22 = getConfig().getString("AutoStart22.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart22)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart22)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart22);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart23 = getConfig().getString("AutoStart23.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart23)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart23)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart23);
			}
		}, 0, 20*61);
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
	    			String ComandoAutoStart24 = getConfig().getString("AutoStart24.Comando");
					if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==horaAutoStart24)
						if(Calendar.getInstance().get(Calendar.MINUTE)==minAutoStart24)
							getServer().dispatchCommand(getServer().getConsoleSender(), ""+ComandoAutoStart24);
			}
		}, 0, 20*61);
		getServer().getConsoleSender().sendMessage("§3[PDGHTimeCommand] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHTimeCommand] §2Acesse: http://pdgh.net/");
}
	}

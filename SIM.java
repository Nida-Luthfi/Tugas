public class SIM
{
	public static void main (String[]args)
	{
	DataSim surat=new DataSim();
	surat.setIdSIM("321145675990");
	surat.setNama("Nida Luthfi Awaliyah");
	surat.setAlamat("Jl Raya Wado-Sumedang");
	surat.setTelepon("082320974864");
    surat.setPekerjaan("Mahasiswa");
	surat.setStatus("Belum Menikah");
	surat.setjenisKelamin("Perempuan");
	surat.setTinggiBadan("159cm");
	surat.setBeratBadan("50kg");
	surat.setBerlaku("Seumur Hidup");
	surat.setAgama("Islam");

	int IdSIM = surat.getIdSIM();
	String Nama = surat.getNama();
	String Alamat = surat.getAlamat();
	int Telepon = surat.getTelepon();
	String Pekerjaan = surat.getPekerjaan();
	String Status = surat.getStatus();
	String jenisKelamin = surat.getjenisKelamin();
	int TinggiBadan = surat.getTinggiBadan();
	int BeratBadan = surat.getBeratBadan();
	String Berlaku = surat.getBerlaku();
	String Agama = surat.getAgama();
	
	System.out.println("ID SIM 			: " +surat.IdSIM);
	System.out.println ("Nama			: " +surat.Nama);
	System.out.println ("Alamat			: " +surat.Alamat);
	System.out.println ("Telepon		: " +surat.Telepon);
	System.out.println ("Pekerjaan		: " +surat.Pekerjaan);
	System.out.println ("Status		    : " +surat.Status);
	System.out.println ("Jenis Kelamin  : " +surat.jenisKelamin);
	System.out.println ("TinggiBadan    : " +surat.TinggiBadan);
	System.out.println ("Berat Badan    : " +surat.BeratBadan);
	System.out.println ("Berlaku S/D    : " +surat.Berlaku);
	System.out.println ("Agama  	    : " +surat.Agama);
	
	
	
	}
}
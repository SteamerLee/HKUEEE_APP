package hk.hku.eee.hkueee.menuactivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import hk.hku.eee.hkueee.HomeActivity;
import hk.hku.eee.hkueee.R;
import hk.hku.eee.hkueee.menuactivity.ProgrammeDescription;

import static java.lang.Integer.parseInt;

public class Entrance extends AppCompatActivity {
    EditText txt_no;
    EditText txt1;
    EditText txt2;
    EditText txt3;
    EditText txt4;
    EditText txt5;
    Button btn_ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);

        btn_ls = (Button) findViewById(R.id.btn_ls);
        txt_no = (EditText) findViewById(R.id.txt_no);
        txt1=(EditText) findViewById(R.id.et1c);
        txt2=(EditText) findViewById(R.id.et2c);
        txt3=(EditText) findViewById(R.id.et3c);
        txt4=(EditText) findViewById(R.id.et4c);
        txt5=(EditText) findViewById(R.id.et5c);

        Btnls();

    }
    private void Btnls(){

        btn_ls.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String uname = txt_no.getText().toString();
                connect(uname);
            }
        });

    }

   /* @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.btn_ls) {
            String uname = txt_no.getText().toString();
            connect(uname);

        }
    }*/

    public void parse_HTML_Source( String HTMLsource , String uname){
        String msg = "should be numeric";
        Pattern P_msg= Pattern.compile(msg);
        Matcher m_msg = P_msg.matcher(HTMLsource);
        Boolean flagmsg=false;
        while(m_msg.find()){
            flagmsg=true;
        }

        // System.out.println(HTMLsource);
        String appid,status,doc,ack;
        appid=uname;
        status="N/A";
        doc="N/A";
        ack="N/A";
        if(flagmsg){
            uname="should be numeric";
            appid=uname;
        }

        txt1.setText(uname);
        txt2.setText(appid);
        txt3.setText(status);
        txt4.setText(doc);
        txt5.setText(ack);

        // System.out.println("this is /n" + HTMLsource);
        /*Pattern P_Entry =Pattern.compile("<span data-reactid=.*?>201[0-9]年[0-9]{2}月[0-9]{2}日</span>")
        Matcher P_Entry = P_Entry.matcher(HTMLsource);
        Pattern p_teachercandidates = Pattern.compile("<div class=\"teachers\">Teacher: <.*?>(.*?)</a>");
        Matcher m_teachercandidates = p_teachercandidates.matcher(HTMLsource);

        ArrayList<String> cname = new ArrayList<String>();
        ArrayList<String> cteachers = new ArrayList<String>();
        ArrayList<String> cteachersfinal = new ArrayList<String>();
        ArrayList<Integer> cnamePos = new ArrayList<Integer>();
        ArrayList<Integer> cteachersPos = new ArrayList<Integer>();
        ArrayList<Integer> cteachersIdx = new ArrayList<Integer>();

        while(m_course.find()){
            String course_name = m_course.group(1);
            Integer pos = m_course.start();
            boolean flag=true;
            for(String sss:cname){
                if(sss.equals(course_name)){
                    flag=false;
                }
            }
            if(flag){
                cname.add(course_name);
                cnamePos.add(pos);
            }
        }

        while(m_teachercandidates.find()){
            String string_teachername = m_teachercandidates.group(1);
            // int nameStartPosition = string_teachername.indexOf(">")+1;
            // int nameEndPosition = string_teachername.indexOf("</a>");
            // String teacher_name = string_teachername.substring(nameStartPosition, nameEndPosition);
            cteachers.add(string_teachername);
            Integer pos = m_teachercandidates.start();
            cteachersPos.add(pos);
        }

        Intent intent = new Intent(getBaseContext(), .class);

        int cIdx=0;
        for(int i=0 ; i<cteachersPos.size() ; ){
            int cpos0 = -1, cpos1 = -1;
            int tpos = cteachersPos.get(i);
            if(cIdx < cnamePos.size()){
                cpos0 = cnamePos.get(cIdx);
            }
            if(cIdx+1 < cnamePos.size()){
                cpos1 = cnamePos.get(cIdx+1);
            }
            if(cpos0 < 0 || tpos < cpos0){ /// a course with 2 teachers!? Assume the teacher belongs to the previous course
                cteachersIdx.add(cIdx-1);
                i++;
            } else if(cpos1 < 0 || (cpos0 < tpos && cpos1 > tpos)){
                cteachersIdx.add(cIdx);
                i++; cIdx++;
            } else { /// tpos > cpos1 ==> teacher belongs to next classes
                cIdx++;
            }
        }

        for(int i=0 ; i<cname.size() ; i++){
            String tname = "";
            for(int j=0 ; j<cteachersIdx.size() ; j++){
                int cidx = cteachersIdx.get(j);
                if(cidx == i){
                    tname += cteachers.get(j);
                }
            }
            cteachersfinal.add(tname);
        }

        intent.putStringArrayListExtra("CourseName", cname);
        intent.putStringArrayListExtra("Teachers", cteachersfinal);
        startActivity(intent);*/
    }
    protected void alert(String title, String mymessage) {
        new AlertDialog.Builder(this)
                .setMessage(mymessage)
                .setTitle(title)
                .setCancelable(true)
                .setNegativeButton(android.R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                            }
                        }
                )
                .show();
    }

    public void connect( final String userName){
        final ProgressDialog pdialog = new ProgressDialog(this);

        pdialog.setCancelable(false);
        pdialog.setMessage("Searching for status...");
        pdialog.show();

        AsyncTask<String, Void, String> task = new AsyncTask<String, Void, String>() {
            boolean success;
            String StatusPageContent;

            @Override
            protected String doInBackground(String... arg0) {
                // TODO Auto-generated method stub
                success = true;
                StatusPageContent = getStatusPage(userName);

                if( StatusPageContent.equals("Fail to login") )
                    success = false;

                return null;
            }

            @Override
            protected void onPostExecute(String result) {
                if (success) {
                    parse_HTML_Source( StatusPageContent , userName);
                } else {
                    alert( "Error", "Not Valid Number,Try Again!" );
                }
                pdialog.hide();
            }

        }.execute("");
    }
    public String ReadBufferedHTML(BufferedReader reader, char[] htmlBuffer, int bufSz) throws java.io.IOException {
        htmlBuffer[0] = '\0';
        int offset = 0;
        do {
            int cnt = reader.read(htmlBuffer, offset, bufSz - offset);
            if (cnt > 0) {
                offset += cnt;
            } else {
                break;
            }
        } while (true);
        return new String(htmlBuffer);
    }

    public String getStatusPage(String userName) {
        HttpURLConnection conn_status = null;

        final int HTML_BUFFER_SIZE = 2  * 1024;
        char htmlBuffer[] = new char[HTML_BUFFER_SIZE];

        final int HTTPCONNECTION_TYPE = 0;
        final int HTTPSCONNECTION_TYPE = 1;
        int status_conn_type = HTTPCONNECTION_TYPE;


        try {


            /////////////////////////////////// status //////////////////////////////////////
            URL url_status = new URL("http://intranet.eee.hku.hk/mscstatus/logon.asp");
            conn_status = (HttpURLConnection)url_status.openConnection();
            conn_status.setInstanceFollowRedirects(true);

            final String COOKIES_HEADER = "Set-Cookie";
            CookieManager msCookieManager = new CookieManager();
            //msCookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);

            //System.out.println(conn_status);
            conn_status.setDoOutput( true );
            conn_status.setChunkedStreamingMode(0);

            //conn_status.setRequestProperty ("Content-Length", "17");
            //conn_status.setRequestProperty ("Origin","http://intranet.eee.hku.hk");
            //conn_status.setRequestProperty ("Referer", "http://intranet.eee.hku.hk/mscstatus/default.htm");
            /*Map<String, List<String>> headerFields = conn_status.getHeaderFields();
            List<String> cookiesHeader = headerFields.get(COOKIES_HEADER);
            System.out.println(cookiesHeader);*/

            conn_status.setRequestProperty (COOKIES_HEADER, "ASPSESSIONIDCCBSASSD=OIDLOCJBGBAFNOIGPPIIDKAI; path=/");

            OutputStream out = new BufferedOutputStream(conn_status.getOutputStream());
            writeStream(out, userName);


           /* url_status = new URL("http://intranet.eee.hku.hk/mscstatus/logon.asp");
            conn_status = (HttpURLConnection)url_status.openConnection();
            conn_status.setInstanceFollowRedirects(true);
            conn_status.setDoOutput( true );
            conn_status.setChunkedStreamingMode(0);

            conn_status.setRequestProperty (COOKIES_HEADER, cookiesHeader.toString());

            out = new BufferedOutputStream(conn_status.getOutputStream());
            writeStream(out, userName);*/



            /*if (cookiesHeader != null) {
                for (String cookie : cookiesHeader) {
                    msCookieManager.getCookieStore().add(null, HttpCookie.parse(cookie).get(0));
                }
            }
            System.out.println(TextUtils.join(";",  msCookieManager.getCookieStore().getCookies()));
            if (msCookieManager.getCookieStore().getCookies().size() > 0) {
                    // While joining the Cookies, use ',' or ';' as needed. Most of the servers are using ';'
                conn_status.setRequestProperty("Cookie",
                            TextUtils.join(";",  msCookieManager.getCookieStore().getCookies()));
                }*/

            //conn_moodle.setRequestProperty();

            BufferedReader reader_status = new BufferedReader(new InputStreamReader(conn_status.getInputStream()));

            /// handling redirects to HTTPS protocol

            while (true) {
                String redirect_status = conn_status.getHeaderField("Location");
                //System.out.println(redirect_status);

                if (redirect_status != null) {
                    URL new_url_status = new URL(url_status, redirect_status);
                    if (status_conn_type == HTTPCONNECTION_TYPE) {
                        conn_status.disconnect();
                    } else {
                        conn_status.disconnect();
                    }
                    conn_status = ((HttpsURLConnection) new_url_status.openConnection());

                    if (new_url_status.getProtocol().equals("http")) {
                        status_conn_type = HTTPCONNECTION_TYPE;
                        conn_status.setInstanceFollowRedirects(true);
                    } else {
                        status_conn_type = HTTPSCONNECTION_TYPE;
                        conn_status.setInstanceFollowRedirects(true);
                    }

                    url_status = new_url_status;

                    //String cookie = conn_status.getHeaderField("Set-Cookie");
                    //if (cookie != null) {
                    //    conn_status2.setRequestProperty("Cookie", cookie);
                    //}
                    reader_status = new BufferedReader(new InputStreamReader(conn_status.getInputStream()));
                } else {
                    break;
                }
            }

            String HTMLSource = ReadBufferedHTML(reader_status, htmlBuffer, HTML_BUFFER_SIZE);
            reader_status.close();
            return HTMLSource;
            /////////////////////////////////// status //////////////////////////////////////

        } catch (Exception e) {
            //System.out.println("fail");
            return "Fail to login";
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            if (conn_status != null) {
                if (status_conn_type == HTTPCONNECTION_TYPE) {
                    ((HttpURLConnection) conn_status).disconnect();
                } else {
                    ((HttpsURLConnection) conn_status).disconnect();
                }
            }
        }
    }
    private String  writeStream(OutputStream out, String uname){
        String output = "userid="+uname;
        //String logon ="&passwd=&logon=Logon System";
        try {
            out.write(output.getBytes());
            out.flush();
            //   out.write(logon.getBytes());
            //   out.flush();
            return "Sucess";
        } catch (IOException e) {
            //e.printStackTrace();
            return "Failure";

        }



    }
}
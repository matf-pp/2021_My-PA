package com.example.mypa

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypa.databinding.WelcomeActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mActivity: WelcomeActivityBinding

    lateinit var name: String
    lateinit var lastname: String
    lateinit var email: String
    lateinit var date: String
    var gender = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = WelcomeActivityBinding.inflate(layoutInflater)


        val helper = MyDBHelper(applicationContext)
        val db = helper.readableDatabase
        val cursor: Cursor = db.rawQuery("select count(*) from reg",null)
        cursor.moveToFirst()
        val i = cursor.getInt(0)


        if(i == 0 )
            setContentView(mActivity.root)
        else {
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }

        mActivity.btnReg.setOnClickListener {

            var check = 0

            name = mActivity.txtName.text.toString()
            lastname = mActivity.txtLastname.text.toString()
            email = mActivity.txtEmail.text.toString()
            date = mActivity.birthDate.text.toString()

            val pomGndr = mActivity.gndr.checkedRadioButtonId

            if (pomGndr == R.id.gndrFemale)
                gender = 1
            else
                gender = 0

            val dateRegex = Regex("^(0[1-9]|[12][1-9]|3[01])/(0[1-9]|1[0-2])/(19|20)[0-9][0-9][ ]*")
            val matchd = dateRegex.matchEntire(date)

            val emailRegex = Regex("^[a-zA-Z0-9.%+-_]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
            val matche = emailRegex.matchEntire(email)

            if (name == "") {
                mActivity.txtName.setBackgroundResource(R.drawable.bg_wrong)
            } else {
                mActivity.txtName.setBackgroundResource(R.drawable.bg_fields)
                check += 1
            }
            if (lastname == "")
                mActivity.txtLastname.setBackgroundResource(R.drawable.bg_wrong)
            else {
                check += 1
                mActivity.txtLastname.setBackgroundResource(R.drawable.bg_fields)
            }
            if (email == "" || matche==null) {
                mActivity.txtEmail.setBackgroundResource(R.drawable.bg_wrong)
                mActivity.txtEmail.setText("")
            }
            else {
                check += 1
                mActivity.txtEmail.setBackgroundResource(R.drawable.bg_fields)
            }
           if (date == "" || matchd==null) {
               mActivity.birthDate.setBackgroundResource(R.drawable.bg_wrong)
                mActivity.birthDate.setText("")
           }
           else {
               check+=1
                mActivity.birthDate.setBackgroundResource(R.drawable.bg_fields)
            }
            if (check ==4 ) {
                helper.insertData(name,lastname,email,date)

                val intent = Intent(this, MainPageActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
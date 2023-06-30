package com.example.vta_app_final

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Parcel
import android.os.Parcelable
import android.os.PersistableBundle
import android.provider.Settings
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CalendarView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RelativeLayout
import android.widget.Spinner
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.cardview.widget.CardView
import com.codesgood.views.JustifiedTextView
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import java.security.Permission

class MainActivity() : AppCompatActivity() , OnMapReadyCallback, Parcelable {





    private val images = arrayListOf(
        R.drawable.caro1,
        R.drawable.caro2,
        R.drawable.caro3,
        R.drawable.caro4,
        R.drawable.caro5,
        R.drawable.caro6,
        R.drawable.caro7,
        R.drawable.caro8

    )

    private lateinit var visionHeaderLayout: LinearLayout
    private lateinit var visionArrow: ImageView
    private lateinit var visionContentLayout: LinearLayout

    private lateinit var missionHeaderLayout: LinearLayout
    private lateinit var missionArrow: ImageView
    private lateinit var missionContentLayout: LinearLayout

    private lateinit var objectiveHeaderLayout: LinearLayout
    private lateinit var objectiveArrow: ImageView
    private lateinit var objectiveContentLayout: LinearLayout

    private lateinit var valuesHeaderLayout: LinearLayout
    private lateinit var valuesArrow: ImageView
    private lateinit var valuesContentLayout: LinearLayout

    private lateinit var functionsHeaderLayout: LinearLayout
    private lateinit var functionsArrow: ImageView
    private lateinit var functionsContentLayout: LinearLayout









    private lateinit var bottomNavigation: MeowBottomNavigation

    private lateinit var centers: RelativeLayout
    private lateinit var courses: RelativeLayout
    private lateinit var home: RelativeLayout
    private lateinit var info: RelativeLayout
    private lateinit var exit: RelativeLayout

//courses declare  ---------------------------------------------------------------------------
    private lateinit var ict4HeaderLayout: LinearLayout
    private lateinit var ict4Arrow: ImageView
    private lateinit var ict4ContentLayout: LinearLayout

    private lateinit var ict5HeaderLayout: LinearLayout
    private lateinit var ict5Arrow: ImageView
    private lateinit var ict5ContentLayout: LinearLayout

    private lateinit var icthardwareHeaderLayout: LinearLayout
    private lateinit var icthardwareArrow: ImageView
    private lateinit var icthardwareContentLayout: LinearLayout

    private lateinit var softwaredevHeaderLayout: LinearLayout
    private lateinit var softwaredevArrow: ImageView
    private lateinit var softwaredevContentLayout: LinearLayout

    private lateinit var automobileHeaderLayout: LinearLayout
    private lateinit var automobileArrow: ImageView
    private lateinit var automobileContentLayout: LinearLayout

    private lateinit var autoacHeaderLayout: LinearLayout
    private lateinit var autoacArrow: ImageView
    private lateinit var autoacContentLayout: LinearLayout

    private lateinit var motorcycleHeaderLayout: LinearLayout
    private lateinit var motorcycleArrow: ImageView
    private lateinit var motorcycleContentLayout: LinearLayout

    private lateinit var aluminiumHeaderLayout: LinearLayout
    private lateinit var aluminiumArrow: ImageView
    private lateinit var aluminiumContentLayout: LinearLayout

    private lateinit var draughtspersonHeaderLayout: LinearLayout
    private lateinit var draughtspersonArrow: ImageView
    private lateinit var draughtspersonContentLayout: LinearLayout

    private lateinit var constructionHeaderLayout: LinearLayout
    private lateinit var constructionArrow: ImageView
    private lateinit var constructionContentLayout: LinearLayout

    private lateinit var motorwinderHeaderLayout: LinearLayout
    private lateinit var motorwinderArrow: ImageView
    private lateinit var motorwinderContentLayout: LinearLayout

    private lateinit var electronictechnicianHeaderLayout: LinearLayout
    private lateinit var electronictechnicianArrow: ImageView
    private lateinit var electronictechnicianContentLayout: LinearLayout

    private lateinit var electricianHeaderLayout: LinearLayout
    private lateinit var electricianArrow: ImageView
    private lateinit var electricianContentLayout: LinearLayout

    private lateinit var bakerHeaderLayout: LinearLayout
    private lateinit var bakerArrow: ImageView
    private lateinit var bakerContentLayout: LinearLayout

    private lateinit var cookHeaderLayout: LinearLayout
    private lateinit var cookArrow: ImageView
    private lateinit var cookContentLayout: LinearLayout

    private lateinit var fabricatorHeaderLayout: LinearLayout
    private lateinit var fabricatorArrow: ImageView
    private lateinit var fabricatorContentLayout: LinearLayout

    private lateinit var welderHeaderLayout: LinearLayout
    private lateinit var welderArrow: ImageView
    private lateinit var welderContentLayout: LinearLayout

    private lateinit var beauticianHeaderLayout: LinearLayout
    private lateinit var beauticianArrow: ImageView
    private lateinit var beauticianContentLayout: LinearLayout

    private lateinit var hairdresserHeaderLayout: LinearLayout
    private lateinit var hairdresserArrow: ImageView
    private lateinit var hairdresserContentLayout: LinearLayout

    private lateinit var childcareHeaderLayout: LinearLayout
    private lateinit var childcareArrow: ImageView
    private lateinit var childcareContentLayout: LinearLayout

    private lateinit var acHeaderLayout: LinearLayout
    private lateinit var acArrow: ImageView
    private lateinit var acContentLayout: LinearLayout

    private lateinit var dressmakerHeaderLayout: LinearLayout
    private lateinit var dressmakerArrow: ImageView
    private lateinit var dressmakerContentLayout: LinearLayout

    private lateinit var productionHeaderLayout: LinearLayout
    private lateinit var productionArrow: ImageView
    private lateinit var productionContentLayout: LinearLayout

    private lateinit var woodHeaderLayout: LinearLayout
    private lateinit var woodArrow: ImageView
    private lateinit var woodContentLayout: LinearLayout




    //centers-------------------------------------------------

    private lateinit var dvtaHeaderLayout: LinearLayout
    private lateinit var dvtaArrow: ImageView
    private lateinit var dvtaContentLayout: LinearLayout

    private lateinit var horanavtcHeaderLayout: LinearLayout
    private lateinit var horanavtcArrow: ImageView
    private lateinit var horanavtcContentLayout: LinearLayout

    private lateinit var kalutharavtcHeaderLayout: LinearLayout
    private lateinit var kalutharavtcArrow: ImageView
    private lateinit var kalutharavtcContentLayout: LinearLayout

    private lateinit var walanavtcHeaderLayout: LinearLayout
    private lateinit var walanavtcArrow: ImageView
    private lateinit var walanavtcContentLayout: LinearLayout

    private lateinit var walgamavtcHeaderLayout: LinearLayout
    private lateinit var walgamavtcArrow: ImageView
    private lateinit var walgamavtcContentLayout: LinearLayout

    private lateinit var meegahathennavtcHeaderLayout: LinearLayout
    private lateinit var meegahathennavtcArrow: ImageView
    private lateinit var meegahathennavtcContentLayout: LinearLayout

    private lateinit var dombagodacampvtcHeaderLayout: LinearLayout
    private lateinit var dombagodacampvtcArrow: ImageView
    private lateinit var dombagodacampvtcContentLayout: LinearLayout

    private lateinit var panapitiyavtcHeaderLayout: LinearLayout
    private lateinit var panapitiyavtcArrow: ImageView
    private lateinit var panapitiyavtcContentLayout: LinearLayout


    private lateinit var radioGroup: RadioGroup
    private lateinit var spinnerCourses: Spinner
    private lateinit var spinnerCenters: Spinner

    private val centerClassMap = HashMap<String, HashMap<String, List<String>>>()


    private var isPermissionGranted: Boolean = false

    constructor(parcel: Parcel) : this() {
        isPermissionGranted = parcel.readByte() != 0.toByte()
    }


    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val horanaMapFragment = supportFragmentManager.findFragmentById(R.id.horana) as SupportMapFragment



        checkMyPermission()

        horanaMapFragment.getMapAsync { googleMap ->
            val horanaCenter = LatLng(6.709130, 80.061494)
            val markerOptions = MarkerOptions().position(horanaCenter).title("Horana Center")
            googleMap.addMarker(markerOptions)

            val cameraPosition = CameraPosition.Builder().target(horanaCenter).zoom(12f).build()
            googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }




        val carouselView: CarouselView = findViewById(R.id.carouselView)
        carouselView.pageCount = images.size
        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(images[position])
        }



        val filterSpinner: Spinner = findViewById(R.id.filterSpinner)
        filterSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedOption = parent.getItemAtPosition(position).toString()
                updateCardViewVisibility(selectedOption)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle case when nothing is selected (optional)
            }
        }

        // Set the default selection to "All"
        filterSpinner.setSelection(0)






//justifying the data
        val visionDescriptionTextView: JustifiedTextView = findViewById(R.id.visionDescriptionTextView)
        visionDescriptionTextView.setText(R.string.vision)

        val missionDescriptionTextView: JustifiedTextView = findViewById(R.id.missionDescriptionTextView)
        missionDescriptionTextView.setText(R.string.mission)

        val objectiveDescriptionTextView: JustifiedTextView = findViewById(R.id.objectiveDescriptionTextView)
        objectiveDescriptionTextView.setText(R.string.objective)

        val valuesDescriptionTextView: JustifiedTextView = findViewById(R.id.valuesDescriptionTextView)
        valuesDescriptionTextView.setText(R.string.values)

        val functionsDescriptionTextView: JustifiedTextView = findViewById(R.id.functionsDescriptionTextView)
        functionsDescriptionTextView.setText(R.string.functions)

        val aboutvta: JustifiedTextView = findViewById(R.id.aboutvta)
        aboutvta.setText(R.string.aboutvta)



        val ict4p1: JustifiedTextView = findViewById(R.id.ict4p1)
        ict4p1.setText(R.string.ict4p1)

        val ict5p1: JustifiedTextView = findViewById(R.id.ict5p1)
        ict5p1.setText(R.string.ict5p1)

        val icthardwarep1: JustifiedTextView = findViewById(R.id.icthardwarep1)
        icthardwarep1.setText(R.string.icthardwarep1)

        val softwaredevp1: JustifiedTextView = findViewById(R.id.softwaredevp1)
        softwaredevp1.setText(R.string.softwaredevp1)

        val automobilep1: JustifiedTextView = findViewById(R.id.automobilep1)
        automobilep1.setText(R.string.automobilep1)

        val autoacp1: JustifiedTextView = findViewById(R.id.autoacp1)
        autoacp1.setText(R.string.autoacp1)

        val motorcyclep1: JustifiedTextView = findViewById(R.id.motorcyclep1)
        motorcyclep1.setText(R.string.motorcyclep1)

        val aluminiump1: JustifiedTextView = findViewById(R.id.aluminiump1)
        aluminiump1.setText(R.string.aluminiump1)

        val draughtspersonp1: JustifiedTextView = findViewById(R.id.draughtspersonp1)
        draughtspersonp1.setText(R.string.draughtspersonp1)

        val constructionp1: JustifiedTextView = findViewById(R.id.constructionp1)
        constructionp1.setText(R.string.constructionp1)

        val motorwinderp1: JustifiedTextView = findViewById(R.id.motorwinderp1)
        motorwinderp1.setText(R.string.motorwinderp1)

        val electronictechnicianp1: JustifiedTextView = findViewById(R.id.electronictechnicianp1)
        electronictechnicianp1.setText(R.string.electronictechnicianp1)

        val electricianp1: JustifiedTextView = findViewById(R.id.electricianp1)
        electricianp1.setText(R.string.electricianp1)

        val bakerp1: JustifiedTextView = findViewById(R.id.bakerp1)
        bakerp1.setText(R.string.bakerp1)

        val cookp1: JustifiedTextView = findViewById(R.id.cookp1)
        cookp1.setText(R.string.cookp1)

        val fabricatorp1: JustifiedTextView = findViewById(R.id.fabricatorp1)
        fabricatorp1.setText(R.string.fabricatorp1)

        val welderp1: JustifiedTextView = findViewById(R.id.welderp1)
        welderp1.setText(R.string.welderp1)

        val beauticianp1: JustifiedTextView = findViewById(R.id.beauticianp1)
        beauticianp1.setText(R.string.beauticianp1)

        val hairdresserp1: JustifiedTextView = findViewById(R.id.hairdresserp1)
        hairdresserp1.setText(R.string.hairdresserp1)

        val childcarep1: JustifiedTextView = findViewById(R.id.childcarep1)
        childcarep1.setText(R.string.childcarep1)

        val acp1: JustifiedTextView = findViewById(R.id.acp1)
        acp1.setText(R.string.acp1)

        val dressmakerp1: JustifiedTextView = findViewById(R.id.dressmakerp1)
        dressmakerp1.setText(R.string.dressmakerp1)

        val productionp1: JustifiedTextView = findViewById(R.id.productionp1)
        productionp1.setText(R.string.productionp1)

        val woodp1: JustifiedTextView = findViewById(R.id.woodp1)
        woodp1.setText(R.string.woodp1)





        // Find the expand button views from the included layout
        visionHeaderLayout = findViewById(R.id.visionHeaderLayout)
        visionArrow = findViewById(R.id.visionArrow)
        visionContentLayout = findViewById(R.id.visionContentLayout)

        // Set click listener on the expand button
        visionHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(visionContentLayout, visionArrow)
        }



        //centers -------------------------------------------------------------------


        // Initialize views
        dvtaHeaderLayout = findViewById(R.id.dvtaHeaderLayout)
        dvtaArrow = findViewById(R.id.dvtaArrow)
        dvtaContentLayout = findViewById(R.id.dvtaContentLayout)

        // Set click listener on dvtaHeaderLayout
        dvtaHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(dvtaContentLayout, dvtaArrow)
        }


        // Initialize views
        horanavtcHeaderLayout = findViewById(R.id.horanavtcHeaderLayout)
        horanavtcArrow = findViewById(R.id.horanavtcArrow)
        horanavtcContentLayout = findViewById(R.id.horanavtcContentLayout)

        // Set click listener on horanavtcHeaderLayout
        horanavtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(horanavtcContentLayout, horanavtcArrow)
        }


        // Initialize views
        kalutharavtcHeaderLayout = findViewById(R.id.kalutharavtcHeaderLayout)
        kalutharavtcArrow = findViewById(R.id.kalutharavtcArrow)
        kalutharavtcContentLayout = findViewById(R.id.kalutharavtcContentLayout)

        // Set click listener on kalutharavtcHeaderLayout
        kalutharavtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(kalutharavtcContentLayout, kalutharavtcArrow)
        }


        // Initialize views
        walanavtcHeaderLayout = findViewById(R.id.walanavtcHeaderLayout)
        walanavtcArrow = findViewById(R.id.walanavtcArrow)
        walanavtcContentLayout = findViewById(R.id.walanavtcContentLayout)

        // Set click listener on walanavtcHeaderLayout
        walanavtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(walanavtcContentLayout, walanavtcArrow)
        }


        // Initialize views
        walgamavtcHeaderLayout = findViewById(R.id.walgamavtcHeaderLayout)
        walgamavtcArrow = findViewById(R.id.walgamavtcArrow)
        walgamavtcContentLayout = findViewById(R.id.walgamavtcContentLayout)

        // Set click listener on walgamavtcHeaderLayout
        walgamavtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(walgamavtcContentLayout, walgamavtcArrow)
        }


        // Initialize views
        meegahathennavtcHeaderLayout = findViewById(R.id.meegahathennavtcHeaderLayout)
        meegahathennavtcArrow = findViewById(R.id.meegahathennavtcArrow)
        meegahathennavtcContentLayout = findViewById(R.id.meegahathennavtcContentLayout)

        // Set click listener on meegahathennavtcHeaderLayout
        meegahathennavtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(meegahathennavtcContentLayout, meegahathennavtcArrow)
        }


        // Initialize views
        dombagodacampvtcHeaderLayout = findViewById(R.id.dombagodacampvtcHeaderLayout)
        dombagodacampvtcArrow = findViewById(R.id.dombagodacampvtcArrow)
        dombagodacampvtcContentLayout = findViewById(R.id.dombagodacampvtcContentLayout)

        // Set click listener on dombagodacampvtcHeaderLayout
        dombagodacampvtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(dombagodacampvtcContentLayout, dombagodacampvtcArrow)
        }


        // Initialize views
        panapitiyavtcHeaderLayout = findViewById(R.id.panapitiyavtcHeaderLayout)
        panapitiyavtcArrow = findViewById(R.id.panapitiyavtcArrow)
        panapitiyavtcContentLayout = findViewById(R.id.panapitiyavtcContentLayout)

        // Set click listener on panapitiyavtcHeaderLayout
        panapitiyavtcHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(panapitiyavtcContentLayout, panapitiyavtcArrow)
        }


//home area ------------------------------------
        // Initialize views
        missionHeaderLayout = findViewById(R.id.missionHeaderLayout)
        missionArrow = findViewById(R.id.missionArrow)
        missionContentLayout = findViewById(R.id.missionContentLayout)

        // Set click listener on missionHeaderLayout
        missionHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(missionContentLayout, missionArrow)
        }


        // Initialize views
        objectiveHeaderLayout = findViewById(R.id.objectiveHeaderLayout)
        objectiveArrow = findViewById(R.id.objectiveArrow)
        objectiveContentLayout = findViewById(R.id.objectiveContentLayout)

        // Set click listener on objectiveHeaderLayout
        objectiveHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(objectiveContentLayout, objectiveArrow)
        }


        // Initialize views
        valuesHeaderLayout = findViewById(R.id.valuesHeaderLayout)
        valuesArrow = findViewById(R.id.valuesArrow)
        valuesContentLayout = findViewById(R.id.valuesContentLayout)

        // Set click listener on valuesHeaderLayout
        valuesHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(valuesContentLayout, valuesArrow)
        }


        // Initialize views
        functionsHeaderLayout = findViewById(R.id.functionsHeaderLayout)
        functionsArrow = findViewById(R.id.functionsArrow)
        functionsContentLayout = findViewById(R.id.functionsContentLayout)

        // Set click listener on functionsHeaderLayout
        functionsHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(functionsContentLayout, functionsArrow)
        }








        //courses ---------------------------------------------------------

        // Initialize views
        ict4HeaderLayout = findViewById(R.id.ict4HeaderLayout)
        ict4Arrow = findViewById(R.id.ict4Arrow)
        ict4ContentLayout = findViewById(R.id.ict4ContentLayout)

        // Set click listener on functionsHeaderLayout
        ict4HeaderLayout.setOnClickListener {
            toggleLayoutVisibility(ict4ContentLayout, ict4Arrow)
        }


        // Initialize views
        ict5HeaderLayout = findViewById(R.id.ict5HeaderLayout)
        ict5Arrow = findViewById(R.id.ict5Arrow)
        ict5ContentLayout = findViewById(R.id.ict5ContentLayout)

        // Set click listener on functionsHeaderLayout
        ict5HeaderLayout.setOnClickListener {
            toggleLayoutVisibility(ict5ContentLayout, ict5Arrow)
        }


        // Initialize views
        icthardwareHeaderLayout = findViewById(R.id.icthardwareHeaderLayout)
        icthardwareArrow = findViewById(R.id.icthardwareArrow)
        icthardwareContentLayout = findViewById(R.id.icthardwareContentLayout)

        // Set click listener on functionsHeaderLayout
        icthardwareHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(icthardwareContentLayout, icthardwareArrow)
        }


        // Initialize views
        softwaredevHeaderLayout = findViewById(R.id.softwaredevHeaderLayout)
        softwaredevArrow = findViewById(R.id.softwaredevArrow)
        softwaredevContentLayout = findViewById(R.id.softwaredevContentLayout)

        // Set click listener on functionsHeaderLayout
        softwaredevHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(softwaredevContentLayout, softwaredevArrow)
        }


        // Initialize views
        automobileHeaderLayout = findViewById(R.id.automobileHeaderLayout)
        automobileArrow = findViewById(R.id.automobileArrow)
        automobileContentLayout = findViewById(R.id.automobileContentLayout)

        // Set click listener on functionsHeaderLayout
        automobileHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(automobileContentLayout, automobileArrow)
        }


        // Initialize views
        autoacHeaderLayout = findViewById(R.id.autoacHeaderLayout)
        autoacArrow = findViewById(R.id.autoacArrow)
        autoacContentLayout = findViewById(R.id.autoacContentLayout)

        // Set click listener on functionsHeaderLayout
        autoacHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(autoacContentLayout, autoacArrow)
        }


        // Initialize views
        motorcycleHeaderLayout = findViewById(R.id.mortercycleHeaderLayout)
        motorcycleArrow = findViewById(R.id.mortercycleArrow)
        motorcycleContentLayout = findViewById(R.id.mortercycleContentLayout)


        motorcycleHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(motorcycleContentLayout, motorcycleArrow)
        }


        // Initialize views
        aluminiumHeaderLayout = findViewById(R.id.aluminiumHeaderLayout)
        aluminiumArrow = findViewById(R.id.aluminiumArrow)
        aluminiumContentLayout = findViewById(R.id.aluminiumContentLayout)

        aluminiumHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(aluminiumContentLayout, aluminiumArrow)
        }


        // Initialize views
        draughtspersonHeaderLayout = findViewById(R.id.draughtspersonHeaderLayout)
        draughtspersonArrow = findViewById(R.id.draughtspersonArrow)
        draughtspersonContentLayout = findViewById(R.id.draughtspersonContentLayout)

        // Set click listener on draughtspersonHeaderLayout
        draughtspersonHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(draughtspersonContentLayout, draughtspersonArrow)
        }


        // Initialize views
        constructionHeaderLayout = findViewById(R.id.constructionHeaderLayout)
        constructionArrow = findViewById(R.id.constructionArrow)
        constructionContentLayout = findViewById(R.id.constructionContentLayout)

        // Set click listener on constructionHeaderLayout
        constructionHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(constructionContentLayout, constructionArrow)
        }


        // Initialize views
        motorwinderHeaderLayout = findViewById(R.id.motorwinderHeaderLayout)
        motorwinderArrow = findViewById(R.id.motorwinderArrow)
        motorwinderContentLayout = findViewById(R.id.motorwinderContentLayout)

        // Set click listener on motorwinderHeaderLayout
        motorwinderHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(motorwinderContentLayout, motorwinderArrow)
        }


        // Initialize views
        electronictechnicianHeaderLayout = findViewById(R.id.electronictechnicianHeaderLayout)
        electronictechnicianArrow = findViewById(R.id.electronictechnicianArrow)
        electronictechnicianContentLayout = findViewById(R.id.electronictechnicianContentLayout)

        // Set click listener on electronictechnicianHeaderLayout
        electronictechnicianHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(electronictechnicianContentLayout, electronictechnicianArrow)
        }


        // Initialize views
        electricianHeaderLayout = findViewById(R.id.electricianHeaderLayout)
        electricianArrow = findViewById(R.id.electricianArrow)
        electricianContentLayout = findViewById(R.id.electricianContentLayout)

        // Set click listener on electricianHeaderLayout
        electricianHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(electricianContentLayout, electricianArrow)
        }


        // Initialize views
        bakerHeaderLayout = findViewById(R.id.bakerHeaderLayout)
        bakerArrow = findViewById(R.id.bakerArrow)
        bakerContentLayout = findViewById(R.id.bakerContentLayout)

        // Set click listener on bakerHeaderLayout
        bakerHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(bakerContentLayout, bakerArrow)
        }


        cookHeaderLayout = findViewById(R.id.cookHeaderLayout)
        cookArrow = findViewById(R.id.cookArrow)
        cookContentLayout = findViewById(R.id.cookContentLayout)

        // Set click listener on cookHeaderLayout
        cookHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(cookContentLayout, cookArrow)
        }


        // Initialize views
        fabricatorHeaderLayout = findViewById(R.id.fabricatorHeaderLayout)
        fabricatorArrow = findViewById(R.id.fabricatorArrow)
        fabricatorContentLayout = findViewById(R.id.fabricatorContentLayout)

        // Set click listener on fabricatorHeaderLayout
        fabricatorHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(fabricatorContentLayout, fabricatorArrow)
        }


        // Initialize views
        welderHeaderLayout = findViewById(R.id.welderHeaderLayout)
        welderArrow = findViewById(R.id.welderArrow)
        welderContentLayout = findViewById(R.id.welderContentLayout)

        // Set click listener on welderHeaderLayout
        welderHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(welderContentLayout, welderArrow)
        }


        // Initialize views
        beauticianHeaderLayout = findViewById(R.id.beauticianHeaderLayout)
        beauticianArrow = findViewById(R.id.beauticianArrow)
        beauticianContentLayout = findViewById(R.id.beauticianContentLayout)

        // Set click listener on beauticianHeaderLayout
        beauticianHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(beauticianContentLayout, beauticianArrow)
        }


        // Initialize views
        hairdresserHeaderLayout = findViewById(R.id.hairdresserHeaderLayout)
        hairdresserArrow = findViewById(R.id.hairdresserArrow)
        hairdresserContentLayout = findViewById(R.id.hairdresserContentLayout)

        // Set click listener on hairdresserHeaderLayout
        hairdresserHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(hairdresserContentLayout, hairdresserArrow)
        }


        // Initialize views
        childcareHeaderLayout = findViewById(R.id.childcareHeaderLayout)
        childcareArrow = findViewById(R.id.childcareArrow)
        childcareContentLayout = findViewById(R.id.childcareContentLayout)

        // Set click listener on childcareHeaderLayout
        childcareHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(childcareContentLayout, childcareArrow)
        }


        // Initialize views
        acHeaderLayout = findViewById(R.id.acHeaderLayout)
        acArrow = findViewById(R.id.acArrow)
        acContentLayout = findViewById(R.id.acContentLayout)

        // Set click listener on acHeaderLayout
        acHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(acContentLayout, acArrow)
        }


        // Initialize views
        dressmakerHeaderLayout = findViewById(R.id.dressmakerHeaderLayout)
        dressmakerArrow = findViewById(R.id.dressmakerArrow)
        dressmakerContentLayout = findViewById(R.id.dressmakerContentLayout)

        // Set click listener on dressmakerHeaderLayout
        dressmakerHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(dressmakerContentLayout, dressmakerArrow)
        }


        // Initialize views
        productionHeaderLayout = findViewById(R.id.productionHeaderLayout)
        productionArrow = findViewById(R.id.productionArrow)
        productionContentLayout = findViewById(R.id.productionContentLayout)

        // Set click listener on productionHeaderLayout
        productionHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(productionContentLayout, productionArrow)
        }


        // Initialize views
        woodHeaderLayout = findViewById(R.id.woodHeaderLayout)
        woodArrow = findViewById(R.id.woodArrow)
        woodContentLayout = findViewById(R.id.woodContentLayout)

        // Set click listener on woodHeaderLayout
        woodHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(woodContentLayout, woodArrow)
        }




//form data---------------------------------------------------------------------------
        radioGroup = findViewById(R.id.radioGroup)
        spinnerCourses = findViewById(R.id.spinnerCourses)
        spinnerCenters = findViewById(R.id.spinnerCenters)

        // Initialize the centerClassMap with dummy data
        centerClassMap["Grade 9"] = hashMapOf(
            "Automobile Mechanic" to listOf("Select Center", "Horana DVTC"),
            "Construction Craftman" to listOf("Select Center", "Panapitiya VTC"),
            "Fabricator(Metal)" to listOf("Select Center", "Horana DVTC"),
            "Welder" to listOf("Select Center", "Megahathenna VTC", "Dombagoda Camp VTC"),
            "Beautician" to listOf("Select Center", "Horana DVTC"),
            "Hairdresser" to listOf("Select Center", "Horana DVTC", "Kaluthara VTC", "Walana VTC"),
            "Childcare" to listOf("Select Center", "Horana DVTC", "Kaluthara VTC", "Walana VTC"),
            "AC" to listOf("Select Center", "Horana DVTC"),
            "Dressmaker" to listOf("Select Center", "Horana VTC"),
            "Garment Production Supervisor" to listOf("Select Center", "Horana VTC"),
            "Wood Craftsman (Furniture)" to listOf("Select Center", "Horana VTC")
        )

        centerClassMap["O/L"] = hashMapOf(
            "ICT Level 4" to listOf("Select Center", "Horana VTC", "Kandeviharaya VTC", "Megahathenna VTC", "Kaluthara VTC"),
            "Computer Hardware Technician" to listOf("Select Center", "Horana VTC"),
            "Software Development" to listOf("Select Center", "Kaluthara VTC", "Kandeviharaya VTC"),
            "Automobile Mechanic" to listOf("Select Center", "Horana DVTC"),
            "Automobile A/C Mechanic" to listOf("Select Center", "Horana VTC"),
            "Motor Cycle Mechanic" to listOf("Select Center", "Horana VTC", "Panapitiya VTC"),
            "Alluminium Fabricator" to listOf("Select Center", "Horana VTC"),
            "Draughtsperson" to listOf("Select Center", "Horana VTC"),
            "Construction Craftman" to listOf("Select Center", "Panapitiya VTC"),
            "Electric Motor Winder" to listOf("Select Center", "Horana VTC"),
            "Electronic Applicans Technician" to listOf("Select Center", "Horana VTC"),
            "Electrician" to listOf("Select Center", "Megahathenna VTC", "Panapitiya VTC", "Walgama VTC", "Kandeviharaya"),
            "Baker" to listOf("Select Center", "Horana DVTC"),
            "Cook" to listOf("Select Center", "Horana DVTC", "Panapitiya VTC", "Kaluthara VTC"),
            "Fabricator(Metal)" to listOf("Select Center", "Horana DVTC"),
            "Welder" to listOf("Select Center", "Megahathenna VTC", "Dombagoda Camp VTC"),
            "Beautician" to listOf("Select Center", "Horana DVTC"),
            "Hairdresser" to listOf("Select Center", "Horana DVTC", "Kaluthara VTC", "Walana VTC"),
            "Childcare" to listOf("Select Center", "Horana DVTC", "Kaluthara VTC", "Walana VTC"),
            "AC" to listOf("Select Center", "Horana DVTC"),
            "Dressmaker" to listOf("Select Center", "Horana VTC"),
            "Garment Production Supervisor" to listOf("Select Center", "Horana VTC"),
            "Wood Craftsman (Furniture)" to listOf("Select Center", "Horana VTC")
        )

        centerClassMap["A/L"] = hashMapOf(
            "ICT Level 4" to listOf("Select Center", "Horana VTC", "Kandeviharaya VTC", "Megahathenna VTC", "Kaluthara VTC"),
            "ICT Level 5" to listOf("Select Center", "Horana VTC"),
            "Computer Hardware Technician" to listOf("Select Center", "Horana VTC"),
            "Software Development" to listOf("Select Center", "Kaluthara VTC", "Kandeviharaya VTC"),
            "Automobile Mechanic" to listOf("Select Center", "Horana DVTC"),
            "Automobile A/C Mechanic" to listOf("Select Center", "Horana VTC"),
            "Motor Cycle Mechanic" to listOf("Select Center", "Horana VTC", "Panapitiya VTC"),
            "Alluminium Fabricator" to listOf("Select Center", "Horana VTC"),
            "Draughtsperson" to listOf("Select Center", "Horana VTC"),
            "Construction Craftman" to listOf("Select Center", "Panapitiya VTC"),
            "Electric Motor Winder" to listOf("Select Center", "Horana VTC"),
            "Electronic Applicans Technician" to listOf("Select Center", "Horana VTC"),
            "Electrician" to listOf("Select Center", "Megahathenna VTC", "Panapitiya VTC", "Walgama VTC", "Kandeviharaya"),
            "Baker" to listOf("Select Center", "Horana DVTC"),
            "Cook" to listOf("Select Center", "Horana DVTC", "Panapitiya VTC", "Kaluthara VTC"),
            "Fabricator(Metal)" to listOf("Select Center", "Horana DVTC"),
            "Welder" to listOf("Select Center", "Megahathenna VTC", "Dombagoda Camp VTC"),
            "Beautician" to listOf("Select Center", "Horana DVTC"),
            "Hairdresser" to listOf("Select Center", "Horana DVTC", "Kaluthara VTC", "Walana VTC"),
            "Childcare" to listOf("Select Center", "Horana DVTC", "Kaluthara VTC", "Walana VTC"),
            "AC" to listOf("Select Center", "Horana DVTC"),
            "Dressmaker" to listOf("Select Center", "Horana VTC"),
            "Garment Production Supervisor" to listOf("Select Center", "Horana VTC"),
            "Wood Craftsman (Furniture)" to listOf("Select Center", "Horana VTC")
        )
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            val selectedCategory = selectedRadioButton.text.toString()

            val courses = centerClassMap[selectedCategory]?.keys?.toList() ?: emptyList()

            val courseAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, courses)
            courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCourses.adapter = courseAdapter

            // Reset the selection of the course spinner
            spinnerCourses.setSelection(0)
            // Reset the selection of the center spinner
            spinnerCenters.setSelection(0)
        }

        spinnerCourses.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedCourse = spinnerCourses.selectedItem.toString()

                // Check if a course is selected
                if (selectedCourse != "Select Course") {
                    val selectedCategory = radioGroup.checkedRadioButtonId
                    val selectedCategoryRadioButton = findViewById<RadioButton>(selectedCategory)
                    val selectedCategoryText = selectedCategoryRadioButton.text.toString()

                    val centers = centerClassMap[selectedCategoryText]?.get(selectedCourse) ?: emptyList()

                    val centerAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_item, centers)
                    centerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    spinnerCenters.adapter = centerAdapter

                    // Reset the selection of the center spinner
                    spinnerCenters.setSelection(0)
                } else {
                    // Reset the selection of the center spinner
                    spinnerCenters.setSelection(0)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle the case when nothing is selected
            }
        }








//navigation area ------------------------------------------------------------------------------------

        bottomNavigation = findViewById(R.id.bottomNavigation)

        centers = findViewById(R.id.centers)
        courses = findViewById(R.id.courses)
        home = findViewById(R.id.home)
        info = findViewById(R.id.info)
        exit = findViewById(R.id.exit)

        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_center))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_course))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ic_add))
        bottomNavigation.add(MeowBottomNavigation.Model(5, R.drawable.ic_exit))

        bottomNavigation.show(3, enableAnimation = true)

        bottomNavigation.setOnClickMenuListener { model ->
            when (model.id) {
                1 -> {
                    centers.visibility = View.VISIBLE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
                2 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.VISIBLE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
                3 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.VISIBLE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
                4 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.VISIBLE
                    exit.visibility = View.GONE

                }
                5 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.VISIBLE

                    Handler(Looper.getMainLooper()).postDelayed({
                        finishAffinity() // Close all activities of the app
                    }, 1000)
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                1 -> {
                    centers.visibility = View.VISIBLE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES


        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                2 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.VISIBLE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                3 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.VISIBLE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                4 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.VISIBLE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                5 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.VISIBLE
                }
            }
            // YOUR CODES
        }





//buttons load----------------------------------------------------------------------------
        val selectict4courseButton: Button = findViewById(R.id.applyict4)
        selectict4courseButton.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 4"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("ICT Level 4")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val selectict5courseButton: Button = findViewById(R.id.applyict5)
        selectict5courseButton.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_al)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("ICT Level 5")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val selecticthardwarecourseButton: Button = findViewById(R.id.applyicthardware)
        selecticthardwarecourseButton.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Computer Hardware Technician")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applysoftwaredev: Button = findViewById(R.id.applysoftwaredev)
        applysoftwaredev.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Software Development")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyautomobile: Button = findViewById(R.id.applyautomobile)
        applyautomobile.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Automobile Mechanic")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyautoac: Button = findViewById(R.id.applyautoac)
        applyautoac.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Automobile A/C Mechanic")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applymortercycle: Button = findViewById(R.id.applymortercycle)
        applymortercycle.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Motor Cycle Mechanic")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyaluminium: Button = findViewById(R.id.applyaluminium)
        applyaluminium.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Alluminium Fabricator")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applydraughtsperson: Button = findViewById(R.id.applydraughtsperson)
        applydraughtsperson.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Draughtsperson")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyconstruction: Button = findViewById(R.id.applyconstruction)
        applyconstruction.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Construction Craftman")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applymotorwinder: Button = findViewById(R.id.applymotorwinder)
        applymotorwinder.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Electric Motor Winder")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyelectronictechnician: Button = findViewById(R.id.applyelectronictechnician)
        applyelectronictechnician.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Electronic Applicans Technician")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyelectrician: Button = findViewById(R.id.applyelectrician)
        applyelectrician.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Electrician")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applybaker: Button = findViewById(R.id.applybaker)
        applybaker.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Baker")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applycook: Button = findViewById(R.id.applycook)
        applycook.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_ol)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Cook")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyfabricator: Button = findViewById(R.id.applyfabricator)
        applyfabricator.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Fabricator(Metal)")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applywelder: Button = findViewById(R.id.applywelder)
        applywelder.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Welder")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applybeautician: Button = findViewById(R.id.applybeautician)
        applybeautician.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Beautician")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyhairdresser: Button = findViewById(R.id.applyhairdresser)
        applyhairdresser.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Hairdresser")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applychildcare: Button = findViewById(R.id.applychildcare)
        applychildcare.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Childcare")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyac: Button = findViewById(R.id.applyac)
        applyac.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("AC")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applydressmaker: Button = findViewById(R.id.applydressmaker)
        applydressmaker.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Dressmaker")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applyproduction: Button = findViewById(R.id.applyproduction)
        applyproduction.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Garment Production Supervisor")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

        val applywood: Button = findViewById(R.id.applywood)
        applywood.setOnClickListener {
            // Set the radio button to A/L
            val alRadioButton = findViewById<RadioButton>(R.id.radio_g9)
            alRadioButton.isChecked = true

            // Set the spinner selection to "ICT Level 5"
            val courseAdapter = spinnerCourses.adapter as ArrayAdapter<String>
            val position = courseAdapter.getPosition("Wood Craftsman (Furniture)")
            spinnerCourses.setSelection(position)

            // Hide other views and show the "info" page
            centers.visibility = View.GONE
            courses.visibility = View.GONE
            home.visibility = View.GONE
            info.visibility = View.VISIBLE
            exit.visibility = View.GONE

            // Update the bottom navigation to select the "info" menu item
            bottomNavigation.show(4, enableAnimation = true)
        }

















    }

    private fun checkMyPermission() {
        Dexter.withContext(this)
            .withPermission(Manifest.permission.ACCESS_FINE_LOCATION)
            .withListener(object : PermissionListener {
                override fun onPermissionGranted(permissionGrantedResponse: PermissionGrantedResponse) {
                    // Permission granted, handle the logic here
                    Toast.makeText(this@MainActivity, "Permission Granted", Toast.LENGTH_SHORT).show()
                    isPermissionGranted=true
                }

                override fun onPermissionDenied(permissionDeniedResponse: PermissionDeniedResponse) {
                    // Permission denied, handle the logic here
                    val intent = Intent()
                    intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                    val uri = Uri.fromParts("package", packageName, null)
                    intent.data = uri
                    startActivity(intent)
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissionRequest: PermissionRequest,
                    permissionToken: PermissionToken
                ) {
                    // Permission rationale should be shown, handle the logic here
                    // You can show a rationale dialog and request permission again if needed
                    permissionToken.continuePermissionRequest()
                }
            })
            .check()
    }




    private fun toggleLayoutVisibility(layout: LinearLayout, arrow: ImageView) {
        if (layout.visibility == View.GONE) {
            layout.visibility = View.VISIBLE
            arrow.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
        } else {
            layout.visibility = View.GONE
            arrow.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeByte(if (isPermissionGranted) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        // Custom code for handling the map when it is ready
        // Add markers, set camera position, etc.
        // Example:
        googleMap.addMarker(MarkerOptions().position(LatLng(0.0, 0.0)).title("Marker"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(0.0, 0.0), 10f))



    }



    private fun updateCardViewVisibility(selectedOption: String) {
        val ict4CardView: CardView = findViewById(R.id.ict4CardView)
        val ict5CardView: CardView = findViewById(R.id.ict5CardView)
        val icthardwareCardView: CardView = findViewById(R.id.icthardwareCardView)
        val softwaredevCardView: CardView = findViewById(R.id.softwaredevCardView)
        val automobileCardView: CardView = findViewById(R.id.automobileCardView)
        val autoacCardView: CardView = findViewById(R.id.autoacCardView)
        val mortercycleCardView: CardView = findViewById(R.id.mortercycleCardView)
        val aluminiumCardView: CardView = findViewById(R.id.aluminiumCardView)
        val draughtspersonCardView: CardView = findViewById(R.id.draughtspersonCardView)
        val constructionCardView: CardView = findViewById(R.id.constructionCardView)
        val motorwinderCardView: CardView = findViewById(R.id.motorwinderCardView)
        val electronictechnicianCardView: CardView = findViewById(R.id.electronictechnicianCardView)
        val electricianCardView: CardView = findViewById(R.id.electricianCardView)
        val bakerCardView: CardView = findViewById(R.id.bakerCardView)
        val cookCardView: CardView = findViewById(R.id.cookCardView)
        val fabricatorCardView: CardView = findViewById(R.id.fabricatorCardView)
        val welderCardView: CardView = findViewById(R.id.welderCardView)
        val beauticianCardView: CardView = findViewById(R.id.beauticianCardView)
        val hairdresserCardView: CardView = findViewById(R.id.hairdresserCardView)
        val childcareCardView: CardView = findViewById(R.id.childcareCardView)
        val acCardView: CardView = findViewById(R.id.acCardView)
        val dressmakerCardView: CardView = findViewById(R.id.dressmakerCardView)
        val productionCardView: CardView = findViewById(R.id.productionCardView)
        val woodCardView: CardView = findViewById(R.id.woodCardView)


        when (selectedOption) {
            "All" -> {
                ict4CardView.visibility = View.VISIBLE
                ict5CardView.visibility = View.VISIBLE
                icthardwareCardView.visibility = View.VISIBLE
                softwaredevCardView.visibility = View.VISIBLE
                automobileCardView.visibility = View.VISIBLE
                autoacCardView.visibility = View.VISIBLE
                mortercycleCardView.visibility = View.VISIBLE
                aluminiumCardView.visibility = View.VISIBLE
                draughtspersonCardView.visibility = View.VISIBLE
                constructionCardView.visibility = View.VISIBLE
                motorwinderCardView.visibility = View.VISIBLE
                electronictechnicianCardView.visibility = View.VISIBLE
                electricianCardView.visibility = View.VISIBLE
                bakerCardView.visibility = View.VISIBLE
                cookCardView.visibility = View.VISIBLE
                fabricatorCardView.visibility = View.VISIBLE
                welderCardView.visibility = View.VISIBLE
                beauticianCardView.visibility = View.VISIBLE
                hairdresserCardView.visibility = View.VISIBLE
                childcareCardView.visibility = View.VISIBLE
                acCardView.visibility = View.VISIBLE
                dressmakerCardView.visibility = View.VISIBLE
                productionCardView.visibility = View.VISIBLE
                woodCardView.visibility = View.VISIBLE
            }
            "Information Communication and Multimedia Technology" -> {
                ict4CardView.visibility = View.VISIBLE
                ict5CardView.visibility = View.VISIBLE
                icthardwareCardView.visibility = View.VISIBLE
                softwaredevCardView.visibility = View.VISIBLE

                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Automobile Repair and Maintenance" -> {
                automobileCardView.visibility = View.VISIBLE
                autoacCardView.visibility = View.VISIBLE
                mortercycleCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE

                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Building and Construction" -> {
                aluminiumCardView.visibility = View.VISIBLE
                draughtspersonCardView.visibility = View.VISIBLE
                constructionCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE

                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Electrical and Electronic Communication" -> {
                motorwinderCardView.visibility = View.VISIBLE
                electronictechnicianCardView.visibility = View.VISIBLE
                electricianCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE

                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Food Technology" -> {
                bakerCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE

                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Hotel and Tourism" -> {
                cookCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE

                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Metal and Light Engineering" -> {
                fabricatorCardView.visibility = View.VISIBLE
                welderCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE

                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Personal Community Development" -> {
                beauticianCardView.visibility = View.VISIBLE
                hairdresserCardView.visibility = View.VISIBLE
                childcareCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE

                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Refrigeration and Air Conditioning" -> {
                acCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE

                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
                woodCardView.visibility = View.GONE
            }
            "Textile and Garment" -> {
                dressmakerCardView.visibility = View.VISIBLE
                productionCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE

                woodCardView.visibility = View.GONE
            }
            "Wood Related" -> {
                woodCardView.visibility = View.VISIBLE

                ict4CardView.visibility = View.GONE
                ict5CardView.visibility = View.GONE
                icthardwareCardView.visibility = View.GONE
                softwaredevCardView.visibility = View.GONE
                automobileCardView.visibility = View.GONE
                autoacCardView.visibility = View.GONE
                mortercycleCardView.visibility = View.GONE
                aluminiumCardView.visibility = View.GONE
                draughtspersonCardView.visibility = View.GONE
                constructionCardView.visibility = View.GONE
                motorwinderCardView.visibility = View.GONE
                electronictechnicianCardView.visibility = View.GONE
                electricianCardView.visibility = View.GONE
                bakerCardView.visibility = View.GONE
                cookCardView.visibility = View.GONE
                fabricatorCardView.visibility = View.GONE
                welderCardView.visibility = View.GONE
                beauticianCardView.visibility = View.GONE
                hairdresserCardView.visibility = View.GONE
                childcareCardView.visibility = View.GONE
                acCardView.visibility = View.GONE
                dressmakerCardView.visibility = View.GONE
                productionCardView.visibility = View.GONE
            }
        }
    }

}

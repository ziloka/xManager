package com.xc3fff0e.xmanager;

import com.xc3fff0e.xmanager.SplashActivity;
import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wuyr.rippleanimation.*;
import java.io.*;
import java.io.File;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import static android.os.Build.VERSION.SDK_INT;
import androidx.appcompat.app.AlertDialog;
import androidx.core.widget.NestedScrollView;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.*;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {
	
     private RewardedAd mRewardedAd;
	private Timer _timer = new Timer();
	
	private double CHECK = 0;
	private String PATH = "";
	private double COUNTER = 0;
	private double DELETE = 0;
	private String download_selected_0 = "";
	private String download_ready_0 = "";
	private String download_ready_desc_0 = "";
	private String downloading_file_0 = "";
	private String download_success_0 = "";
	private String download_0 = "";
	private String cancel_0 = "";
	private String continue_0 = "";
	private String later_0 = "";
	private String install_now_0 = "";
	private String go_back_0 = "";
	private String install_update_0 = "";
	private double CLOSER_1 = 0;
	private double CLOSER_2 = 0;
	private String Installed_Checker = "";
	private String Installed_Checker_Cloned = "";
	private double Installed_Version = 0;
	private double Downloaded_Version = 0;
	private double Installed_Version_Cloned = 0;
	private double Downloaded_Version_Cloned = 0;
	private String installation_failed_0 = "";
	private String installation_failed_desc_0 = "";
	private String installation_failed_cloned_desc_0 = "";
	private String close_0 = "";
	private String uninstall_0 = "";
	private String existing_patched_0 = "";
	private String existing_patched_desc_0 = "";
	private HashMap<String, Object> Datas = new HashMap<>();
	private String Regular = "";
	private String Amoled = "";
	private String Regular_Cloned = "";
	private String Amoled_Cloned = "";
	private String Mod_Changelogs = "";
	private double Current_Version = 0;
	private double Latest_Version = 0;
	private double CLICKER_1 = 0;
	private double CLICKER_2 = 0;
	private double CLICKER_3 = 0;
	private  AlertDialog AlertDialog;
	private String Lite = "";
	private double CLICKER_4 = 0;
	private double Installed_Version_Lite = 0;
	private double Downloaded_Version_Lite = 0;
	private String Installed_Checker_Lite = "";
	private String Stock_Patched = "";
	private String Amoled_Patched = "";
	private String Stock_Cloned_Patched = "";
	private String Amoled_Cloned_Patched = "";
	private String Lite_Patched = "";
	private String Patched_Changelogs = "";
	private String Stock_Experimental_Patched = "";
	private String Amoled_Experimental_Patched = "";
	private String Stock_Experimental_Cloned_Patched = "";
	private String Amoled_Experimental_Cloned_Patched = "";
	private String lite_0 = "";
	private String mirror_0 = "";
	private String installation_failed_spap_desc_0 = "";
	
	private ArrayList<String> Language = new ArrayList<>();
	private ArrayList<String> Theme = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> stock_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> amoled_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> stock_cloned_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> amoled_cloned_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> lite_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> patched_changelogs = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> stock_experimental_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> amoled_experimental_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> stock_experimental_cloned_patched = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> amoled_experimental_cloned_patched = new ArrayList<>();
	
	private LinearLayout box_header;
	private LinearLayout main_body_optimization;
	private ScrollView main_scroll_settings;
	private ScrollView main_scroll_about;
	private SwipeRefreshLayout main_refresh_layout;
	private TextView title_header;
	private TextView title_header_separator;
	private TextView title_header_beta;
	private LinearLayout box_header_tab;
	private LinearLayout box_experiment;
	private LinearLayout box_switch;
	private LinearLayout box_update;
	private ImageView icon_experiment;
	private ImageView icon_switch;
	private ImageView icon_update;
	private TextView experiment_title;
	private TextView hidden_download_1;
	private TextView hidden_download_2;
	private TextView hidden_download_3;
	private TextView hidden_patched;
	private TextView installation_failed;
	private TextView existing_patched;
	private TextView close;
	private TextView mirror;
	private TextView spap;
	private TextView uninstall_patched;
	private TextView open_settings;
	private TextView uninstall;
	private TextView delete;
	private TextView open_patched;
	private TextView ignore;
	private TextView cloned;
	private TextView install;
	private TextView existing_patched_desc;
	private TextView installation_failed_cloned_desc;
	private TextView installation_failed_spap_desc;
	private TextView installation_failed_desc;
	private TextView hidden_update;
	private TextView app_changelogs;
	private TextView download_selected;
	private TextView download_ready;
	private TextView download_ready_desc;
	private TextView downloading_file;
	private TextView download_success;
	private TextView maintenance_desc;
	private TextView maintenance;
	private TextView thanks;
	private TextView main_title;
	private TextView settings_title;
	private TextView about_title;
	private TextView file_directory;
	private TextView new_update;
	private TextView continue_1;
	private TextView cancel;
	private TextView download;
	private TextView later;
	private TextView directory;
	private TextView install_now;
	private TextView install_update;
	private TextView go_back;
	private TextView download_update;
	private TextView not_now;
	private TextView lite;
	private TextView show_support;
	private TextView show_support_desc;
	private LinearLayout main_body_settings;
	private LinearLayout box_settings_close;
	private LinearLayout main_box_16;
	private LinearLayout main_box_18;
	private LinearLayout main_box_8;
	private LinearLayout main_box_11;
	private LinearLayout main_box_17;
	private LinearLayout main_box_5;
	private LinearLayout main_box_14;
	private LinearLayout main_box_9;
	private LinearLayout main_box_10;
	private LinearLayout main_box_13;
	private LinearLayout box_settings_icon_close;
	private ImageView settings_icon_close;
	private LinearLayout box_16_sub_1;
	private LinearLayout box_16_sub_2;
	private LinearLayout title_box_5;
	private LinearLayout box_cloned_version;
	private TextView cloned_version;
	private Switch cloned_version_switch;
	private TextView cloned_version_info;
	private LinearLayout box_18_sub_1;
	private LinearLayout box_18_sub_2;
	private LinearLayout title_box_7;
	private LinearLayout box_experiment_version;
	private TextView experiment_version;
	private Switch experiment_version_switch;
	private TextView experiment_version_info;
	private LinearLayout box_8_sub_1;
	private LinearLayout box_8_sub_2;
	private LinearLayout title_box_1;
	private LinearLayout box_list_auto_refresh;
	private TextView list_auto_refresh;
	private Switch list_auto_refresh_switch;
	private TextView list_auto_refresh_info;
	private LinearLayout box_11_sub_1;
	private LinearLayout box_11_sub_2;
	private LinearLayout title_box_2;
	private LinearLayout box_force_auto_install;
	private TextView force_auto_install;
	private Switch force_auto_install_switch;
	private TextView force_auto_install_info;
	private LinearLayout box_17_sub_1;
	private LinearLayout box_17_sub_2;
	private LinearLayout title_box_6;
	private LinearLayout box_disable_reward_ad;
	private TextView disable_reward_ad;
	private Switch disable_reward_ad_switch;
	private TextView disable_reward_ad_info;
	private LinearLayout box_5_sub_1;
	private TextView theme;
	private LinearLayout box_theme_switch;
	private Spinner select_theme;
	private LinearLayout box_14_sub_1;
	private TextView language;
	private LinearLayout box_language_switch;
	private Spinner select_language;
	private LinearLayout box_9_sub_1;
	private LinearLayout box_9_sub_2;
	private TextView apk_location;
	private EditText apk_path_location;
	private TextView apk_location_info;
	private LinearLayout box_10_sub_1;
	private LinearLayout box_10_sub_2;
	private TextView clear_directory_folders;
	private TextView clear_directory_folders_info;
	private LinearLayout box_reboot;
	private LinearLayout box_reset_preferences;
	private TextView reboot;
	private TextView reset_preferences;
	private LinearLayout main_body_about;
	private LinearLayout box_about_close;
	private LinearLayout box_about_header;
	private LinearLayout box_about_sub;
	private LinearLayout box_about_1;
	private LinearLayout box_about_2;
	private LinearLayout box_about_3;
	private LinearLayout box_about_4;
	private LinearLayout box_about_5;
	private LinearLayout box_about_6;
	private LinearLayout box_about_7;
	private TextView contributors;
	private LinearLayout box_icon_close;
	private ImageView icon_close;
	private TextView title_about;
	private TextView local_version;
	private TextView sub_title;
	private TextView xmanager_dev;
	private TextView developer_1;
	private TextView patched_devs;
	private TextView developer_2;
	private TextView support_team;
	private TextView support_1;
	private TextView manager_testers;
	private TextView testers_1;
	private TextView manager_hosting;
	private TextView hosting_1;
	private TextView mobilism_team;
	private TextView mobilism_1;
	private TextView forum_team;
	private TextView forum_1;
	private TextView manager_lang_13;
	private TextView translator_13;
	private TextView manager_lang_1;
	private TextView translator_1;
	private TextView manager_lang_2;
	private TextView translator_2;
	private TextView manager_lang_3;
	private TextView translator_3;
	private TextView manager_lang_4;
	private TextView translator_4;
	private TextView manager_lang_5;
	private TextView translator_5;
	private TextView manager_lang_6;
	private TextView translator_6;
	private TextView manager_lang_7;
	private TextView translator_7;
	private TextView manager_lang_8;
	private TextView translator_8;
	private TextView manager_lang_15;
	private TextView translator_15;
	private TextView manager_lang_9;
	private TextView translator_9;
	private TextView manager_lang_14;
	private TextView translator_14;
	private TextView manager_lang_10;
	private TextView translator_10;
	private TextView manager_lang_12;
	private TextView translator_12;
	private TextView manager_lang_11;
	private TextView translator_11;
	private TextView manager_lang_16;
	private TextView translator_16;
	private TextView manager_lang_17;
	private TextView translator_17;
	private TextView manager_lang_18;
	private TextView translator_18;
	private TextView manager_lang_19;
	private TextView translator_19;
	private TextView manager_lang_20;
	private TextView translator_20;
	private TextView manager_lang_21;
	private TextView translator_21;
	private TextView manager_lang_22;
	private TextView translator_22;
	private TextView manager_lang_23;
	private TextView translator_23;
	private TextView manager_lang_24;
	private TextView translator_24;
	private TextView manager_lang_25;
	private TextView translator_25;
	private TextView manager_lang_26;
	private TextView translator_26;
	private TextView manager_lang_27;
	private TextView translator_27;
	private TextView manager_lang_28;
	private TextView translator_28;
	private TextView manager_lang_29;
	private TextView translator_29;
	private TextView manager_lang_30;
	private TextView translator_30;
	private TextView manager_lang_31;
	private TextView translator_31;
	private TextView manager_lang_32;
	private TextView translator_32;
	private TextView manager_lang_33;
	private TextView translator_33;
	private TextView manager_lang_34;
	private TextView translator_34;
	private TextView manager_donors;
	private TextView donors_1;
	private ScrollView main_scroll_body;
	private LinearLayout main_body;
	private LinearLayout main_box_1;
	private LinearLayout main_box_2;
	private LinearLayout main_box_3;
	private LinearLayout main_box_6;
	private LinearLayout box_sub_header;
	private LinearLayout main_box_4;
	private LinearLayout main_box_15;
	private LinearLayout box_1;
	private LinearLayout box_2;
	private LinearLayout box_separator_1;
	private LinearLayout box_5;
	private ListView list_items_1;
	private TextView title_1;
	private LinearLayout box_1_sub;
	private TextView stock_info;
	private TextView sub_text_1;
	private LinearLayout box_switch_1;
	private TextView sub_1;
	private TextView sub_3;
	private TextView sub_5;
	private TextView sub_7;
	private TextView versions_1;
	private LinearLayout box_sub_5;
	private ImageView version_oc_01;
	private LinearLayout box_3;
	private LinearLayout box_4;
	private LinearLayout box_separator_2;
	private LinearLayout box_6;
	private ListView list_items_2;
	private TextView title_2;
	private LinearLayout box_2_sub;
	private TextView amoled_info;
	private TextView sub_text_2;
	private LinearLayout box_switch_2;
	private TextView sub_2;
	private TextView sub_4;
	private TextView sub_6;
	private TextView sub_8;
	private TextView versions_2;
	private LinearLayout box_sub_6;
	private ImageView version_oc_02;
	private LinearLayout box_7;
	private LinearLayout box_8;
	private LinearLayout box_separator_3;
	private LinearLayout box_9;
	private ListView list_items_3;
	private TextView title_3;
	private LinearLayout box_3_sub;
	private TextView lite_info;
	private TextView sub_text_3;
	private LinearLayout box_switch_3;
	private TextView sub_9;
	private TextView versions_3;
	private LinearLayout box_sub_7;
	private ImageView version_oc_03;
	private LinearLayout box_6_sub_2;
	private LinearLayout box_separator_4;
	private LinearLayout box_6_sub_3;
	private ListView list_items_4;
	private TextView sub_text_installed;
	private LinearLayout box_installed;
	private TextView sub_installed;
	private TextView sub_separator_1;
	private TextView sub_installed_c;
	private TextView sub_separator_2;
	private TextView sub_installed_l;
	private TextView changelogs;
	private LinearLayout box_changelogs;
	private ImageView changelogs_oc;
	private LinearLayout box_sub_1;
	private LinearLayout box_sub_2;
	private TextView title_sub;
	private LinearLayout box_uninstall;
	private LinearLayout box_settings;
	private LinearLayout box_cache;
	private LinearLayout box_open;
	private ImageView icon_uninstall;
	private ImageView icon_settings;
	private ImageView icon_cache;
	private ImageView icon_open;
	private LinearLayout box_support;
	private LinearLayout box_reddit;
	private LinearLayout box_donate;
	private LinearLayout box_about;
	private TextView support;
	private ImageView icon_support;
	private TextView reddit;
	private ImageView icon_reddit;
	private TextView donate;
	private ImageView icon_donate;
	private TextView about;
	private ImageView icon_about;
	private LinearLayout box_discord;
	private LinearLayout box_source;
	private LinearLayout box_website;
	private LinearLayout box_faq;
	private TextView discord;
	private ImageView icon_discord;
	private TextView source;
	private ImageView icon_source;
	private TextView website;
	private ImageView icon_website;
	private TextView faq;
	private ImageView icon_faq;
	
	private TimerTask Timer;
	private SharedPreferences ON_SCREEN;
	private SharedPreferences THEME;
	private SharedPreferences DESC_X;
	private RequestNetwork Connection;
	private RequestNetwork.RequestListener _Connection_request_listener;
	private FileProvider FileProvider;
	private File File_Fixer;
	private SharedPreferences LIST_REFRESH;
	private SharedPreferences APK_PATH;
	private SharedPreferences FORCE_INSTALL;
	private SharedPreferences FORCE_INSTALL_UPDATE;
	private SharedPreferences LANGUAGE;
	private SharedPreferences DISABLE_REWARD_AD;
	private SharedPreferences AD_UNIT;
	private SharedPreferences SWITCH_VERSION;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		box_header = findViewById(R.id.box_header);
		main_body_optimization = findViewById(R.id.main_body_optimization);
		main_scroll_settings = findViewById(R.id.main_scroll_settings);
		main_scroll_about = findViewById(R.id.main_scroll_about);
		main_refresh_layout = findViewById(R.id.main_refresh_layout);
		title_header = findViewById(R.id.title_header);
		title_header_separator = findViewById(R.id.title_header_separator);
		title_header_beta = findViewById(R.id.title_header_beta);
		box_header_tab = findViewById(R.id.box_header_tab);
		box_experiment = findViewById(R.id.box_experiment);
		box_switch = findViewById(R.id.box_switch);
		box_update = findViewById(R.id.box_update);
		icon_experiment = findViewById(R.id.icon_experiment);
		icon_switch = findViewById(R.id.icon_switch);
		icon_update = findViewById(R.id.icon_update);
		experiment_title = findViewById(R.id.experiment_title);
		hidden_download_1 = findViewById(R.id.hidden_download_1);
		hidden_download_2 = findViewById(R.id.hidden_download_2);
		hidden_download_3 = findViewById(R.id.hidden_download_3);
		hidden_patched = findViewById(R.id.hidden_patched);
		installation_failed = findViewById(R.id.installation_failed);
		existing_patched = findViewById(R.id.existing_patched);
		close = findViewById(R.id.close);
		mirror = findViewById(R.id.mirror);
		spap = findViewById(R.id.spap);
		uninstall_patched = findViewById(R.id.uninstall_patched);
		open_settings = findViewById(R.id.open_settings);
		uninstall = findViewById(R.id.uninstall);
		delete = findViewById(R.id.delete);
		open_patched = findViewById(R.id.open_patched);
		ignore = findViewById(R.id.ignore);
		cloned = findViewById(R.id.cloned);
		install = findViewById(R.id.install);
		existing_patched_desc = findViewById(R.id.existing_patched_desc);
		installation_failed_cloned_desc = findViewById(R.id.installation_failed_cloned_desc);
		installation_failed_spap_desc = findViewById(R.id.installation_failed_spap_desc);
		installation_failed_desc = findViewById(R.id.installation_failed_desc);
		hidden_update = findViewById(R.id.hidden_update);
		app_changelogs = findViewById(R.id.app_changelogs);
		download_selected = findViewById(R.id.download_selected);
		download_ready = findViewById(R.id.download_ready);
		download_ready_desc = findViewById(R.id.download_ready_desc);
		downloading_file = findViewById(R.id.downloading_file);
		download_success = findViewById(R.id.download_success);
		maintenance_desc = findViewById(R.id.maintenance_desc);
		maintenance = findViewById(R.id.maintenance);
		thanks = findViewById(R.id.thanks);
		main_title = findViewById(R.id.main_title);
		settings_title = findViewById(R.id.settings_title);
		about_title = findViewById(R.id.about_title);
		file_directory = findViewById(R.id.file_directory);
		new_update = findViewById(R.id.new_update);
		continue_1 = findViewById(R.id.continue_1);
		cancel = findViewById(R.id.cancel);
		download = findViewById(R.id.download);
		later = findViewById(R.id.later);
		directory = findViewById(R.id.directory);
		install_now = findViewById(R.id.install_now);
		install_update = findViewById(R.id.install_update);
		go_back = findViewById(R.id.go_back);
		download_update = findViewById(R.id.download_update);
		not_now = findViewById(R.id.not_now);
		lite = findViewById(R.id.lite);
		show_support = findViewById(R.id.show_support);
		show_support_desc = findViewById(R.id.show_support_desc);
		main_body_settings = findViewById(R.id.main_body_settings);
		box_settings_close = findViewById(R.id.box_settings_close);
		main_box_16 = findViewById(R.id.main_box_16);
		main_box_18 = findViewById(R.id.main_box_18);
		main_box_8 = findViewById(R.id.main_box_8);
		main_box_11 = findViewById(R.id.main_box_11);
		main_box_17 = findViewById(R.id.main_box_17);
		main_box_5 = findViewById(R.id.main_box_5);
		main_box_14 = findViewById(R.id.main_box_14);
		main_box_9 = findViewById(R.id.main_box_9);
		main_box_10 = findViewById(R.id.main_box_10);
		main_box_13 = findViewById(R.id.main_box_13);
		box_settings_icon_close = findViewById(R.id.box_settings_icon_close);
		settings_icon_close = findViewById(R.id.settings_icon_close);
		box_16_sub_1 = findViewById(R.id.box_16_sub_1);
		box_16_sub_2 = findViewById(R.id.box_16_sub_2);
		title_box_5 = findViewById(R.id.title_box_5);
		box_cloned_version = findViewById(R.id.box_cloned_version);
		cloned_version = findViewById(R.id.cloned_version);
		cloned_version_switch = findViewById(R.id.cloned_version_switch);
		cloned_version_info = findViewById(R.id.cloned_version_info);
		box_18_sub_1 = findViewById(R.id.box_18_sub_1);
		box_18_sub_2 = findViewById(R.id.box_18_sub_2);
		title_box_7 = findViewById(R.id.title_box_7);
		box_experiment_version = findViewById(R.id.box_experiment_version);
		experiment_version = findViewById(R.id.experiment_version);
		experiment_version_switch = findViewById(R.id.experiment_version_switch);
		experiment_version_info = findViewById(R.id.experiment_version_info);
		box_8_sub_1 = findViewById(R.id.box_8_sub_1);
		box_8_sub_2 = findViewById(R.id.box_8_sub_2);
		title_box_1 = findViewById(R.id.title_box_1);
		box_list_auto_refresh = findViewById(R.id.box_list_auto_refresh);
		list_auto_refresh = findViewById(R.id.list_auto_refresh);
		list_auto_refresh_switch = findViewById(R.id.list_auto_refresh_switch);
		list_auto_refresh_info = findViewById(R.id.list_auto_refresh_info);
		box_11_sub_1 = findViewById(R.id.box_11_sub_1);
		box_11_sub_2 = findViewById(R.id.box_11_sub_2);
		title_box_2 = findViewById(R.id.title_box_2);
		box_force_auto_install = findViewById(R.id.box_force_auto_install);
		force_auto_install = findViewById(R.id.force_auto_install);
		force_auto_install_switch = findViewById(R.id.force_auto_install_switch);
		force_auto_install_info = findViewById(R.id.force_auto_install_info);
		box_17_sub_1 = findViewById(R.id.box_17_sub_1);
		box_17_sub_2 = findViewById(R.id.box_17_sub_2);
		title_box_6 = findViewById(R.id.title_box_6);
		box_disable_reward_ad = findViewById(R.id.box_disable_reward_ad);
		disable_reward_ad = findViewById(R.id.disable_reward_ad);
		disable_reward_ad_switch = findViewById(R.id.disable_reward_ad_switch);
		disable_reward_ad_info = findViewById(R.id.disable_reward_ad_info);
		box_5_sub_1 = findViewById(R.id.box_5_sub_1);
		theme = findViewById(R.id.theme);
		box_theme_switch = findViewById(R.id.box_theme_switch);
		select_theme = findViewById(R.id.select_theme);
		box_14_sub_1 = findViewById(R.id.box_14_sub_1);
		language = findViewById(R.id.language);
		box_language_switch = findViewById(R.id.box_language_switch);
		select_language = findViewById(R.id.select_language);
		box_9_sub_1 = findViewById(R.id.box_9_sub_1);
		box_9_sub_2 = findViewById(R.id.box_9_sub_2);
		apk_location = findViewById(R.id.apk_location);
		apk_path_location = findViewById(R.id.apk_path_location);
		apk_location_info = findViewById(R.id.apk_location_info);
		box_10_sub_1 = findViewById(R.id.box_10_sub_1);
		box_10_sub_2 = findViewById(R.id.box_10_sub_2);
		clear_directory_folders = findViewById(R.id.clear_directory_folders);
		clear_directory_folders_info = findViewById(R.id.clear_directory_folders_info);
		box_reboot = findViewById(R.id.box_reboot);
		box_reset_preferences = findViewById(R.id.box_reset_preferences);
		reboot = findViewById(R.id.reboot);
		reset_preferences = findViewById(R.id.reset_preferences);
		main_body_about = findViewById(R.id.main_body_about);
		box_about_close = findViewById(R.id.box_about_close);
		box_about_header = findViewById(R.id.box_about_header);
		box_about_sub = findViewById(R.id.box_about_sub);
		box_about_1 = findViewById(R.id.box_about_1);
		box_about_2 = findViewById(R.id.box_about_2);
		box_about_3 = findViewById(R.id.box_about_3);
		box_about_4 = findViewById(R.id.box_about_4);
		box_about_5 = findViewById(R.id.box_about_5);
		box_about_6 = findViewById(R.id.box_about_6);
		box_about_7 = findViewById(R.id.box_about_7);
		contributors = findViewById(R.id.contributors);
		box_icon_close = findViewById(R.id.box_icon_close);
		icon_close = findViewById(R.id.icon_close);
		title_about = findViewById(R.id.title_about);
		local_version = findViewById(R.id.local_version);
		sub_title = findViewById(R.id.sub_title);
		xmanager_dev = findViewById(R.id.xmanager_dev);
		developer_1 = findViewById(R.id.developer_1);
		patched_devs = findViewById(R.id.patched_devs);
		developer_2 = findViewById(R.id.developer_2);
		support_team = findViewById(R.id.support_team);
		support_1 = findViewById(R.id.support_1);
		manager_testers = findViewById(R.id.manager_testers);
		testers_1 = findViewById(R.id.testers_1);
		manager_hosting = findViewById(R.id.manager_hosting);
		hosting_1 = findViewById(R.id.hosting_1);
		mobilism_team = findViewById(R.id.mobilism_team);
		mobilism_1 = findViewById(R.id.mobilism_1);
		forum_team = findViewById(R.id.forum_team);
		forum_1 = findViewById(R.id.forum_1);
		manager_lang_13 = findViewById(R.id.manager_lang_13);
		translator_13 = findViewById(R.id.translator_13);
		manager_lang_1 = findViewById(R.id.manager_lang_1);
		translator_1 = findViewById(R.id.translator_1);
		manager_lang_2 = findViewById(R.id.manager_lang_2);
		translator_2 = findViewById(R.id.translator_2);
		manager_lang_3 = findViewById(R.id.manager_lang_3);
		translator_3 = findViewById(R.id.translator_3);
		manager_lang_4 = findViewById(R.id.manager_lang_4);
		translator_4 = findViewById(R.id.translator_4);
		manager_lang_5 = findViewById(R.id.manager_lang_5);
		translator_5 = findViewById(R.id.translator_5);
		manager_lang_6 = findViewById(R.id.manager_lang_6);
		translator_6 = findViewById(R.id.translator_6);
		manager_lang_7 = findViewById(R.id.manager_lang_7);
		translator_7 = findViewById(R.id.translator_7);
		manager_lang_8 = findViewById(R.id.manager_lang_8);
		translator_8 = findViewById(R.id.translator_8);
		manager_lang_15 = findViewById(R.id.manager_lang_15);
		translator_15 = findViewById(R.id.translator_15);
		manager_lang_9 = findViewById(R.id.manager_lang_9);
		translator_9 = findViewById(R.id.translator_9);
		manager_lang_14 = findViewById(R.id.manager_lang_14);
		translator_14 = findViewById(R.id.translator_14);
		manager_lang_10 = findViewById(R.id.manager_lang_10);
		translator_10 = findViewById(R.id.translator_10);
		manager_lang_12 = findViewById(R.id.manager_lang_12);
		translator_12 = findViewById(R.id.translator_12);
		manager_lang_11 = findViewById(R.id.manager_lang_11);
		translator_11 = findViewById(R.id.translator_11);
		manager_lang_16 = findViewById(R.id.manager_lang_16);
		translator_16 = findViewById(R.id.translator_16);
		manager_lang_17 = findViewById(R.id.manager_lang_17);
		translator_17 = findViewById(R.id.translator_17);
		manager_lang_18 = findViewById(R.id.manager_lang_18);
		translator_18 = findViewById(R.id.translator_18);
		manager_lang_19 = findViewById(R.id.manager_lang_19);
		translator_19 = findViewById(R.id.translator_19);
		manager_lang_20 = findViewById(R.id.manager_lang_20);
		translator_20 = findViewById(R.id.translator_20);
		manager_lang_21 = findViewById(R.id.manager_lang_21);
		translator_21 = findViewById(R.id.translator_21);
		manager_lang_22 = findViewById(R.id.manager_lang_22);
		translator_22 = findViewById(R.id.translator_22);
		manager_lang_23 = findViewById(R.id.manager_lang_23);
		translator_23 = findViewById(R.id.translator_23);
		manager_lang_24 = findViewById(R.id.manager_lang_24);
		translator_24 = findViewById(R.id.translator_24);
		manager_lang_25 = findViewById(R.id.manager_lang_25);
		translator_25 = findViewById(R.id.translator_25);
		manager_lang_26 = findViewById(R.id.manager_lang_26);
		translator_26 = findViewById(R.id.translator_26);
		manager_lang_27 = findViewById(R.id.manager_lang_27);
		translator_27 = findViewById(R.id.translator_27);
		manager_lang_28 = findViewById(R.id.manager_lang_28);
		translator_28 = findViewById(R.id.translator_28);
		manager_lang_29 = findViewById(R.id.manager_lang_29);
		translator_29 = findViewById(R.id.translator_29);
		manager_lang_30 = findViewById(R.id.manager_lang_30);
		translator_30 = findViewById(R.id.translator_30);
		manager_lang_31 = findViewById(R.id.manager_lang_31);
		translator_31 = findViewById(R.id.translator_31);
		manager_lang_32 = findViewById(R.id.manager_lang_32);
		translator_32 = findViewById(R.id.translator_32);
		manager_lang_33 = findViewById(R.id.manager_lang_33);
		translator_33 = findViewById(R.id.translator_33);
		manager_lang_34 = findViewById(R.id.manager_lang_34);
		translator_34 = findViewById(R.id.translator_34);
		manager_donors = findViewById(R.id.manager_donors);
		donors_1 = findViewById(R.id.donors_1);
		main_scroll_body = findViewById(R.id.main_scroll_body);
		main_body = findViewById(R.id.main_body);
		main_box_1 = findViewById(R.id.main_box_1);
		main_box_2 = findViewById(R.id.main_box_2);
		main_box_3 = findViewById(R.id.main_box_3);
		main_box_6 = findViewById(R.id.main_box_6);
		box_sub_header = findViewById(R.id.box_sub_header);
		main_box_4 = findViewById(R.id.main_box_4);
		main_box_15 = findViewById(R.id.main_box_15);
		box_1 = findViewById(R.id.box_1);
		box_2 = findViewById(R.id.box_2);
		box_separator_1 = findViewById(R.id.box_separator_1);
		box_5 = findViewById(R.id.box_5);
		list_items_1 = findViewById(R.id.list_items_1);
		title_1 = findViewById(R.id.title_1);
		box_1_sub = findViewById(R.id.box_1_sub);
		stock_info = findViewById(R.id.stock_info);
		sub_text_1 = findViewById(R.id.sub_text_1);
		box_switch_1 = findViewById(R.id.box_switch_1);
		sub_1 = findViewById(R.id.sub_1);
		sub_3 = findViewById(R.id.sub_3);
		sub_5 = findViewById(R.id.sub_5);
		sub_7 = findViewById(R.id.sub_7);
		versions_1 = findViewById(R.id.versions_1);
		box_sub_5 = findViewById(R.id.box_sub_5);
		version_oc_01 = findViewById(R.id.version_oc_01);
		box_3 = findViewById(R.id.box_3);
		box_4 = findViewById(R.id.box_4);
		box_separator_2 = findViewById(R.id.box_separator_2);
		box_6 = findViewById(R.id.box_6);
		list_items_2 = findViewById(R.id.list_items_2);
		title_2 = findViewById(R.id.title_2);
		box_2_sub = findViewById(R.id.box_2_sub);
		amoled_info = findViewById(R.id.amoled_info);
		sub_text_2 = findViewById(R.id.sub_text_2);
		box_switch_2 = findViewById(R.id.box_switch_2);
		sub_2 = findViewById(R.id.sub_2);
		sub_4 = findViewById(R.id.sub_4);
		sub_6 = findViewById(R.id.sub_6);
		sub_8 = findViewById(R.id.sub_8);
		versions_2 = findViewById(R.id.versions_2);
		box_sub_6 = findViewById(R.id.box_sub_6);
		version_oc_02 = findViewById(R.id.version_oc_02);
		box_7 = findViewById(R.id.box_7);
		box_8 = findViewById(R.id.box_8);
		box_separator_3 = findViewById(R.id.box_separator_3);
		box_9 = findViewById(R.id.box_9);
		list_items_3 = findViewById(R.id.list_items_3);
		title_3 = findViewById(R.id.title_3);
		box_3_sub = findViewById(R.id.box_3_sub);
		lite_info = findViewById(R.id.lite_info);
		sub_text_3 = findViewById(R.id.sub_text_3);
		box_switch_3 = findViewById(R.id.box_switch_3);
		sub_9 = findViewById(R.id.sub_9);
		versions_3 = findViewById(R.id.versions_3);
		box_sub_7 = findViewById(R.id.box_sub_7);
		version_oc_03 = findViewById(R.id.version_oc_03);
		box_6_sub_2 = findViewById(R.id.box_6_sub_2);
		box_separator_4 = findViewById(R.id.box_separator_4);
		box_6_sub_3 = findViewById(R.id.box_6_sub_3);
		list_items_4 = findViewById(R.id.list_items_4);
		sub_text_installed = findViewById(R.id.sub_text_installed);
		box_installed = findViewById(R.id.box_installed);
		sub_installed = findViewById(R.id.sub_installed);
		sub_separator_1 = findViewById(R.id.sub_separator_1);
		sub_installed_c = findViewById(R.id.sub_installed_c);
		sub_separator_2 = findViewById(R.id.sub_separator_2);
		sub_installed_l = findViewById(R.id.sub_installed_l);
		changelogs = findViewById(R.id.changelogs);
		box_changelogs = findViewById(R.id.box_changelogs);
		changelogs_oc = findViewById(R.id.changelogs_oc);
		box_sub_1 = findViewById(R.id.box_sub_1);
		box_sub_2 = findViewById(R.id.box_sub_2);
		title_sub = findViewById(R.id.title_sub);
		box_uninstall = findViewById(R.id.box_uninstall);
		box_settings = findViewById(R.id.box_settings);
		box_cache = findViewById(R.id.box_cache);
		box_open = findViewById(R.id.box_open);
		icon_uninstall = findViewById(R.id.icon_uninstall);
		icon_settings = findViewById(R.id.icon_settings);
		icon_cache = findViewById(R.id.icon_cache);
		icon_open = findViewById(R.id.icon_open);
		box_support = findViewById(R.id.box_support);
		box_reddit = findViewById(R.id.box_reddit);
		box_donate = findViewById(R.id.box_donate);
		box_about = findViewById(R.id.box_about);
		support = findViewById(R.id.support);
		icon_support = findViewById(R.id.icon_support);
		reddit = findViewById(R.id.reddit);
		icon_reddit = findViewById(R.id.icon_reddit);
		donate = findViewById(R.id.donate);
		icon_donate = findViewById(R.id.icon_donate);
		about = findViewById(R.id.about);
		icon_about = findViewById(R.id.icon_about);
		box_discord = findViewById(R.id.box_discord);
		box_source = findViewById(R.id.box_source);
		box_website = findViewById(R.id.box_website);
		box_faq = findViewById(R.id.box_faq);
		discord = findViewById(R.id.discord);
		icon_discord = findViewById(R.id.icon_discord);
		source = findViewById(R.id.source);
		icon_source = findViewById(R.id.icon_source);
		website = findViewById(R.id.website);
		icon_website = findViewById(R.id.icon_website);
		faq = findViewById(R.id.faq);
		icon_faq = findViewById(R.id.icon_faq);
		ON_SCREEN = getSharedPreferences("ON_SCREEN", Activity.MODE_PRIVATE);
		THEME = getSharedPreferences("THEME", Activity.MODE_PRIVATE);
		DESC_X = getSharedPreferences("DESC_X", Activity.MODE_PRIVATE);
		Connection = new RequestNetwork(this);
		LIST_REFRESH = getSharedPreferences("LIST_REFRESH", Activity.MODE_PRIVATE);
		APK_PATH = getSharedPreferences("APK_PATH", Activity.MODE_PRIVATE);
		FORCE_INSTALL = getSharedPreferences("FORCE_INSTALL", Activity.MODE_PRIVATE);
		FORCE_INSTALL_UPDATE = getSharedPreferences("FORCE_INSTALL_UPDATE", Activity.MODE_PRIVATE);
		LANGUAGE = getSharedPreferences("LANGUAGE", Activity.MODE_PRIVATE);
		DISABLE_REWARD_AD = getSharedPreferences("DISABLE_REWARD_AD", Activity.MODE_PRIVATE);
		AD_UNIT = getSharedPreferences("AD_UNIT", Activity.MODE_PRIVATE);
		SWITCH_VERSION = getSharedPreferences("SWITCH_VERSION", Activity.MODE_PRIVATE);
		
		box_experiment.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				RippleAnimation.create(box_experiment).setDuration((long)1000).start();
				main_body_optimization.setVisibility(View.GONE);
				main_scroll_settings.setVisibility(View.VISIBLE);
				main_scroll_about.setVisibility(View.GONE);
				main_refresh_layout.setVisibility(View.GONE);
				box_experiment.setVisibility(View.GONE);
				box_switch.setVisibility(View.GONE);
				box_update.setVisibility(View.GONE);
				main_box_5.setVisibility(View.GONE);
				main_box_8.setVisibility(View.GONE);
				main_box_9.setVisibility(View.VISIBLE);
				main_box_10.setVisibility(View.GONE);
				main_box_11.setVisibility(View.GONE);
				main_box_13.setVisibility(View.GONE);
				main_box_14.setVisibility(View.GONE);
				main_box_16.setVisibility(View.VISIBLE);
				main_box_17.setVisibility(View.GONE);
				main_box_18.setVisibility(View.VISIBLE);
				apk_path_location.setEnabled(true);
				main_box_10.setEnabled(false);
				main_box_10.setAlpha((float)(0.0d));
				title_header.setText(experiment_title.getText().toString());
				title_header_beta.setTextColor(Color.TRANSPARENT);
				title_header_separator.setTextColor(Color.TRANSPARENT);
				_Tap_Animation(box_experiment);
				CLOSER_2 = 1;
				_Animation_4();
				_Language_UI();
				_Theme_UI();
			}
		});
		
		box_switch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				RippleAnimation.create(box_switch).setDuration((long)1000).start();
				main_body_optimization.setVisibility(View.GONE);
				main_scroll_settings.setVisibility(View.VISIBLE);
				main_scroll_about.setVisibility(View.GONE);
				main_refresh_layout.setVisibility(View.GONE);
				box_experiment.setVisibility(View.GONE);
				box_switch.setVisibility(View.GONE);
				box_update.setVisibility(View.GONE);
				main_box_5.setVisibility(View.VISIBLE);
				main_box_8.setVisibility(View.VISIBLE);
				main_box_9.setVisibility(View.GONE);
				main_box_10.setVisibility(View.VISIBLE);
				main_box_11.setVisibility(View.VISIBLE);
				main_box_13.setVisibility(View.VISIBLE);
				main_box_14.setVisibility(View.VISIBLE);
				main_box_16.setVisibility(View.GONE);
				main_box_17.setVisibility(View.VISIBLE);
				main_box_18.setVisibility(View.GONE);
				apk_path_location.setEnabled(true);
				main_box_10.setEnabled(true);
				main_box_10.setAlpha((float)(1.0d));
				title_header.setText(settings_title.getText().toString());
				title_header_beta.setTextColor(Color.TRANSPARENT);
				title_header_separator.setTextColor(Color.TRANSPARENT);
				_Tap_Animation(box_switch);
				CLOSER_2 = 1;
				_Animation_1();
				_Language_UI();
				_Theme_UI();
			}
		});
		
		box_update.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (CHECK == 0) {
						CHECK = 1;
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										CHECK = 0;
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(2000));
						if (!SketchwareUtil.isConnected(getApplicationContext())) {
							com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or No Internet Connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
						}
						else {
							if (Latest_Version > Current_Version) {
								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Checking Updates...", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								Timer = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												try {
													final AlertDialog.Builder Update_Authorized = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
													
													String Title = "<b>".concat(new_update.getText().toString().concat("</b>"));
													String TitleColor = "1DB954";
													
													Update_Authorized.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
													String Message = "What's New (Version ".concat(String.valueOf(Latest_Version).concat("):<br/><br/>".concat(app_changelogs.getText().toString().replace("\n", "<br/>"))));
													String MessageColor = "FFFFFF";
													
													Update_Authorized.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
													Update_Authorized.setPositiveButton(download_update.getText().toString(), new DialogInterface.OnClickListener(){
														
														                @Override
														                public void onClick(DialogInterface Update_Authorized, int p) {
															AlertDialog.setCancelable(true);
															try {
																if (FORCE_INSTALL_UPDATE.getString("FORCE_INSTALL_UPDATE", "").equals("XX")) {
																	_Download_Update_Install(hidden_update.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/");
																}
																else {
																	if (FORCE_INSTALL_UPDATE.getString("FORCE_INSTALL_UPDATE", "").equals("YY")) {
																		_Download_Update(hidden_update.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/");
																	}
																}
															}
															catch(Exception e) {
															}
															_Update_Remover();
															                }
														            });
													 Update_Authorized.setNeutralButton(not_now.getText().toString(), new DialogInterface.OnClickListener(){
														
														                @Override
														                public void onClick(DialogInterface Update_Authorized, int p) {
															AlertDialog.setCancelable(true);
															                }
														            });
													AlertDialog = Update_Authorized.create();
													AlertDialog.setCancelable(false);
													AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
													AlertDialog.show();
												}
												catch(Exception e) {
												}
											}
										});
									}
								};
								_timer.schedule(Timer, (int)(2800));
							}
							else {
								if (Latest_Version == Current_Version) {
									com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Checking Updates...", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
									Timer = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													try {
														final AlertDialog.Builder Update_Latest = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
														
														String Title = "<b>".concat("xManager v".concat(local_version.getText().toString().concat(" (Latest)")).concat("</b>"));
														String TitleColor = "1DB954";
														
														Update_Latest.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
														String Message = app_changelogs.getText().toString().replace("\n", "<br/>");
														String MessageColor = "FFFFFF";
														
														Update_Latest.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
														AlertDialog = Update_Latest.create();
														AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
														AlertDialog.show();
													}
													catch(Exception e) {
													}
												}
											});
										}
									};
									_timer.schedule(Timer, (int)(2800));
								}
							}
						}
					}
					_Tap_Animation(box_update);
				}
				catch(Exception e) {
				}
			}
		});
		
		main_box_10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/")) {
					FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/");
				}
				else {
					if (!FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/")) {
						
					}
				}
				if (DELETE == 1) {
					com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Successfully Deleted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				}
				else {
					if (DELETE == 0) {
						com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Directory folder not found or deleted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
					}
				}
				_Tap_Animation(main_box_10);
				DELETE = 0;
			}
		});
		
		box_settings_icon_close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				RippleAnimation.create(box_settings_icon_close).setDuration((long)1000).start();
				main_body_optimization.setVisibility(View.GONE);
				main_scroll_settings.setVisibility(View.GONE);
				main_scroll_about.setVisibility(View.GONE);
				main_refresh_layout.setVisibility(View.VISIBLE);
				box_experiment.setVisibility(View.VISIBLE);
				box_switch.setVisibility(View.VISIBLE);
				box_update.setVisibility(View.VISIBLE);
				apk_path_location.setEnabled(false);
				title_header.setText(main_title.getText().toString());
				title_header_beta.setTextColor(0xFFFFFFFF);
				title_header_separator.setTextColor(0xFFFFFFFF);
				Animation header_beta;
				header_beta = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
				header_beta.setDuration(200); title_header_beta.startAnimation(header_beta);
				header_beta = null;
				_Tap_Animation(box_settings_icon_close);
				CLOSER_2 = 0;
				_Animation_0();
			}
		});
		
		cloned_version_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (!_isChecked && !experiment_version_switch.isChecked()) {
					SWITCH_VERSION.edit().putString("SWITCH", "A").commit();
					stock_info.setText("Ad-free, unlimited skips and play on-demand");
					amoled_info.setText("Same features but in amoled black theme");
					stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
					amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
					stock_info.setTextSize((int)12);
					amoled_info.setTextSize((int)12);
					sub_1.setVisibility(View.VISIBLE);
					sub_2.setVisibility(View.VISIBLE);
					sub_3.setVisibility(View.GONE);
					sub_4.setVisibility(View.GONE);
					sub_5.setVisibility(View.GONE);
					sub_6.setVisibility(View.GONE);
					sub_7.setVisibility(View.GONE);
					sub_8.setVisibility(View.GONE);
					list_items_1.setVisibility(View.GONE);
					list_items_2.setVisibility(View.GONE);
					list_items_3.setVisibility(View.GONE);
					list_items_4.setVisibility(View.GONE);
					version_oc_01.setImageResource(R.drawable.close);
					version_oc_02.setImageResource(R.drawable.close);
					version_oc_03.setImageResource(R.drawable.close);
					changelogs_oc.setImageResource(R.drawable.close);
					list_items_1.setAdapter(new List_items_1Adapter(stock_patched));
					list_items_2.setAdapter(new List_items_2Adapter(amoled_patched));
					((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
					((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
					CLICKER_1 = 1;
					CLICKER_2 = 1;
					CLICKER_3 = 1;
					CLICKER_4 = 1;
				}
				else {
					if (_isChecked && !experiment_version_switch.isChecked()) {
						SWITCH_VERSION.edit().putString("SWITCH", "B").commit();
						stock_info.setText("A cloned version of the stock patched");
						amoled_info.setText("A cloned version of the stock patched with amoled black theme");
						stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
						amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
						stock_info.setTextSize((int)12);
						amoled_info.setTextSize((int)12);
						sub_1.setVisibility(View.GONE);
						sub_2.setVisibility(View.GONE);
						sub_3.setVisibility(View.VISIBLE);
						sub_4.setVisibility(View.VISIBLE);
						sub_5.setVisibility(View.GONE);
						sub_6.setVisibility(View.GONE);
						sub_7.setVisibility(View.GONE);
						sub_8.setVisibility(View.GONE);
						list_items_1.setVisibility(View.GONE);
						list_items_2.setVisibility(View.GONE);
						list_items_3.setVisibility(View.GONE);
						list_items_4.setVisibility(View.GONE);
						version_oc_01.setImageResource(R.drawable.close);
						version_oc_02.setImageResource(R.drawable.close);
						version_oc_03.setImageResource(R.drawable.close);
						changelogs_oc.setImageResource(R.drawable.close);
						list_items_1.setAdapter(new List_items_1Adapter(stock_cloned_patched));
						list_items_2.setAdapter(new List_items_2Adapter(amoled_cloned_patched));
						((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
						((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
						CLICKER_1 = 1;
						CLICKER_2 = 1;
						CLICKER_3 = 1;
						CLICKER_4 = 1;
					}
					else {
						if (!_isChecked && experiment_version_switch.isChecked()) {
							SWITCH_VERSION.edit().putString("SWITCH", "C").commit();
							stock_info.setText("Experimental. New features. Unstable.");
							amoled_info.setText("Same experimental features but in amoled black theme. Unstable.");
							stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
							amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
							stock_info.setTextSize((int)12);
							amoled_info.setTextSize((int)12);
							sub_1.setVisibility(View.GONE);
							sub_2.setVisibility(View.GONE);
							sub_3.setVisibility(View.GONE);
							sub_4.setVisibility(View.GONE);
							sub_5.setVisibility(View.VISIBLE);
							sub_6.setVisibility(View.VISIBLE);
							sub_7.setVisibility(View.GONE);
							sub_8.setVisibility(View.GONE);
							list_items_1.setVisibility(View.GONE);
							list_items_2.setVisibility(View.GONE);
							list_items_3.setVisibility(View.GONE);
							list_items_4.setVisibility(View.GONE);
							version_oc_01.setImageResource(R.drawable.close);
							version_oc_02.setImageResource(R.drawable.close);
							version_oc_03.setImageResource(R.drawable.close);
							changelogs_oc.setImageResource(R.drawable.close);
							list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_patched));
							list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_patched));
							((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
							((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
							CLICKER_1 = 1;
							CLICKER_2 = 1;
							CLICKER_3 = 1;
							CLICKER_4 = 1;
						}
						else {
							if (_isChecked && experiment_version_switch.isChecked()) {
								SWITCH_VERSION.edit().putString("SWITCH", "D").commit();
								stock_info.setText("Experimental cloned. Unstable.");
								amoled_info.setText("Same experimental cloned features. Unstable.");
								stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
								amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
								stock_info.setTextSize((int)12);
								amoled_info.setTextSize((int)12);
								sub_1.setVisibility(View.GONE);
								sub_2.setVisibility(View.GONE);
								sub_3.setVisibility(View.GONE);
								sub_4.setVisibility(View.GONE);
								sub_5.setVisibility(View.GONE);
								sub_6.setVisibility(View.GONE);
								sub_7.setVisibility(View.VISIBLE);
								sub_8.setVisibility(View.VISIBLE);
								list_items_1.setVisibility(View.GONE);
								list_items_2.setVisibility(View.GONE);
								list_items_3.setVisibility(View.GONE);
								list_items_4.setVisibility(View.GONE);
								version_oc_01.setImageResource(R.drawable.close);
								version_oc_02.setImageResource(R.drawable.close);
								version_oc_03.setImageResource(R.drawable.close);
								changelogs_oc.setImageResource(R.drawable.close);
								list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_cloned_patched));
								list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_cloned_patched));
								((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
								((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
								CLICKER_1 = 1;
								CLICKER_2 = 1;
								CLICKER_3 = 1;
								CLICKER_4 = 1;
							}
						}
					}
				}
				COUNTER = 1;
			}
		});
		
		experiment_version_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (!_isChecked && !cloned_version_switch.isChecked()) {
					SWITCH_VERSION.edit().putString("SWITCH", "A").commit();
					stock_info.setText("Ad-free, unlimited skips and play on-demand");
					amoled_info.setText("Same features but in amoled black theme");
					stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
					amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
					stock_info.setTextSize((int)12);
					amoled_info.setTextSize((int)12);
					sub_1.setVisibility(View.VISIBLE);
					sub_2.setVisibility(View.VISIBLE);
					sub_3.setVisibility(View.GONE);
					sub_4.setVisibility(View.GONE);
					sub_5.setVisibility(View.GONE);
					sub_6.setVisibility(View.GONE);
					sub_7.setVisibility(View.GONE);
					sub_8.setVisibility(View.GONE);
					list_items_1.setVisibility(View.GONE);
					list_items_2.setVisibility(View.GONE);
					list_items_3.setVisibility(View.GONE);
					list_items_4.setVisibility(View.GONE);
					version_oc_01.setImageResource(R.drawable.close);
					version_oc_02.setImageResource(R.drawable.close);
					version_oc_03.setImageResource(R.drawable.close);
					changelogs_oc.setImageResource(R.drawable.close);
					list_items_1.setAdapter(new List_items_1Adapter(stock_patched));
					list_items_2.setAdapter(new List_items_2Adapter(amoled_patched));
					((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
					((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
					CLICKER_1 = 1;
					CLICKER_2 = 1;
					CLICKER_3 = 1;
					CLICKER_4 = 1;
				}
				else {
					if (!_isChecked && cloned_version_switch.isChecked()) {
						SWITCH_VERSION.edit().putString("SWITCH", "B").commit();
						stock_info.setText("A cloned version of the stock patched");
						amoled_info.setText("A cloned version of the stock patched with amoled black theme");
						stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
						amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
						stock_info.setTextSize((int)12);
						amoled_info.setTextSize((int)12);
						sub_1.setVisibility(View.GONE);
						sub_2.setVisibility(View.GONE);
						sub_3.setVisibility(View.VISIBLE);
						sub_4.setVisibility(View.VISIBLE);
						sub_5.setVisibility(View.GONE);
						sub_6.setVisibility(View.GONE);
						sub_7.setVisibility(View.GONE);
						sub_8.setVisibility(View.GONE);
						list_items_1.setVisibility(View.GONE);
						list_items_2.setVisibility(View.GONE);
						list_items_3.setVisibility(View.GONE);
						list_items_4.setVisibility(View.GONE);
						version_oc_01.setImageResource(R.drawable.close);
						version_oc_02.setImageResource(R.drawable.close);
						version_oc_03.setImageResource(R.drawable.close);
						changelogs_oc.setImageResource(R.drawable.close);
						list_items_1.setAdapter(new List_items_1Adapter(stock_cloned_patched));
						list_items_2.setAdapter(new List_items_2Adapter(amoled_cloned_patched));
						((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
						((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
						CLICKER_1 = 1;
						CLICKER_2 = 1;
						CLICKER_3 = 1;
						CLICKER_4 = 1;
					}
					else {
						if (_isChecked && !cloned_version_switch.isChecked()) {
							SWITCH_VERSION.edit().putString("SWITCH", "C").commit();
							stock_info.setText("Experimental. New features. Unstable.");
							amoled_info.setText("Same experimental features but in amoled black theme. Unstable.");
							stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
							amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
							stock_info.setTextSize((int)12);
							amoled_info.setTextSize((int)12);
							sub_1.setVisibility(View.GONE);
							sub_2.setVisibility(View.GONE);
							sub_3.setVisibility(View.GONE);
							sub_4.setVisibility(View.GONE);
							sub_5.setVisibility(View.VISIBLE);
							sub_6.setVisibility(View.VISIBLE);
							sub_7.setVisibility(View.GONE);
							sub_8.setVisibility(View.GONE);
							list_items_1.setVisibility(View.GONE);
							list_items_2.setVisibility(View.GONE);
							list_items_3.setVisibility(View.GONE);
							list_items_4.setVisibility(View.GONE);
							version_oc_01.setImageResource(R.drawable.close);
							version_oc_02.setImageResource(R.drawable.close);
							version_oc_03.setImageResource(R.drawable.close);
							changelogs_oc.setImageResource(R.drawable.close);
							list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_patched));
							list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_patched));
							((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
							((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
							CLICKER_1 = 1;
							CLICKER_2 = 1;
							CLICKER_3 = 1;
							CLICKER_4 = 1;
						}
						else {
							if (_isChecked && cloned_version_switch.isChecked()) {
								SWITCH_VERSION.edit().putString("SWITCH", "D").commit();
								stock_info.setText("Experimental cloned. Unstable.");
								amoled_info.setText("Same experimental cloned features. Unstable.");
								stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
								amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
								stock_info.setTextSize((int)12);
								amoled_info.setTextSize((int)12);
								sub_1.setVisibility(View.GONE);
								sub_2.setVisibility(View.GONE);
								sub_3.setVisibility(View.GONE);
								sub_4.setVisibility(View.GONE);
								sub_5.setVisibility(View.GONE);
								sub_6.setVisibility(View.GONE);
								sub_7.setVisibility(View.VISIBLE);
								sub_8.setVisibility(View.VISIBLE);
								list_items_1.setVisibility(View.GONE);
								list_items_2.setVisibility(View.GONE);
								list_items_3.setVisibility(View.GONE);
								list_items_4.setVisibility(View.GONE);
								version_oc_01.setImageResource(R.drawable.close);
								version_oc_02.setImageResource(R.drawable.close);
								version_oc_03.setImageResource(R.drawable.close);
								changelogs_oc.setImageResource(R.drawable.close);
								list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_cloned_patched));
								list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_cloned_patched));
								((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
								((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
								CLICKER_1 = 1;
								CLICKER_2 = 1;
								CLICKER_3 = 1;
								CLICKER_4 = 1;
							}
						}
					}
				}
				COUNTER = 1;
			}
		});
		
		list_auto_refresh_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					LIST_REFRESH.edit().putString("UPDATE", "ON").commit();
				}
				else {
					LIST_REFRESH.edit().putString("UPDATE", "OFF").commit();
				}
				COUNTER = 1;
			}
		});
		
		force_auto_install_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					FORCE_INSTALL.edit().putString("FORCE_INSTALL", "X").commit();
					FORCE_INSTALL_UPDATE.edit().putString("FORCE_INSTALL_UPDATE", "XX").commit();
				}
				else {
					FORCE_INSTALL.edit().putString("FORCE_INSTALL", "Y").commit();
					FORCE_INSTALL_UPDATE.edit().putString("FORCE_INSTALL_UPDATE", "YY").commit();
				}
				COUNTER = 1;
			}
		});
		
		disable_reward_ad_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					DISABLE_REWARD_AD.edit().putString("REWARD_AD", "ON").commit();
				}
				else {
					DISABLE_REWARD_AD.edit().putString("REWARD_AD", "OFF").commit();
				}
				COUNTER = 1;
			}
		});
		
		select_theme.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					THEME.edit().putString("THEME", "0").commit();
					COUNTER = 1;
					_Theme_UI();
				}
				else {
					if (_position == 1) {
						THEME.edit().putString("THEME", "1").commit();
						COUNTER = 1;
						_Theme_UI();
					}
					else {
						if (_position == 2) {
							THEME.edit().putString("THEME", "2").commit();
							COUNTER = 1;
							_Theme_UI();
						}
						else {
							if (_position == 3) {
								THEME.edit().putString("THEME", "3").commit();
								COUNTER = 1;
								_Theme_UI();
							}
							else {
								if (_position == 4) {
									THEME.edit().putString("THEME", "4").commit();
									COUNTER = 1;
									_Theme_UI();
								}
								else {
									if (_position == 5) {
										THEME.edit().putString("THEME", "5").commit();
										COUNTER = 1;
										_Theme_UI();
									}
									else {
										if (_position == 6) {
											THEME.edit().putString("THEME", "6").commit();
											COUNTER = 1;
											_Theme_UI();
										}
										else {
											if (_position == 7) {
												THEME.edit().putString("THEME", "7").commit();
												COUNTER = 1;
												_Theme_UI();
											}
											else {
												if (_position == 8) {
													THEME.edit().putString("THEME", "8").commit();
													COUNTER = 1;
													_Theme_UI();
												}
												else {
													if (_position == 9) {
														THEME.edit().putString("THEME", "9").commit();
														COUNTER = 1;
														_Theme_UI();
													}
													else {
														if (_position == 10) {
															THEME.edit().putString("THEME", "10").commit();
															COUNTER = 1;
															_Theme_UI();
														}
														else {
															if (_position == 11) {
																THEME.edit().putString("THEME", "11").commit();
																COUNTER = 1;
																_Theme_UI();
															}
															else {
																if (_position == 12) {
																	THEME.edit().putString("THEME", "12").commit();
																	COUNTER = 1;
																	_Theme_UI();
																}
																else {
																	if (_position == 13) {
																		THEME.edit().putString("THEME", "13").commit();
																		COUNTER = 1;
																		_Theme_UI();
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		select_language.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					LANGUAGE.edit().putString("LANGUAGE", "0").commit();
					COUNTER = 1;
					_Language_UI();
				}
				else {
					if (_position == 1) {
						LANGUAGE.edit().putString("LANGUAGE", "1").commit();
						COUNTER = 1;
						_Language_UI();
					}
					else {
						if (_position == 2) {
							LANGUAGE.edit().putString("LANGUAGE", "2").commit();
							COUNTER = 1;
							_Language_UI();
						}
						else {
							if (_position == 3) {
								LANGUAGE.edit().putString("LANGUAGE", "3").commit();
								COUNTER = 1;
								_Language_UI();
							}
							else {
								if (_position == 4) {
									LANGUAGE.edit().putString("LANGUAGE", "4").commit();
									COUNTER = 1;
									_Language_UI();
								}
								else {
									if (_position == 5) {
										LANGUAGE.edit().putString("LANGUAGE", "5").commit();
										COUNTER = 1;
										_Language_UI();
									}
									else {
										if (_position == 6) {
											LANGUAGE.edit().putString("LANGUAGE", "6").commit();
											COUNTER = 1;
											_Language_UI();
										}
										else {
											if (_position == 7) {
												LANGUAGE.edit().putString("LANGUAGE", "7").commit();
												COUNTER = 1;
												_Language_UI();
											}
											else {
												if (_position == 8) {
													LANGUAGE.edit().putString("LANGUAGE", "8").commit();
													COUNTER = 1;
													_Language_UI();
												}
												else {
													if (_position == 9) {
														LANGUAGE.edit().putString("LANGUAGE", "9").commit();
														COUNTER = 1;
														_Language_UI();
													}
													else {
														if (_position == 10) {
															LANGUAGE.edit().putString("LANGUAGE", "10").commit();
															COUNTER = 1;
															_Language_UI();
														}
														else {
															if (_position == 11) {
																LANGUAGE.edit().putString("LANGUAGE", "11").commit();
																COUNTER = 1;
																_Language_UI();
															}
															else {
																if (_position == 12) {
																	LANGUAGE.edit().putString("LANGUAGE", "12").commit();
																	COUNTER = 1;
																	_Language_UI();
																}
																else {
																	if (_position == 13) {
																		LANGUAGE.edit().putString("LANGUAGE", "13").commit();
																		COUNTER = 1;
																		_Language_UI();
																	}
																	else {
																		if (_position == 14) {
																			LANGUAGE.edit().putString("LANGUAGE", "14").commit();
																			COUNTER = 1;
																			_Language_UI();
																		}
																		else {
																			if (_position == 15) {
																				LANGUAGE.edit().putString("LANGUAGE", "15").commit();
																				COUNTER = 1;
																				_Language_UI();
																			}
																			else {
																				if (_position == 16) {
																					LANGUAGE.edit().putString("LANGUAGE", "16").commit();
																					COUNTER = 1;
																					_Language_UI();
																				}
																				else {
																					if (_position == 17) {
																						LANGUAGE.edit().putString("LANGUAGE", "17").commit();
																						COUNTER = 1;
																						_Language_UI();
																					}
																					else {
																						if (_position == 18) {
																							LANGUAGE.edit().putString("LANGUAGE", "18").commit();
																							COUNTER = 1;
																							_Language_UI();
																						}
																						else {
																							if (_position == 19) {
																								LANGUAGE.edit().putString("LANGUAGE", "19").commit();
																								COUNTER = 1;
																								_Language_UI();
																							}
																							else {
																								if (_position == 20) {
																									LANGUAGE.edit().putString("LANGUAGE", "20").commit();
																									COUNTER = 1;
																									_Language_UI();
																								}
																								else {
																									if (_position == 21) {
																										LANGUAGE.edit().putString("LANGUAGE", "21").commit();
																										COUNTER = 1;
																										_Language_UI();
																									}
																									else {
																										if (_position == 22) {
																											LANGUAGE.edit().putString("LANGUAGE", "22").commit();
																											COUNTER = 1;
																											_Language_UI();
																										}
																										else {
																											if (_position == 23) {
																												LANGUAGE.edit().putString("LANGUAGE", "23").commit();
																												COUNTER = 1;
																												_Language_UI();
																											}
																											else {
																												if (_position == 24) {
																													LANGUAGE.edit().putString("LANGUAGE", "24").commit();
																													COUNTER = 1;
																													_Language_UI();
																												}
																												else {
																													if (_position == 25) {
																														LANGUAGE.edit().putString("LANGUAGE", "25").commit();
																														COUNTER = 1;
																														_Language_UI();
																													}
																													else {
																														if (_position == 26) {
																															LANGUAGE.edit().putString("LANGUAGE", "26").commit();
																															COUNTER = 1;
																															_Language_UI();
																														}
																														else {
																															if (_position == 27) {
																																LANGUAGE.edit().putString("LANGUAGE", "27").commit();
																																COUNTER = 1;
																																_Language_UI();
																															}
																															else {
																																if (_position == 28) {
																																	LANGUAGE.edit().putString("LANGUAGE", "28").commit();
																																	COUNTER = 1;
																																	_Language_UI();
																																}
																																else {
																																	if (_position == 29) {
																																		LANGUAGE.edit().putString("LANGUAGE", "29").commit();
																																		COUNTER = 1;
																																		_Language_UI();
																																	}
																																	else {
																																		if (_position == 30) {
																																			LANGUAGE.edit().putString("LANGUAGE", "30").commit();
																																			COUNTER = 1;
																																			_Language_UI();
																																		}
																																		else {
																																			if (_position == 31) {
																																				LANGUAGE.edit().putString("LANGUAGE", "31").commit();
																																				COUNTER = 1;
																																				_Language_UI();
																																			}
																																			else {
																																				if (_position == 32) {
																																					LANGUAGE.edit().putString("LANGUAGE", "32").commit();
																																					COUNTER = 1;
																																					_Language_UI();
																																				}
																																				else {
																																					if (_position == 33) {
																																						LANGUAGE.edit().putString("LANGUAGE", "33").commit();
																																						COUNTER = 1;
																																						_Language_UI();
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		apk_path_location.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				PATH = _charSeq;
				_Default_Path();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		box_reboot.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					box_header.setVisibility(View.GONE);
					final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Intro_Dialog);
					prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
					prog.setMax(100);
					prog.setMessage("Refetching datas...");
					prog.setIndeterminate(true);
					prog.setCancelable(false);
					if (!MainActivity.this.isFinishing()){
							prog.show();
					}
					
					Timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.dismiss();
									final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Intro_Dialog);
									prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
									prog.setMax(100);
									prog.setMessage("Rebooting...");
									prog.setIndeterminate(true);
									prog.setCancelable(false);
									prog.show();
									if (!MainActivity.this.isFinishing()){
											return;
									}
									
									Timer = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													box_header.setVisibility(View.VISIBLE);
													prog.dismiss();
												}
											});
										}
									};
									_timer.schedule(Timer, (int)(9000));
								}
							});
						}
					};
					_timer.schedule(Timer, (int)(8000));
					Timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									try {
										Intent intent = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName() ); 
										
										intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
										intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
										startActivity(intent);
									}
									catch (Exception e) {
									}
								}
							});
						}
					};
					_timer.schedule(Timer, (int)(10000));
					if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
						Window w =MainActivity.this.getWindow();
						w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
						w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF171717);
					}
					main_body_optimization.setVisibility(View.VISIBLE);
					main_scroll_settings.setVisibility(View.GONE);
					main_scroll_about.setVisibility(View.GONE);
					main_refresh_layout.setVisibility(View.GONE);
					box_experiment.setVisibility(View.GONE);
					box_switch.setVisibility(View.GONE);
					box_update.setVisibility(View.GONE);
					_Reboot();
				}
				catch(Exception e) {
				}
				_Tap_Animation(box_reboot);
			}
		});
		
		box_reset_preferences.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cloned_version_switch.setChecked(false);
				experiment_version_switch.setChecked(false);
				list_auto_refresh_switch.setChecked(false);
				force_auto_install_switch.setChecked(false);
				disable_reward_ad_switch.setChecked(false);
				apk_path_location.setText("/storage/emulated/0/Download/");
				main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF000000}));
				main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF000000}));
				main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF000000}));
				select_language.setSelection((int)(0));
				select_theme.setSelection((int)(0));
				_Language_Fixer();
				if (COUNTER == 1) {
					com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Back to default preferences", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				}
				_Tap_Animation(box_reset_preferences);
				COUNTER = 0;
			}
		});
		
		box_icon_close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				RippleAnimation.create(box_icon_close).setDuration((long)1000).start();
				main_body_optimization.setVisibility(View.GONE);
				main_scroll_settings.setVisibility(View.GONE);
				main_scroll_about.setVisibility(View.GONE);
				main_refresh_layout.setVisibility(View.VISIBLE);
				box_experiment.setVisibility(View.VISIBLE);
				box_switch.setVisibility(View.VISIBLE);
				box_update.setVisibility(View.VISIBLE);
				title_header.setText(main_title.getText().toString());
				title_header_beta.setTextColor(0xFFFFFFFF);
				title_header_separator.setTextColor(0xFFFFFFFF);
				Animation header_beta;
				header_beta = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
				header_beta.setDuration(200); title_header_beta.startAnimation(header_beta);
				header_beta = null;
				_Tap_Animation(box_icon_close);
				CLOSER_1 = 0;
				_Animation_0();
			}
		});
		
		main_box_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (CLICKER_1 == 1) {
					if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
						list_items_1.setVisibility(View.VISIBLE);
						list_items_1.setAdapter(new List_items_1Adapter(stock_patched));
						((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
							list_items_1.setVisibility(View.VISIBLE);
							list_items_1.setAdapter(new List_items_1Adapter(stock_cloned_patched));
							((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
								list_items_1.setVisibility(View.VISIBLE);
								list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_patched));
								((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
									list_items_1.setVisibility(View.VISIBLE);
									list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_cloned_patched));
									((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
								}
							}
						}
					}
					version_oc_01.setImageResource(R.drawable.open);
					version_oc_02.setImageResource(R.drawable.close);
					version_oc_03.setImageResource(R.drawable.close);
					changelogs_oc.setImageResource(R.drawable.close);
					list_items_2.setVisibility(View.GONE);
					list_items_3.setVisibility(View.GONE);
					list_items_4.setVisibility(View.GONE);
					CLICKER_1 = 0;
					CLICKER_2 = 1;
					CLICKER_3 = 1;
					CLICKER_4 = 1;
				}
				else {
					if (CLICKER_1 == 0) {
						version_oc_01.setImageResource(R.drawable.close);
						list_items_1.setVisibility(View.GONE);
						CLICKER_1 = 1;
					}
				}
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); version_oc_01.startAnimation(animation);
				animation = null;
			}
		});
		
		main_box_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (CLICKER_2 == 1) {
					if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
						list_items_2.setVisibility(View.VISIBLE);
						list_items_2.setAdapter(new List_items_2Adapter(amoled_patched));
						((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
							list_items_2.setVisibility(View.VISIBLE);
							list_items_2.setAdapter(new List_items_2Adapter(amoled_cloned_patched));
							((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
								list_items_2.setVisibility(View.VISIBLE);
								list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_patched));
								((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
									list_items_2.setVisibility(View.VISIBLE);
									list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_cloned_patched));
									((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
								}
							}
						}
					}
					version_oc_01.setImageResource(R.drawable.close);
					version_oc_02.setImageResource(R.drawable.open);
					version_oc_03.setImageResource(R.drawable.close);
					changelogs_oc.setImageResource(R.drawable.close);
					list_items_1.setVisibility(View.GONE);
					list_items_3.setVisibility(View.GONE);
					list_items_4.setVisibility(View.GONE);
					CLICKER_1 = 1;
					CLICKER_2 = 0;
					CLICKER_3 = 1;
					CLICKER_4 = 1;
				}
				else {
					if (CLICKER_2 == 0) {
						version_oc_02.setImageResource(R.drawable.close);
						list_items_2.setVisibility(View.GONE);
						CLICKER_2 = 1;
					}
				}
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); version_oc_02.startAnimation(animation);
				animation = null;
			}
		});
		
		main_box_3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (CLICKER_3 == 1) {
					version_oc_01.setImageResource(R.drawable.close);
					version_oc_02.setImageResource(R.drawable.close);
					version_oc_03.setImageResource(R.drawable.open);
					changelogs_oc.setImageResource(R.drawable.close);
					list_items_1.setVisibility(View.GONE);
					list_items_2.setVisibility(View.GONE);
					list_items_3.setVisibility(View.VISIBLE);
					list_items_4.setVisibility(View.GONE);
					list_items_3.setAdapter(new List_items_3Adapter(lite_patched));
					((BaseAdapter)list_items_3.getAdapter()).notifyDataSetChanged();
					CLICKER_1 = 1;
					CLICKER_2 = 1;
					CLICKER_3 = 0;
					CLICKER_4 = 1;
				}
				else {
					if (CLICKER_3 == 0) {
						version_oc_03.setImageResource(R.drawable.close);
						list_items_3.setVisibility(View.GONE);
						CLICKER_3 = 1;
					}
				}
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); version_oc_03.startAnimation(animation);
				animation = null;
			}
		});
		
		main_box_6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (CLICKER_4 == 1) {
					version_oc_01.setImageResource(R.drawable.close);
					version_oc_02.setImageResource(R.drawable.close);
					version_oc_03.setImageResource(R.drawable.close);
					changelogs_oc.setImageResource(R.drawable.open);
					list_items_1.setVisibility(View.GONE);
					list_items_2.setVisibility(View.GONE);
					list_items_3.setVisibility(View.GONE);
					list_items_4.setVisibility(View.VISIBLE);
					list_items_4.setAdapter(new List_items_4Adapter(patched_changelogs));
					((BaseAdapter)list_items_4.getAdapter()).notifyDataSetChanged();
					CLICKER_1 = 1;
					CLICKER_2 = 1;
					CLICKER_3 = 1;
					CLICKER_4 = 0;
				}
				else {
					if (CLICKER_4 == 0) {
						changelogs_oc.setImageResource(R.drawable.close);
						list_items_4.setVisibility(View.GONE);
						CLICKER_4 = 1;
					}
				}
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); changelogs_oc.startAnimation(animation);
				animation = null;
			}
		});
		
		list_items_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				try {
					if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk") || FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")) {
						final AlertDialog.Builder File_Exist = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(existing_patched.getText().toString().concat("</b>"));
						String TitleColor = "1DB954";
						
						File_Exist.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = existing_patched_desc.getText().toString();
						String MessageColor = "FFFFFF";
						
						File_Exist.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						File_Exist.setPositiveButton(install.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								AlertDialog.setCancelable(true);
								if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")) {
									_Extension_4();
								}
								else {
									if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")) {
										_Extension_5();
									}
								}
								                }
							            });
						File_Exist.setNegativeButton(delete.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								
								AlertDialog.setCancelable(true);
								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Patched File Deleted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk");
								FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk");
								                }
							            });
						 File_Exist.setNeutralButton(ignore.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								AlertDialog.setCancelable(true);
								final AlertDialog.Builder Selected_Patched = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
								
								String Title = "<b>".concat(download_ready_0.concat("</b>"));
								String TitleColor = "1DB954";
								
								Selected_Patched.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
								if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
									if (_position < 1) {
										if ((_position % 1) == 0) {
											String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
									else {
										String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
										if (_position < 1) {
											if ((_position % 1) == 0) {
												String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK CLONED<br/><br/>").concat(download_ready_desc_0)));
												String MessageColor = "FFFFFF";
												
												Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
											}
										}
										else {
											String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK CLONED<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
									else {
										if (SWITCH_VERSION.getString("SWITCH", "").contains("C")) {
											if (_position < 1) {
												if ((_position % 1) == 0) {
													String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
													String MessageColor = "FFFFFF";
													
													Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												}
											}
											else {
												String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
												String MessageColor = "FFFFFF";
												
												Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
											}
										}
										else {
											if (SWITCH_VERSION.getString("SWITCH", "").contains("D")) {
												if (_position < 1) {
													if ((_position % 1) == 0) {
														String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
														String MessageColor = "FFFFFF";
														
														Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
													}
												}
												else {
													String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
													String MessageColor = "FFFFFF";
													
													Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												}
											}
										}
									}
								}
								Selected_Patched.setPositiveButton(download_0, new DialogInterface.OnClickListener(){
									
									                @Override
									                public void onClick(DialogInterface Selected_Patched, int p) {
										try {
											if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
												AlertDialog.setCancelable(true);
												if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
													if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
														_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
													else {
														_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
												}
												else {
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
												}
												_File_Remover();
											}
											else {
												if (mRewardedAd != null) {
													  Activity activityContext = MainActivity.this;
													  mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
														    @Override
														    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
															       AlertDialog.setCancelable(true);
															if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
																if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																	_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																}
																else {
																	_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																}
															}
															else {
																if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
																	if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																		_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																	}
																	else {
																		_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																	}
																}
															}
															_File_Remover();
															      int rewardAmount = rewardItem.getAmount();
															      String rewardType = rewardItem.getType();
															    }
														  });
												} else {
													AlertDialog.setCancelable(true);
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
													else {
														if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
															if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
															else {
																_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
														}
													}
													_File_Remover();
												}
											}
										}
										catch(Exception e) {
										}
										                }
									            });
								 Selected_Patched.setNeutralButton(cancel_0, new DialogInterface.OnClickListener(){
									
									                @Override
									                public void onClick(DialogInterface Selected_Patched, int p) {
										AlertDialog.setCancelable(true);
										                }
									            });
								AlertDialog = Selected_Patched.create();
								AlertDialog.setCancelable(false);
								AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
								AlertDialog.show();
								DELETE = 1;
								                }
							            });
						AlertDialog = File_Exist.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
					}
					else {
						final AlertDialog.Builder Selected_Patched = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(download_ready_0.concat("</b>"));
						String TitleColor = "1DB954";
						
						Selected_Patched.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
							if (_position < 1) {
								if ((_position % 1) == 0) {
									String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK<br/><br/>").concat(download_ready_desc_0)));
									String MessageColor = "FFFFFF";
									
									Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
								}
							}
							else {
								String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK<br/><br/>").concat(download_ready_desc_0)));
								String MessageColor = "FFFFFF";
								
								Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
							}
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
								if (_position < 1) {
									if ((_position % 1) == 0) {
										String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK CLONED<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK CLONED<br/><br/>").concat(download_ready_desc_0)));
									String MessageColor = "FFFFFF";
									
									Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
								}
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
									if (_position < 1) {
										if ((_position % 1) == 0) {
											String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
									else {
										String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
										if (_position < 1) {
											if ((_position % 1) == 0) {
												String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
												String MessageColor = "FFFFFF";
												
												Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
											}
										}
										else {
											String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("STOCK EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
								}
							}
						}
						Selected_Patched.setPositiveButton(download_0, new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Selected_Patched, int p) {
								try {
									if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
										AlertDialog.setCancelable(true);
										if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
											if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
												_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
											}
											else {
												_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
											}
										}
										else {
											if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
												if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
													_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
												else {
													_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
											}
										}
										_File_Remover();
									}
									else {
										if (mRewardedAd != null) {
											  Activity activityContext = MainActivity.this;
											  mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
												    @Override
												    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
													       AlertDialog.setCancelable(true);
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
													else {
														if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
															if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
															else {
																_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
														}
													}
													_File_Remover();
													      int rewardAmount = rewardItem.getAmount();
													      String rewardType = rewardItem.getType();
													    }
												  });
										} else {
											AlertDialog.setCancelable(true);
											if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
												if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
													_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
												else {
													_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
											}
											else {
												if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
													if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
														_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
													else {
														_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
												}
											}
											_File_Remover();
										}
									}
								}
								catch(Exception e) {
								}
								                }
							            });
						 Selected_Patched.setNeutralButton(cancel_0, new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Selected_Patched, int p) {
								AlertDialog.setCancelable(true);
								                }
							            });
						AlertDialog = Selected_Patched.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
						DELETE = 1;
					}
					if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
						hidden_patched.setText(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Title").toString());
						hidden_download_1.setText(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Link_1").toString());
						hidden_download_2.setText(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Link_2").toString());
						hidden_download_3.setText(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Mirror").toString());
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
							hidden_patched.setText(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Title").toString());
							hidden_download_1.setText(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Link_1").toString());
							hidden_download_2.setText(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Link_2").toString());
							hidden_download_3.setText(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Mirror").toString());
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
								hidden_patched.setText(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Title").toString());
								hidden_download_1.setText(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Link_1").toString());
								hidden_download_2.setText(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Link_2").toString());
								hidden_download_3.setText(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Mirror").toString());
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
									hidden_patched.setText(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Title").toString());
									hidden_download_1.setText(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Link_1").toString());
									hidden_download_2.setText(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Link_2").toString());
									hidden_download_3.setText(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Mirror").toString());
								}
							}
						}
					}
				}
				catch(Exception e) {
				}
			}
		});
		
		list_items_2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				try {
					if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk") || FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")) {
						final AlertDialog.Builder File_Exist = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(existing_patched.getText().toString().concat("</b>"));
						String TitleColor = "1DB954";
						
						File_Exist.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = existing_patched_desc.getText().toString();
						String MessageColor = "FFFFFF";
						
						File_Exist.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						File_Exist.setPositiveButton(install.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								AlertDialog.setCancelable(true);
								if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")) {
									_Extension_4();
								}
								else {
									if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")) {
										_Extension_5();
									}
								}
								                }
							            });
						File_Exist.setNegativeButton(delete.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								
								AlertDialog.setCancelable(true);
								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Patched File Deleted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk");
								FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk");
								                }
							            });
						 File_Exist.setNeutralButton(ignore.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								AlertDialog.setCancelable(true);
								final AlertDialog.Builder Selected_Patched = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
								
								String Title = "<b>".concat(download_ready_0.concat("</b>"));
								String TitleColor = "1DB954";
								
								Selected_Patched.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
								if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
									if (_position < 1) {
										if ((_position % 1) == 0) {
											String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
									else {
										String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
										if (_position < 1) {
											if ((_position % 1) == 0) {
												String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED CLONED<br/><br/>").concat(download_ready_desc_0)));
												String MessageColor = "FFFFFF";
												
												Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
											}
										}
										else {
											String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED CLONED<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
									else {
										if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
											if (_position < 1) {
												if ((_position % 1) == 0) {
													String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
													String MessageColor = "FFFFFF";
													
													Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												}
											}
											else {
												String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
												String MessageColor = "FFFFFF";
												
												Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
											}
										}
										else {
											if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
												if (_position < 1) {
													if ((_position % 1) == 0) {
														String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
														String MessageColor = "FFFFFF";
														
														Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
													}
												}
												else {
													String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
													String MessageColor = "FFFFFF";
													
													Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												}
											}
										}
									}
								}
								Selected_Patched.setPositiveButton(download_0, new DialogInterface.OnClickListener(){
									
									                @Override
									                public void onClick(DialogInterface Selected_Patched, int p) {
										try {
											if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
												AlertDialog.setCancelable(true);
												if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
													if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
														_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
													else {
														_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
												}
												else {
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
												}
												_File_Remover();
											}
											else {
												if (mRewardedAd != null) {
													  Activity activityContext = MainActivity.this;
													  mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
														    @Override
														    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
															       AlertDialog.setCancelable(true);
															if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
																if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																	_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																}
																else {
																	_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																}
															}
															else {
																if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
																	if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																		_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																	}
																	else {
																		_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																	}
																}
															}
															_File_Remover();
															      int rewardAmount = rewardItem.getAmount();
															      String rewardType = rewardItem.getType();
															    }
														  });
												} else {
													AlertDialog.setCancelable(true);
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
													else {
														if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
															if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
															else {
																_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
														}
													}
													_File_Remover();
												}
											}
										}
										catch(Exception e) {
										}
										                }
									            });
								 Selected_Patched.setNeutralButton(cancel_0, new DialogInterface.OnClickListener(){
									
									                @Override
									                public void onClick(DialogInterface Selected_Patched, int p) {
										AlertDialog.setCancelable(true);
										                }
									            });
								AlertDialog = Selected_Patched.create();
								AlertDialog.setCancelable(false);
								AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
								AlertDialog.show();
								DELETE = 1;
								                }
							            });
						AlertDialog = File_Exist.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
					}
					else {
						final AlertDialog.Builder Selected_Patched = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(download_ready_0.concat("</b>"));
						String TitleColor = "1DB954";
						
						Selected_Patched.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
							if (_position < 1) {
								if ((_position % 1) == 0) {
									String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED<br/><br/>").concat(download_ready_desc_0)));
									String MessageColor = "FFFFFF";
									
									Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
								}
							}
							else {
								String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED<br/><br/>").concat(download_ready_desc_0)));
								String MessageColor = "FFFFFF";
								
								Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
							}
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
								if (_position < 1) {
									if ((_position % 1) == 0) {
										String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED CLONED<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED CLONED<br/><br/>").concat(download_ready_desc_0)));
									String MessageColor = "FFFFFF";
									
									Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
								}
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
									if (_position < 1) {
										if ((_position % 1) == 0) {
											String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
									else {
										String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
										if (_position < 1) {
											if ((_position % 1) == 0) {
												String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
												String MessageColor = "FFFFFF";
												
												Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
											}
										}
										else {
											String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("AMOLED EXPERIMENTAL CLONED<br/><br/>").concat(download_ready_desc_0)));
											String MessageColor = "FFFFFF";
											
											Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
										}
									}
								}
							}
						}
						Selected_Patched.setPositiveButton(download_0, new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Selected_Patched, int p) {
								try {
									if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
										AlertDialog.setCancelable(true);
										if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
											if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
												_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
											}
											else {
												_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
											}
										}
										else {
											if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
												if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
													_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
												else {
													_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
											}
										}
										_File_Remover();
									}
									else {
										if (mRewardedAd != null) {
											  Activity activityContext = MainActivity.this;
											  mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
												    @Override
												    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
													       AlertDialog.setCancelable(true);
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
													else {
														if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
															if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
															else {
																_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
														}
													}
													_File_Remover();
													      int rewardAmount = rewardItem.getAmount();
													      String rewardType = rewardItem.getType();
													    }
												  });
										} else {
											AlertDialog.setCancelable(true);
											if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
												if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
													_Download_Install(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
												else {
													_Download_Install(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
											}
											else {
												if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
													if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
														_Download(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
													else {
														_Download(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
												}
											}
											_File_Remover();
										}
									}
								}
								catch(Exception e) {
								}
								                }
							            });
						 Selected_Patched.setNeutralButton(cancel_0, new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Selected_Patched, int p) {
								AlertDialog.setCancelable(true);
								                }
							            });
						AlertDialog = Selected_Patched.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
						DELETE = 1;
					}
					if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
						hidden_patched.setText(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Title").toString());
						hidden_download_1.setText(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Link_1").toString());
						hidden_download_2.setText(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Link_2").toString());
						hidden_download_3.setText(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Mirror").toString());
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
							hidden_patched.setText(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Title").toString());
							hidden_download_1.setText(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Link_1").toString());
							hidden_download_2.setText(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Link_2").toString());
							hidden_download_3.setText(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Mirror").toString());
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
								hidden_patched.setText(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Title").toString());
								hidden_download_1.setText(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Link_1").toString());
								hidden_download_2.setText(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Link_2").toString());
								hidden_download_3.setText(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Mirror").toString());
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
									hidden_patched.setText(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Title").toString());
									hidden_download_1.setText(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Link_1").toString());
									hidden_download_2.setText(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Link_2").toString());
									hidden_download_3.setText(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Mirror").toString());
								}
							}
						}
					}
				}
				catch(Exception e) {
				}
			}
		});
		
		list_items_3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				try {
					if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")) {
						final AlertDialog.Builder File_Exist = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(existing_patched.getText().toString().concat("</b>"));
						String TitleColor = "1DB954";
						
						File_Exist.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = existing_patched_desc.getText().toString();
						String MessageColor = "FFFFFF";
						
						File_Exist.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						File_Exist.setPositiveButton(install.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								AlertDialog.setCancelable(true);
								if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")) {
									_Extension_6();
								}
								                }
							            });
						File_Exist.setNegativeButton(delete.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								
								AlertDialog.setCancelable(true);
								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Patched File Deleted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk");
								                }
							            });
						 File_Exist.setNeutralButton(ignore.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface File_Exist, int p) {
								AlertDialog.setCancelable(true);
								final AlertDialog.Builder Selected_Patched = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
								
								String Title = "<b>".concat(download_ready_0.concat("</b>"));
								String TitleColor = "1DB954";
								
								Selected_Patched.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
								if (_position < 1) {
									if ((_position % 1) == 0) {
										String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("LITE<br/><br/>").concat(download_ready_desc_0)));
										String MessageColor = "FFFFFF";
										
										Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
									}
								}
								else {
									String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("LITE<br/><br/>").concat(download_ready_desc_0)));
									String MessageColor = "FFFFFF";
									
									Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
								}
								Selected_Patched.setPositiveButton(download_0, new DialogInterface.OnClickListener(){
									
									                @Override
									                public void onClick(DialogInterface Selected_Patched, int p) {
										try {
											if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
												AlertDialog.setCancelable(true);
												if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
													if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
														_Download_Install_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
													else {
														_Download_Install_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
												}
												else {
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
												}
												_File_Remover();
											}
											else {
												if (mRewardedAd != null) {
													  Activity activityContext = MainActivity.this;
													  mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
														    @Override
														    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
															       AlertDialog.setCancelable(true);
															if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
																if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																	_Download_Install_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																}
																else {
																	_Download_Install_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																}
															}
															else {
																if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
																	if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																		_Download_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																	}
																	else {
																		_Download_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
																	}
																}
															}
															_File_Remover();
															      int rewardAmount = rewardItem.getAmount();
															      String rewardType = rewardItem.getType();
															    }
														  });
												} else {
													AlertDialog.setCancelable(true);
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Install_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Install_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
													else {
														if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
															if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																_Download_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
															else {
																_Download_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
														}
													}
													_File_Remover();
												}
											}
										}
										catch(Exception e) {
										}
										                }
									            });
								 Selected_Patched.setNeutralButton(cancel_0, new DialogInterface.OnClickListener(){
									
									                @Override
									                public void onClick(DialogInterface Selected_Patched, int p) {
										AlertDialog.setCancelable(true);
										                }
									            });
								AlertDialog = Selected_Patched.create();
								AlertDialog.setCancelable(false);
								AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
								AlertDialog.show();
								DELETE = 1;
								                }
							            });
						AlertDialog = File_Exist.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
					}
					else {
						final AlertDialog.Builder Selected_Patched = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(download_ready_0.concat("</b>"));
						String TitleColor = "1DB954";
						
						Selected_Patched.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						if (_position < 1) {
							if ((_position % 1) == 0) {
								String Message = "<b>VERSION: </b>".concat("LATEST | ".concat(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("LITE<br/><br/>").concat(download_ready_desc_0)));
								String MessageColor = "FFFFFF";
								
								Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
							}
						}
						else {
							String Message = "<b>VERSION: </b>".concat("OLDER | ".concat(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Title").toString()).concat("<br/><b>PATCHED TYPE: </b>".concat("LITE<br/><br/>").concat(download_ready_desc_0)));
							String MessageColor = "FFFFFF";
							
							Selected_Patched.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						}
						Selected_Patched.setPositiveButton(download_0, new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Selected_Patched, int p) {
								try {
									if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
										AlertDialog.setCancelable(true);
										if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
											if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
												_Download_Install_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
											}
											else {
												_Download_Install_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
											}
										}
										else {
											if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
												if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
													_Download_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
												else {
													_Download_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
											}
										}
										_File_Remover();
									}
									else {
										if (mRewardedAd != null) {
											  Activity activityContext = MainActivity.this;
											  mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
												    @Override
												    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
													       AlertDialog.setCancelable(true);
													if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
														if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
															_Download_Install_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
														else {
															_Download_Install_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
														}
													}
													else {
														if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
															if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
																_Download_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
															else {
																_Download_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
															}
														}
													}
													_File_Remover();
													      int rewardAmount = rewardItem.getAmount();
													      String rewardType = rewardItem.getType();
													    }
												  });
										} else {
											AlertDialog.setCancelable(true);
											if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X")) {
												if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
													_Download_Install_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
												else {
													_Download_Install_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
												}
											}
											else {
												if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y")) {
													if (0 == SketchwareUtil.getRandom((int)(0), (int)(1))) {
														_Download_Lite(hidden_download_1.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
													else {
														_Download_Lite(hidden_download_2.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/");
													}
												}
											}
											_File_Remover();
										}
									}
								}
								catch(Exception e) {
								}
								                }
							            });
						 Selected_Patched.setNeutralButton(cancel_0, new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Selected_Patched, int p) {
								AlertDialog.setCancelable(true);
								                }
							            });
						AlertDialog = Selected_Patched.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
						DELETE = 1;
					}
					hidden_patched.setText(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Title").toString());
					hidden_download_1.setText(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Link_1").toString());
					hidden_download_2.setText(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Link_2").toString());
					hidden_download_3.setText(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Mirror").toString());
				}
				catch(Exception e) {
				}
			}
		});
		
		box_uninstall.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Uninstall Patched", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				return true;
			}
		});
		
		box_uninstall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					final AlertDialog.Builder Uninstall = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
					
					String Title = "<b>".concat(uninstall_patched.getText().toString().concat("</b>"));
					String TitleColor = "1DB954";
					
					Uninstall.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
					Uninstall.setPositiveButton(spap.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Uninstall, int p) {
							AlertDialog.setCancelable(true);
							try {
									Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
									startActivity(intent);
							} catch (Exception e) {
									com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Application not found or uninstalled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
							}
							
							                }
						            });
					Uninstall.setNegativeButton(cloned.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Uninstall, int p) {
							
							AlertDialog.setCancelable(true);
							try {
									Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
									startActivity(intent);
							} catch (Exception e) {
									com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Application not found or uninstalled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
							}
							
							                }
						            });
					 Uninstall.setNeutralButton(lite.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Uninstall, int p) {
							AlertDialog.setCancelable(true);
							try {
									Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
									startActivity(intent);
							} catch (Exception e) {
									com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Application not found or uninstalled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
							}
							
							                }
						            });
					AlertDialog = Uninstall.create();
					AlertDialog.setCancelable(true);
					AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
					AlertDialog.show();
					_Tap_Animation(box_uninstall);
				} catch (Exception e) {
				}
				
			}
		});
		
		box_settings.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Open Patched's App Settings", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				return true;
			}
		});
		
		box_settings.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					final AlertDialog.Builder Settings = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
					
					String Title = "<b>".concat(open_settings.getText().toString().concat("</b>"));
					String TitleColor = "1DB954";
					
					Settings.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
					Settings.setPositiveButton(spap.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Settings, int p) {
							AlertDialog.setCancelable(true);
							Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS); intent.setData(Uri.parse("package:com.spotify.music")); 
							startActivity(intent);
							                }
						            });
					Settings.setNegativeButton(cloned.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Settings, int p) {
							
							AlertDialog.setCancelable(true);
							Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS); intent.setData(Uri.parse("package:com.spotify.musix")); 
							startActivity(intent);
							                }
						            });
					 Settings.setNeutralButton(lite.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Settings, int p) {
							AlertDialog.setCancelable(true);
							Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS); intent.setData(Uri.parse("package:com.spotify.lite")); 
							startActivity(intent);
							                }
						            });
					AlertDialog = Settings.create();
					AlertDialog.setCancelable(true);
					AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
					AlertDialog.show();
					_Tap_Animation(box_settings);
				}
				catch(Exception e) {
					SketchwareUtil.CustomToast(getApplicationContext(), "Application not installed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
				}
			}
		});
		
		box_cache.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Clear Offline Cached Datas", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				return true;
			}
		});
		
		box_cache.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (CHECK == 0) {
						CHECK = 1;
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										CHECK = 0;
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(2000));
						if (Build.VERSION.SDK_INT <= 30) {
								if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.spotify.music/") || (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.spotify.musix/") || FileUtil.isExistFile("/storage/emulated/0/Android/data/com.spotify.lite/"))) {
										FileUtil.deleteFile("/storage/emulated/0/Android/data/com.spotify.music/");
										FileUtil.deleteFile("/storage/emulated/0/Android/data/com.spotify.musix/");
										FileUtil.deleteFile("/storage/emulated/0/Android/data/com.spotify.lite/");
										com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Successfully Deleted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								}
								else {
										com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Directory Files Are Empty", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								}
						} else {
								if (Build.VERSION.SDK_INT >= 31) {
										com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "This feature does not support Android 12 and above", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								}
						}
						
					}
					_Tap_Animation(box_cache);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_open.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Launch Patched App", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				return true;
			}
		});
		
		box_open.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					final AlertDialog.Builder Open = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
					
					String Title = "<b>".concat(open_patched.getText().toString().concat("</b>"));
					String TitleColor = "1DB954";
					
					Open.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
					Open.setPositiveButton(spap.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Open, int p) {
							AlertDialog.setCancelable(true);
							String packageName = "com.spotify.music"; 
							
							Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
							if(intent == null) {
								
								try {
									intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName));
								} catch (Exception e) {
									SketchwareUtil.CustomToast(getApplicationContext(), "Spotify not installed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
							}
							startActivity(intent);
							                }
						            });
					Open.setNegativeButton(cloned.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Open, int p) {
							
							AlertDialog.setCancelable(true);
							String packageName = "com.spotify.musix"; 
							
							Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
							if(intent == null) {
								
								try {
									intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName));
								} catch (Exception e) {
									SketchwareUtil.CustomToast(getApplicationContext(), "Cloned not installed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
							}
							startActivity(intent);
							                }
						            });
					 Open.setNeutralButton(lite.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Open, int p) {
							AlertDialog.setCancelable(true);
							String packageName = "com.spotify.lite"; 
							
							Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
							if(intent == null) {
								
								try {
									intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName));
								} catch (Exception e) {
									SketchwareUtil.CustomToast(getApplicationContext(), "Cloned not installed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
							}
							startActivity(intent);
							                }
						            });
					AlertDialog = Open.create();
					AlertDialog.setCancelable(true);
					AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
					AlertDialog.show();
					_Tap_Animation(box_open);
				}
				catch(Exception e) {
					SketchwareUtil.CustomToast(getApplicationContext(), "Application not installed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
				}
			}
		});
		
		box_support.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					_Browser(Datas.get("Telegram").toString());
					_Tap_Animation(box_support);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_reddit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					_Browser(Datas.get("Reddit").toString());
					_Tap_Animation(box_reddit);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_donate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					final AlertDialog.Builder Donation = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
					
					String Title = "<b>".concat(show_support.getText().toString().concat("</b>"));
					String TitleColor = "1DB954";
					
					Donation.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
					String Message = show_support_desc.getText().toString().replace("\n", "<br/>");
					String MessageColor = "FFFFFF";
					
					Donation.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
					Donation.setPositiveButton(donate.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Donation, int p) {
							AlertDialog.setCancelable(true);
							try {
								_Browser(Datas.get("Donate").toString());
							}
							catch(Exception e) {
							}
							                }
						            });
					 Donation.setNeutralButton(not_now.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Donation, int p) {
							AlertDialog.setCancelable(true);
							                }
						            });
					AlertDialog = Donation.create();
					AlertDialog.setCancelable(false);
					AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
					AlertDialog.show();
					_Tap_Animation(box_donate);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_about.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				RippleAnimation.create(box_about).setDuration((long)1000).start();
				main_body_optimization.setVisibility(View.GONE);
				main_scroll_settings.setVisibility(View.GONE);
				main_scroll_about.setVisibility(View.VISIBLE);
				main_refresh_layout.setVisibility(View.GONE);
				box_experiment.setVisibility(View.GONE);
				box_switch.setVisibility(View.GONE);
				box_update.setVisibility(View.GONE);
				title_header.setText(about_title.getText().toString());
				title_header_beta.setTextColor(Color.TRANSPARENT);
				title_header_separator.setTextColor(Color.TRANSPARENT);
				_Tap_Animation(box_about);
				CLOSER_1 = 1;
				_Animation_2();
			}
		});
		
		box_discord.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					_Browser(Datas.get("Discord").toString());
					_Tap_Animation(box_discord);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_source.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					_Browser(Datas.get("Source").toString());
					_Tap_Animation(box_source);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_website.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					_Browser(Datas.get("Website").toString());
					_Tap_Animation(box_website);
				}
				catch(Exception e) {
				}
			}
		});
		
		box_faq.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					_Browser(Datas.get("FAQ").toString());
					_Tap_Animation(box_faq);
				}
				catch(Exception e) {
				}
			}
		});
		
		_Connection_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				Timer = new TimerTask() {
						@Override
						public void run() {
								runOnUiThread(new Runnable() {
										@Override
										public void run() {
												try {
														Datas = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
														_Backbone();
												} catch (Exception e) {
														_Backbone();
												}
												
										}
								});
						}
				};
				_timer.schedule(Timer, (int)(0));
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		_API();
		_Initialize();
		_Reinitialize();
		_Animation_0();
		_Gate_Keeper();
		_Informations();
		_Theme_Pack();
		_Language_Pack();
		_Dark_Navigation();
	}
	
	@Override
	public void onBackPressed() {
		try {
			if (CLOSER_1 == 1) {
				CHECK = 0;
				box_icon_close.performClick();
			}
			else {
				if (CLOSER_2 == 1) {
					CHECK = 0;
					box_settings_icon_close.performClick();
				}
			}
			if (CHECK == 0) {
				CHECK = 1;
				Timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								CHECK = 0;
							}
						});
					}
				};
				_timer.schedule(Timer, (int)(3000));
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Press back again to exit", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
			}
			else {
				finishAndRemoveTask();
				finishAffinity();
			}
		}
		catch(Exception e) {
		}
	}
	

	public void _Informations() {
		Timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (Installed_Checker.equals("true") && (Installed_Checker_Cloned.equals("true") && Installed_Checker_Lite.equals("true"))) {
											sub_installed.setVisibility(View.VISIBLE);
											sub_separator_1.setVisibility(View.VISIBLE);
											sub_installed_c.setVisibility(View.VISIBLE);
											sub_separator_2.setVisibility(View.VISIBLE);
											sub_installed_l.setVisibility(View.VISIBLE);
											sub_installed.setTextColor(0xFFFFFFFF);
											sub_separator_1.setTextColor(0xFF616161);
											sub_installed_c.setTextColor(0xFFBDBDBD);
											sub_separator_2.setTextColor(0xFF616161);
											sub_installed_l.setTextColor(0xFF78909C);
										}
										else {
											if (Installed_Checker.equals("false") && (Installed_Checker_Cloned.equals("false") && Installed_Checker_Lite.equals("false"))) {
												sub_installed.setVisibility(View.VISIBLE);
												sub_separator_1.setVisibility(View.GONE);
												sub_installed_c.setVisibility(View.GONE);
												sub_separator_2.setVisibility(View.GONE);
												sub_installed_l.setVisibility(View.GONE);
												sub_installed.setTextColor(0xFFFFFFFF);
												sub_separator_1.setTextColor(0xFF616161);
												sub_installed_c.setTextColor(0xFFBDBDBD);
												sub_separator_2.setTextColor(0xFF616161);
												sub_installed_l.setTextColor(0xFF78909C);
											}
											else {
												if (Installed_Checker.equals("true") && (Installed_Checker_Cloned.equals("false") && Installed_Checker_Lite.equals("false"))) {
													sub_installed.setVisibility(View.VISIBLE);
													sub_separator_1.setVisibility(View.GONE);
													sub_installed_c.setVisibility(View.GONE);
													sub_separator_2.setVisibility(View.GONE);
													sub_installed_l.setVisibility(View.GONE);
													sub_installed.setTextColor(0xFFFFFFFF);
													sub_separator_1.setTextColor(0xFF616161);
													sub_installed_c.setTextColor(0xFFBDBDBD);
													sub_separator_2.setTextColor(0xFF616161);
													sub_installed_l.setTextColor(0xFF78909C);
												}
												else {
													if (Installed_Checker.equals("false") && (Installed_Checker_Cloned.equals("true") && Installed_Checker_Lite.equals("false"))) {
														sub_installed.setVisibility(View.GONE);
														sub_separator_1.setVisibility(View.GONE);
														sub_installed_c.setVisibility(View.VISIBLE);
														sub_separator_2.setVisibility(View.GONE);
														sub_installed_l.setVisibility(View.GONE);
														sub_installed.setTextColor(0xFFFFFFFF);
														sub_separator_1.setTextColor(0xFF616161);
														sub_installed_c.setTextColor(0xFFBDBDBD);
														sub_separator_2.setTextColor(0xFF616161);
														sub_installed_l.setTextColor(0xFF78909C);
													}
													else {
														if (Installed_Checker.equals("false") && (Installed_Checker_Cloned.equals("false") && Installed_Checker_Lite.equals("true"))) {
															sub_installed.setVisibility(View.GONE);
															sub_separator_1.setVisibility(View.GONE);
															sub_installed_c.setVisibility(View.GONE);
															sub_separator_2.setVisibility(View.GONE);
															sub_installed_l.setVisibility(View.VISIBLE);
															sub_installed.setTextColor(0xFFFFFFFF);
															sub_separator_1.setTextColor(0xFF616161);
															sub_installed_c.setTextColor(0xFFBDBDBD);
															sub_separator_2.setTextColor(0xFF616161);
															sub_installed_l.setTextColor(0xFF78909C);
														}
														else {
															if (Installed_Checker.equals("true") && (Installed_Checker_Cloned.equals("true") && Installed_Checker_Lite.equals("false"))) {
																sub_installed.setVisibility(View.VISIBLE);
																sub_separator_1.setVisibility(View.VISIBLE);
																sub_installed_c.setVisibility(View.VISIBLE);
																sub_separator_2.setVisibility(View.GONE);
																sub_installed_l.setVisibility(View.GONE);
																sub_installed.setTextColor(0xFFFFFFFF);
																sub_separator_1.setTextColor(0xFF616161);
																sub_installed_c.setTextColor(0xFFBDBDBD);
																sub_separator_2.setTextColor(0xFF616161);
																sub_installed_l.setTextColor(0xFF78909C);
															}
															else {
																if (Installed_Checker.equals("true") && (Installed_Checker_Cloned.equals("false") && Installed_Checker_Lite.equals("true"))) {
																	sub_installed.setVisibility(View.VISIBLE);
																	sub_separator_1.setVisibility(View.GONE);
																	sub_installed_c.setVisibility(View.GONE);
																	sub_separator_2.setVisibility(View.VISIBLE);
																	sub_installed_l.setVisibility(View.VISIBLE);
																	sub_installed.setTextColor(0xFFFFFFFF);
																	sub_separator_1.setTextColor(0xFF616161);
																	sub_installed_c.setTextColor(0xFFBDBDBD);
																	sub_separator_2.setTextColor(0xFF616161);
																	sub_installed_l.setTextColor(0xFF78909C);
																}
																else {
																	if (Installed_Checker.equals("false") && (Installed_Checker_Cloned.equals("true") && Installed_Checker_Lite.equals("true"))) {
																		sub_installed.setVisibility(View.GONE);
																		sub_separator_1.setVisibility(View.GONE);
																		sub_installed_c.setVisibility(View.VISIBLE);
																		sub_separator_2.setVisibility(View.VISIBLE);
																		sub_installed_l.setVisibility(View.VISIBLE);
																		sub_installed.setTextColor(0xFFFFFFFF);
																		sub_separator_1.setTextColor(0xFF616161);
																		sub_installed_c.setTextColor(0xFFBDBDBD);
																		sub_separator_2.setTextColor(0xFF616161);
																		sub_installed_l.setTextColor(0xFF78909C);
																	}
																}
															}
														}
													}
												}
											}
										}
										sub_installed.setText("N/A");
										sub_installed_c.setText("N/A");
										sub_installed_l.setText("N/A");
										String uri = "com.spotify.music";
										android.content.pm.PackageManager pm = getPackageManager();
										
										try {
												android.content.pm.PackageInfo pInfo = pm.getPackageInfo(uri, android.content.pm.PackageManager.GET_ACTIVITIES);
												String version = pInfo.versionName;
												sub_installed.setText(version);
												Installed_Checker = "true";
										}
										
										catch (Exception e) {
												sub_installed.setText("N/A");
												Installed_Checker = "false";
										}
										
										String uri_c = "com.spotify.musix";
										android.content.pm.PackageManager pm_c = getPackageManager();
										
										try {
												android.content.pm.PackageInfo pInfo = pm_c.getPackageInfo(uri_c, android.content.pm.PackageManager.GET_ACTIVITIES);
												String version_c = pInfo.versionName;
												sub_installed_c.setText(version_c);
												Installed_Checker_Cloned = "true";
										}
										
										catch (Exception e) {
												sub_installed_c.setText("N/A");
												Installed_Checker_Cloned = "false";
										}
										
										String uri_l = "com.spotify.lite";
										android.content.pm.PackageManager pm_l = getPackageManager();
										
										try {
												android.content.pm.PackageInfo pInfo = pm_l.getPackageInfo(uri_l, android.content.pm.PackageManager.GET_ACTIVITIES);
												String version_l = pInfo.versionName;
												sub_installed_l.setText(version_l);
												Installed_Checker_Lite = "true";
										}
										
										catch (Exception e) {
												sub_installed_l.setText("N/A");
												Installed_Checker_Lite = "false";
										}
										
										String app = "com.xc3fff0e.xmanager";
										android.content.pm.PackageManager ver = getPackageManager();
										
										try {
												android.content.pm.PackageInfo pInfo = ver.getPackageInfo(app, android.content.pm.PackageManager.GET_ACTIVITIES);
												String version = pInfo.versionName;
												local_version.setText(version);
												
										}
										catch (Exception e) {
												SketchwareUtil.showMessage(getApplicationContext(), "Fatal Error");
										}
										
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(75));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(Timer, (int)(0), (int)(150));
	}
	
	
	public void _Download(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "Patched (xManager).apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Reminder();
																																		_Browser(hidden_download_3.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																}
														});
														if (bytes_downloaded == bytes_total) {
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("PREPARING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING FILE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(3500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(4500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("FINALIZING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(5500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {	
																								try {
																										FileUtil.copyFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk", apk_path_location.getText().toString().concat("Patched (xManager).apk"));
																								}
																								catch(Exception e) {
																								}
																								if (!MainActivity.this.isFinishing()) {
																										_Extension_1();
																										prog.dismiss();
																								}
																								prog.dismiss();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(6500));
														}
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _File_Remover() {
		if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/")) {
			FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/");
		}
		else {
			if (!FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/")) {
				
			}
		}
	}
	
	
	public void _Update_Remover() {
		if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/xManager Update.apk")) {
			FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/xManager Update.apk");
		}
		if (FileUtil.isExistFile("/storage/emulated/0/xManager/Update/xManager Update.apk")) {
			FileUtil.deleteFile("/storage/emulated/0/xManager/Update/xManager Update.apk");
		}
	}
	
	
	public void _Theme_UI() {
		if (THEME.getString("THEME", "").equals("0")) {
			main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF000000}));
			main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF000000}));
			main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF000000}));
			select_theme.setSelection((int)(0));
		}
		else {
			if (THEME.getString("THEME", "").equals("1")) {
				main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF1DB954}));
				main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF1DB954}));
				main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF1DB954}));
				select_theme.setSelection((int)(1));
			}
			else {
				if (THEME.getString("THEME", "").equals("2")) {
					main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFAA00FF}));
					main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFAA00FF}));
					main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFAA00FF}));
					select_theme.setSelection((int)(2));
				}
				else {
					if (THEME.getString("THEME", "").equals("3")) {
						main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFD50000}));
						main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFD50000}));
						main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFD50000}));
						select_theme.setSelection((int)(3));
					}
					else {
						if (THEME.getString("THEME", "").equals("4")) {
							main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF2962FF}));
							main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF2962FF}));
							main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF2962FF}));
							select_theme.setSelection((int)(4));
						}
						else {
							if (THEME.getString("THEME", "").equals("5")) {
								main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFF6D00}));
								main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFF6D00}));
								main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFF6D00}));
								select_theme.setSelection((int)(5));
							}
							else {
								if (THEME.getString("THEME", "").equals("6")) {
									main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFFD600}));
									main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFFD600}));
									main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFFD600}));
									select_theme.setSelection((int)(6));
								}
								else {
									if (THEME.getString("THEME", "").equals("7")) {
										main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF616161}));
										main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF616161}));
										main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF616161}));
										select_theme.setSelection((int)(7));
									}
									else {
										if (THEME.getString("THEME", "").equals("8")) {
											main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF607D8B}));
											main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF607D8B}));
											main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF607D8B}));
											select_theme.setSelection((int)(8));
										}
										else {
											if (THEME.getString("THEME", "").equals("9")) {
												main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFE91E63}));
												main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFE91E63}));
												main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFE91E63}));
												select_theme.setSelection((int)(9));
											}
											else {
												if (THEME.getString("THEME", "").equals("10")) {
													main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF00BCD4}));
													main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF00BCD4}));
													main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF00BCD4}));
													select_theme.setSelection((int)(10));
												}
												else {
													if (THEME.getString("THEME", "").equals("11")) {
														main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFFFFFF}));
														main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFFFFFF}));
														main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFFFFFFFF}));
														select_theme.setSelection((int)(11));
													}
													else {
														if (THEME.getString("THEME", "").equals("12")) {
															main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF795548}));
															main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF795548}));
															main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF795548}));
															select_theme.setSelection((int)(12));
														}
														else {
															if (THEME.getString("THEME", "").equals("13")) {
																main_refresh_layout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF3F51B5}));
																main_scroll_about.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF3F51B5}));
																main_scroll_settings.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF3F51B5}));
																select_theme.setSelection((int)(13));
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _Updater() {
		try {
			if (Latest_Version > Current_Version) {
				try {
					final AlertDialog.Builder Update_Authorized = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
					
					String Title = "<b>".concat(new_update.getText().toString().concat("</b>"));
					String TitleColor = "1DB954";
					
					Update_Authorized.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
					String Message = "What's New (Version ".concat(String.valueOf(Latest_Version).concat("):<br/><br/>".concat(app_changelogs.getText().toString().replace("\n", "<br/>"))));
					String MessageColor = "FFFFFF";
					
					Update_Authorized.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
					Update_Authorized.setPositiveButton(download_update.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Update_Authorized, int p) {
							AlertDialog.setCancelable(true);
							try {
								if (FORCE_INSTALL_UPDATE.getString("FORCE_INSTALL_UPDATE", "").equals("XX")) {
									_Download_Update_Install(hidden_update.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/");
								}
								else {
									if (FORCE_INSTALL_UPDATE.getString("FORCE_INSTALL_UPDATE", "").equals("YY")) {
										_Download_Update(hidden_update.getText().toString(), "/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/");
									}
								}
							}
							catch(Exception e) {
							}
							_Update_Remover();
							                }
						            });
					 Update_Authorized.setNeutralButton(not_now.getText().toString(), new DialogInterface.OnClickListener(){
						
						                @Override
						                public void onClick(DialogInterface Update_Authorized, int p) {
							AlertDialog.setCancelable(true);
							                }
						            });
					AlertDialog = Update_Authorized.create();
					AlertDialog.setCancelable(false);
					AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
					AlertDialog.show();
				}
				catch(Exception e) {
				}
			}
			else {
				if (Latest_Version < Current_Version) {
					try {
						main_body_optimization.setVisibility(View.VISIBLE);
						box_header.setVisibility(View.GONE);
						main_body_settings.setVisibility(View.GONE);
						main_scroll_about.setVisibility(View.GONE);
						main_refresh_layout.setVisibility(View.GONE);
						final AlertDialog.Builder Update_Unauthorized = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						
						String Title = "<b>".concat(maintenance.getText().toString().concat("</b>"));
						String TitleColor = "1DB954";
						
						Update_Unauthorized.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = maintenance_desc.getText().toString();
						String MessageColor = "FFFFFF";
						
						Update_Unauthorized.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Update_Unauthorized.setPositiveButton(thanks.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Update_Unauthorized, int p) {
								AlertDialog.setCancelable(true);
								finishAndRemoveTask();
								finishAffinity();
								                }
							            });
						 Update_Unauthorized.setNeutralButton(support.getText().toString(), new DialogInterface.OnClickListener(){
							
							                @Override
							                public void onClick(DialogInterface Update_Unauthorized, int p) {
								AlertDialog.setCancelable(false);
								AlertDialog.show();
								_Maintenance();
								try {
									_Browser(Datas.get("Telegram").toString());
								}
								catch(Exception e) {
								}
								                }
							            });
						AlertDialog = Update_Unauthorized.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
					}
					catch(Exception e) {
					}
				}
			}
		}
		catch(Exception e) {
		}
	}
	
	
	public void _Download_Update(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "/Update/xManager Update.apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Browser(hidden_update.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																}
														});
														if (bytes_downloaded == bytes_total) {
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("PREPARING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(title_header.getText().toString().concat(" v".concat(Datas.get("Server").toString().concat("</b>"))));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING FILE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(3500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(title_header.getText().toString().concat(" v".concat(Datas.get("Server").toString().concat("</b>"))));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(4500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(title_header.getText().toString().concat(" v".concat(Datas.get("Server").toString().concat("</b>"))));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("FINALIZING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(5500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {	
																								if (!MainActivity.this.isFinishing()) {
																										_Extension_3();
																										prog.dismiss();
																								}
																								prog.dismiss();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(6500));
														}
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Effects() {
		_Ripple(box_experiment, "#9E9E9E");
		_Ripple(box_switch, "#9E9E9E");
		_Ripple(box_update, "#9E9E9E");
		_Ripple(box_uninstall, "#9E9E9E");
		_Ripple(box_settings, "#9E9E9E");
		_Ripple(box_cache, "#9E9E9E");
		_Ripple(box_open, "#9E9E9E");
	}
	
	
	public void _Ripple(final View _view, final String _c) {
		_view.setBackground(Drawables.getSelectableDrawableFor(Color.parseColor(_c)));
		_view.setClickable(true);
		
	}
	
	public static class Drawables {
			public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
					if (Build.VERSION.SDK_INT < 21) {
							android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
							stateListDrawable.addState(
							new int[]{android.R.attr.state_pressed},
							new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
							);
							stateListDrawable.addState(
							new int[]{android.R.attr.state_focused},
							new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
							);
							stateListDrawable.addState(
							new int[]{},
							new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
							);
							return stateListDrawable;
					} else {
							android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
							android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
							
							android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
							return new android.graphics.drawable.RippleDrawable(
							pressedColor,
							defaultColor,
							rippleColor
							);
					}
			}
			
			private static android.graphics.drawable.Drawable getRippleColor(int color) {
					float[] outerRadii = new float[8];
					Arrays.fill(outerRadii, 0);
					android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
					
					android.graphics.drawable.ShapeDrawable shapeDrawable = new 
					android.graphics.drawable.ShapeDrawable(r);
					shapeDrawable.getPaint().setColor(color);
					return shapeDrawable;
			}
			
			private static int lightenOrDarken(int color, double fraction) {
					if (canLighten(color, fraction)) {
							return lighten(color, fraction);
					} else {
							return darken(color, fraction);
					}
			}
			
			private static int lighten(int color, double fraction) {
					int red = Color.red(color);
					int green = Color.green(color);
					int blue = Color.blue(color);
					red = lightenColor(red, fraction);
					green = lightenColor(green, fraction);
					blue = lightenColor(blue, fraction);
					int alpha = Color.alpha(color);
					return Color.argb(alpha, red, green, blue);
			}
			
			private static int darken(int color, double fraction) {
					int red = Color.red(color);
					int green = Color.green(color);
					int blue = Color.blue(color);
					red = darkenColor(red, fraction);
					green = darkenColor(green, fraction);
					blue = darkenColor(blue, fraction);
					int alpha = Color.alpha(color);
					
					return Color.argb(alpha, red, green, blue);
			}
			
			private static boolean canLighten(int color, double fraction) {
					int red = Color.red(color);
					int green = Color.green(color);
					int blue = Color.blue(color);
					return canLightenComponent(red, fraction)
					&& canLightenComponent(green, fraction)
					&& canLightenComponent(blue, fraction);
			}
			
			private static boolean canLightenComponent(int colorComponent, double fraction) {
					int red = Color.red(colorComponent);
					int green = Color.green(colorComponent);
					int blue = Color.blue(colorComponent);
					return red + (red * fraction) < 255
					&& green + (green * fraction) < 255
					&& blue + (blue * fraction) < 255;
			}
			
			private static int darkenColor(int color, double fraction) {
					return (int) Math.max(color - (color * fraction), 0);
			}
			
			private static int lightenColor(int color, double fraction) {
					return (int) Math.min(color + (color * fraction), 255);
			}
	}
	public static class CircleDrawables {
			public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
					if (Build.VERSION.SDK_INT < 21) {
							android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
							stateListDrawable.addState(
							new int[]{android.R.attr.state_pressed},
							new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
							);
							stateListDrawable.addState(
							new int[]{android.R.attr.state_focused},
							new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
							);
							stateListDrawable.addState(
							new int[]{},
							new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
							);
							return stateListDrawable;
					} else {
							android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
							android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
							
							android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
							return new android.graphics.drawable.RippleDrawable(
							pressedColor,
							defaultColor,
							rippleColor
							);
					}
			}
			
			private static android.graphics.drawable.Drawable getRippleColor(int color) {
					float[] outerRadii = new float[180];
					Arrays.fill(outerRadii, 80);
					android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
					
					android.graphics.drawable.ShapeDrawable shapeDrawable = new 
					android.graphics.drawable.ShapeDrawable(r);
					shapeDrawable.getPaint().setColor(color);
					return shapeDrawable;
			}
			
			private static int lightenOrDarken(int color, double fraction) {
					if (canLighten(color, fraction)) {
							return lighten(color, fraction);
					} else {
							return darken(color, fraction);
					}
			}
			
			private static int lighten(int color, double fraction) {
					int red = Color.red(color);
					int green = Color.green(color);
					int blue = Color.blue(color);
					red = lightenColor(red, fraction);
					green = lightenColor(green, fraction);
					blue = lightenColor(blue, fraction);
					int alpha = Color.alpha(color);
					return Color.argb(alpha, red, green, blue);
			}
			
			private static int darken(int color, double fraction) {
					int red = Color.red(color);
					int green = Color.green(color);
					int blue = Color.blue(color);
					red = darkenColor(red, fraction);
					green = darkenColor(green, fraction);
					blue = darkenColor(blue, fraction);
					int alpha = Color.alpha(color);
					
					return Color.argb(alpha, red, green, blue);
			}
			
			private static boolean canLighten(int color, double fraction) {
					int red = Color.red(color);
					int green = Color.green(color);
					int blue = Color.blue(color);
					return canLightenComponent(red, fraction)
					&& canLightenComponent(green, fraction)
					&& canLightenComponent(blue, fraction);
			}
			
			private static boolean canLightenComponent(int colorComponent, double fraction) {
					int red = Color.red(colorComponent);
					int green = Color.green(colorComponent);
					int blue = Color.blue(colorComponent);
					return red + (red * fraction) < 255
					&& green + (green * fraction) < 255
					&& blue + (blue * fraction) < 255;
			}
			
			private static int darkenColor(int color, double fraction) {
					return (int) Math.max(color - (color * fraction), 0);
			}
			
			private static int lightenColor(int color, double fraction) {
					return (int) Math.min(color + (color * fraction), 255);
			}
	}
	
	public void drawableclass() {
			
			
			
			
			
	}
	
	
	public void _Animation_0() {
		Animation a;
		a = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		a.setDuration(200); main_box_1.startAnimation(a);
		a = null;
		Animation b;
		b = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		b.setDuration(300); main_box_2.startAnimation(b);
		b = null;
		Animation c;
		c = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		c.setDuration(400); main_box_3.startAnimation(c);
		c = null;
		Animation d;
		d = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		d.setDuration(500); main_box_6.startAnimation(d);
		d = null;
		Animation e;
		e = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		e.setDuration(600); box_sub_header.startAnimation(e);
		e = null;
		Animation f;
		f = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		f.setDuration(700); main_box_4.startAnimation(f);
		f = null;
		Animation g;
		g = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		g.setDuration(800); main_box_15.startAnimation(g);
		g = null;
		Animation h;
		h = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		h.setDuration(300); title_header.startAnimation(h);
		h = null;
		Animation i;
		i = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		i.setDuration(400); title_header_beta.startAnimation(i);
		i = null;
		Animation j;
		j = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		j.setDuration(500); title_header_separator.startAnimation(j);
		j = null;
		Animation k;
		k = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		k.setDuration(600); box_experiment.startAnimation(k);
		k = null;
		Animation l;
		l = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		l.setDuration(700); box_switch.startAnimation(l);
		l = null;
		Animation m;
		m = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		m.setDuration(800); box_update.startAnimation(m);
		m = null;
	}
	
	
	public void _Animation_1() {
		Animation a;
		a = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		a.setDuration(200); box_settings_close.startAnimation(a);
		a = null;
		Animation b;
		b = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		b.setDuration(300); title_header.startAnimation(b);
		b = null;
		Animation c;
		c = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		c.setDuration(400); main_box_8.startAnimation(c);
		c = null;
		Animation d;
		d = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		d.setDuration(500); main_box_11.startAnimation(d);
		d = null;
		Animation e;
		e = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		e.setDuration(600); main_box_17.startAnimation(e);
		e = null;
		Animation f;
		f = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		f.setDuration(700); main_box_5.startAnimation(f);
		f = null;
		Animation g;
		g = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		g.setDuration(800); main_box_14.startAnimation(g);
		g = null;
		Animation h;
		h = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		h.setDuration(900); main_box_10.startAnimation(h);
		h = null;
		Animation i;
		i = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		i.setDuration(1000); main_box_13.startAnimation(i);
		i = null;
	}
	
	
	public void _Animation_2() {
		Animation a;
		a = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		a.setDuration(200); box_about_close.startAnimation(a);
		a = null;
		Animation b;
		b = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		b.setDuration(300); title_header.startAnimation(b);
		b = null;
		Animation c;
		c = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		c.setDuration(300); box_about_header.startAnimation(c);
		c = null;
		Animation d;
		d = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		d.setDuration(400); sub_title.startAnimation(d);
		d = null;
		Animation e;
		e = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		e.setDuration(500); box_about_1.startAnimation(e);
		e = null;
		Animation f;
		f = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		f.setDuration(600); box_about_2.startAnimation(f);
		f = null;
		Animation g;
		g = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		g.setDuration(700); box_about_3.startAnimation(g);
		g = null;
		Animation h;
		h = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		h.setDuration(800); box_about_4.startAnimation(h);
		h = null;
		Animation i;
		i = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		i.setDuration(900); box_about_5.startAnimation(i);
		i = null;
		Animation j;
		j = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		j.setDuration(1000); box_about_6.startAnimation(j);
		j = null;
		Animation k;
		k = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		k.setDuration(1100); box_about_7.startAnimation(k);
		k = null;
		Animation l;
		l = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		l.setDuration(1200); contributors.startAnimation(l);
		l = null;
	}
	
	
	public void _Dark_Navigation() {
		if (Build.VERSION.SDK_INT >= 21) {
				getWindow().setNavigationBarColor(Color.parseColor("#171717"));
		}
		
	}
	
	
	public void _List_Updater() {
		if (LIST_REFRESH.getString("UPDATE", "").equals("ON")) {
			try {
				list_auto_refresh_switch.setChecked(true);
				main_refresh_layout.setRefreshing(true);
				Timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
									list_items_1.setVisibility(View.VISIBLE);
									list_items_2.setVisibility(View.GONE);
									list_items_3.setVisibility(View.GONE);
									list_items_4.setVisibility(View.GONE);
									list_items_1.setAdapter(new List_items_1Adapter(stock_patched));
									((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
								}
								else {
									if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
										list_items_1.setVisibility(View.VISIBLE);
										list_items_2.setVisibility(View.GONE);
										list_items_3.setVisibility(View.GONE);
										list_items_4.setVisibility(View.GONE);
										list_items_1.setAdapter(new List_items_1Adapter(stock_cloned_patched));
										((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
									}
									else {
										if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
											list_items_1.setVisibility(View.VISIBLE);
											list_items_2.setVisibility(View.GONE);
											list_items_3.setVisibility(View.GONE);
											list_items_4.setVisibility(View.GONE);
											list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_patched));
											((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
										}
										else {
											if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
												list_items_1.setVisibility(View.VISIBLE);
												list_items_2.setVisibility(View.GONE);
												list_items_3.setVisibility(View.GONE);
												list_items_4.setVisibility(View.GONE);
												list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_cloned_patched));
												((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
											}
										}
									}
								}
								Animation animation;
								animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
								animation.setDuration(500); version_oc_01.startAnimation(animation);
								animation = null;
								version_oc_01.setImageResource(R.drawable.open);
								version_oc_02.setImageResource(R.drawable.close);
								version_oc_03.setImageResource(R.drawable.close);
								changelogs_oc.setImageResource(R.drawable.close);
								Timer = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
													list_items_1.setVisibility(View.GONE);
													list_items_2.setVisibility(View.VISIBLE);
													list_items_3.setVisibility(View.GONE);
													list_items_4.setVisibility(View.GONE);
													list_items_2.setAdapter(new List_items_2Adapter(amoled_patched));
													((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
												}
												else {
													if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
														list_items_1.setVisibility(View.GONE);
														list_items_2.setVisibility(View.VISIBLE);
														list_items_3.setVisibility(View.GONE);
														list_items_4.setVisibility(View.GONE);
														list_items_2.setAdapter(new List_items_2Adapter(amoled_cloned_patched));
														((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
													}
													else {
														if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
															list_items_1.setVisibility(View.GONE);
															list_items_2.setVisibility(View.VISIBLE);
															list_items_3.setVisibility(View.GONE);
															list_items_4.setVisibility(View.GONE);
															list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_patched));
															((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
														}
														else {
															if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
																list_items_1.setVisibility(View.GONE);
																list_items_2.setVisibility(View.VISIBLE);
																list_items_3.setVisibility(View.GONE);
																list_items_4.setVisibility(View.GONE);
																list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_cloned_patched));
																((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
															}
														}
													}
												}
												Animation animation;
												animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
												animation.setDuration(500); version_oc_02.startAnimation(animation);
												animation = null;
												version_oc_01.setImageResource(R.drawable.close);
												version_oc_02.setImageResource(R.drawable.open);
												version_oc_03.setImageResource(R.drawable.close);
												changelogs_oc.setImageResource(R.drawable.close);
												Timer = new TimerTask() {
													@Override
													public void run() {
														runOnUiThread(new Runnable() {
															@Override
															public void run() {
																Animation animation;
																animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
																animation.setDuration(500); version_oc_03.startAnimation(animation);
																animation = null;
																list_items_1.setVisibility(View.GONE);
																list_items_2.setVisibility(View.GONE);
																list_items_3.setVisibility(View.VISIBLE);
																list_items_4.setVisibility(View.GONE);
																version_oc_01.setImageResource(R.drawable.close);
																version_oc_02.setImageResource(R.drawable.close);
																version_oc_03.setImageResource(R.drawable.open);
																changelogs_oc.setImageResource(R.drawable.close);
																list_items_3.setAdapter(new List_items_3Adapter(lite_patched));
																((BaseAdapter)list_items_3.getAdapter()).notifyDataSetChanged();
																Timer = new TimerTask() {
																	@Override
																	public void run() {
																		runOnUiThread(new Runnable() {
																			@Override
																			public void run() {
																				Animation animation;
																				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
																				animation.setDuration(500); changelogs_oc.startAnimation(animation);
																				animation = null;
																				list_items_1.setVisibility(View.GONE);
																				list_items_2.setVisibility(View.GONE);
																				list_items_3.setVisibility(View.GONE);
																				list_items_4.setVisibility(View.VISIBLE);
																				version_oc_01.setImageResource(R.drawable.close);
																				version_oc_02.setImageResource(R.drawable.close);
																				version_oc_03.setImageResource(R.drawable.close);
																				changelogs_oc.setImageResource(R.drawable.open);
																				list_items_4.setAdapter(new List_items_4Adapter(patched_changelogs));
																				((BaseAdapter)list_items_4.getAdapter()).notifyDataSetChanged();
																				Timer = new TimerTask() {
																					@Override
																					public void run() {
																						runOnUiThread(new Runnable() {
																							@Override
																							public void run() {
																								main_refresh_layout.setRefreshing(false);
																								list_items_1.setVisibility(View.GONE);
																								list_items_2.setVisibility(View.GONE);
																								list_items_3.setVisibility(View.GONE);
																								list_items_4.setVisibility(View.GONE);
																								version_oc_01.setImageResource(R.drawable.close);
																								version_oc_02.setImageResource(R.drawable.close);
																								version_oc_03.setImageResource(R.drawable.close);
																								changelogs_oc.setImageResource(R.drawable.close);
																								main_body.setAlpha((float)(1.0d));
																								String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
																								
																								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Data List Updated | " + (currentDateTimeString), com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																							}
																						});
																					}
																				};
																				_timer.schedule(Timer, (int)(700));
																			}
																		});
																	}
																};
																_timer.schedule(Timer, (int)(600));
															}
														});
													}
												};
												_timer.schedule(Timer, (int)(500));
											}
										});
									}
								};
								_timer.schedule(Timer, (int)(500));
							}
						});
					}
				};
				_timer.schedule(Timer, (int)(400));
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Refreshing Data List...", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
			}
			catch(Exception e) {
			}
		}
	}
	
	
	public void _Default_Path() {
		if (PATH.equals("")) {
			apk_path_location.setText("/storage/emulated/0/Download/");
		}
		else {
			APK_PATH.edit().putString("PATH", apk_path_location.getText().toString()).commit();
		}
	}
	
	
	public void _Download_Install(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "Patched (xManager).apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Reminder();
																																		_Browser(hidden_download_3.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																		if (bytes_downloaded == bytes_total) {
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("PREPARING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING FILE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(3500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(4500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("FINALIZING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(5500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {	
																												try {
																														FileUtil.copyFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk", apk_path_location.getText().toString().concat("Patched (xManager).apk"));
																												}
																												catch(Exception e) {
																												}
																												Timer = new TimerTask() {
																														@Override
																														public void run() {
																																runOnUiThread(new Runnable() {
																																		@Override
																																		public void run() {
																																				prog.dismiss();
																																				if ((Installed_Version < Downloaded_Version) || ((Downloaded_Version > Installed_Version) || ((Installed_Version == Downloaded_Version) || Installed_Checker.equals("false")))) {
																																						if (getISignature(getApplicationContext()).equals(getDSignature(getApplicationContext())) || Installed_Checker.equals("false")) {
																																								StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
																																								if(android.os.Build.VERSION.SDK_INT >= 29){
																																										try {
																																												Intent intent = new Intent(Intent.ACTION_VIEW);
																																												intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
																																												intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")), "application/vnd.android.package-archive");
																																												startActivity(intent);
																																												_Reminder();
																																										}
																																										catch(Exception e) {
																																										}
																																								} else {
																																										try {
																																												Intent intent = new Intent(Intent.ACTION_VIEW);
																																												intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")), "application/vnd.android.package-archive");
																																												startActivity(intent);
																																												_Reminder();
																																										}
																																										catch(Exception e) {
																																										}
																																								} 
																																						} else {
																																								if (!MainActivity.this.isFinishing()) {
																																										final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
																																										String Title = "<b>".concat(installation_failed_0.concat("</b>"));
																																										String TitleColor = "1DB954";
																																										Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																										String Message = installation_failed_spap_desc_0.replace("\n", "<br/>");
																																										String MessageColor = "FFFFFF";
																																										Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
																																										Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Signature_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																														try {
																																																Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
																																																startActivity(intent);
																																														}
																																														catch(Exception e) {
																																														}
																																												}
																																										});
																																										Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Signature_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																												}
																																										});
																																										AlertDialog = Signature_Check.create();
																																										AlertDialog.setCancelable(false);
																																										AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
																																										AlertDialog.show();
																																								}
																																						}	
																																				}
																																				else {
																																						if (Downloaded_Version < Installed_Version) {
																																								if (!MainActivity.this.isFinishing()) {
																																										final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
																																										String Title = "<b>".concat(installation_failed_0.concat("</b>"));
																																										String TitleColor = "1DB954";
																																										Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																										String Message = installation_failed_desc_0.replace("\n", "<br/>");
																																										String MessageColor = "FFFFFF";
																																										Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
																																										Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Downgrade_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																														try {
																																																Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
																																																startActivity(intent);
																																														}
																																														catch(Exception e) {
																																														}
																																												}
																																										});
																																										Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Downgrade_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																												}
																																										});
																																										AlertDialog = Downgrade_Check.create();
																																										AlertDialog.setCancelable(false);
																																										AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
																																										AlertDialog.show();
																																								}
																																						}
																																				}
																																		}
																																});
																														}
																												};
																												_timer.schedule(Timer, (int)(100));
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(6500));
																		}
																}
														});
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Download_Update_Install(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "/Update/xManager Update.apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_Update_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Browser(hidden_update.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																		if (bytes_downloaded == bytes_total) {
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("PREPARING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(title_header.getText().toString().concat(" v".concat(Datas.get("Server").toString().concat("</b>"))));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING FILE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(3500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(title_header.getText().toString().concat(" v".concat(Datas.get("Server").toString().concat("</b>"))));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(4500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(title_header.getText().toString().concat(" v".concat(Datas.get("Server").toString().concat("</b>"))));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("FINALIZING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(5500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												try {
																														prog.dismiss();
																												}
																												catch(Exception e) {
																												}
																												prog.dismiss();
																												StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
																												if(android.os.Build.VERSION.SDK_INT >= 29){
																														try {
																																Intent intent = new Intent(Intent.ACTION_VIEW);
																																intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
																																intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/xManager Update.apk")), "application/vnd.android.package-archive");
																																startActivity(intent);
																														}
																														catch(Exception e) {
																														}
																												} else {
																														try {
																																Intent intent = new Intent(Intent.ACTION_VIEW);
																																intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/xManager Update.apk")), "application/vnd.android.package-archive");
																																startActivity(intent);
																														}
																														catch(Exception e) {
																														}
																												}
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(6500));
																		}
																}
														});
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Switch_Fixer() {
		if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("X") && FORCE_INSTALL_UPDATE.getString("FORCE_INSTALL_UPDATE", "").equals("XX")) {
			force_auto_install_switch.setChecked(true);
		}
		else {
			if (FORCE_INSTALL.getString("FORCE_INSTALL", "").equals("Y") && FORCE_INSTALL_UPDATE.getString("FORCE_INSTALL_UPDATE", "").equals("YY")) {
				force_auto_install_switch.setChecked(false);
			}
		}
		if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("ON")) {
			disable_reward_ad_switch.setChecked(true);
		}
		else {
			if (DISABLE_REWARD_AD.getString("REWARD_AD", "").equals("OFF")) {
				disable_reward_ad_switch.setChecked(false);
			}
		}
	}
	
	
	public void _Language_UI() {
		if (LANGUAGE.getString("LANGUAGE", "").equals("0")) {
			sub_text_installed.setText(R.string.installed);
			main_title.setText(R.string.main_title);
			about_title.setText(R.string.about_title);
			settings_title.setText(R.string.settings_title);
			experiment_title.setText(R.string.experimental_title);
			sub_title.setText(R.string.about_sub);
			sub_text_1.setText(R.string.latest);
			sub_text_2.setText(R.string.latest);
			sub_text_3.setText(R.string.latest);
			versions_1.setText(R.string.versions);
			versions_2.setText(R.string.versions);
			versions_3.setText(R.string.versions);
			title_sub.setText(R.string.manager_tools);
			source.setText(R.string.source);
			support.setText(R.string.support);
			donate.setText(R.string.donate);
			discord.setText(R.string.discord);
			about.setText(R.string.about);
			website.setText(R.string.website);
			reddit.setText(R.string.reddit);
			faq.setText(R.string.faq);
			theme.setText(R.string.show_themes);
			language.setText(R.string.language);
			download_update.setText(R.string.download_update);
			install_now.setText(R.string.install_now);
			install_update.setText(R.string.install_update);
			uninstall_patched.setText(R.string.uninstall_patched);
			open_settings.setText(R.string.open_settings);
			open_patched.setText(R.string.open_patched);
			lite.setText(R.string.lite);
			cloned.setText(R.string.cloned);
			spap.setText(R.string.spap);
			mirror.setText(R.string.mirror);
			download.setText(R.string.download);
			cancel.setText(R.string.cancel);
			later.setText(R.string.later);
			go_back.setText(R.string.go_back);
			not_now.setText(R.string.not_now);
			close.setText(R.string.close);
			continue_1.setText(R.string.continue_1);
			install.setText(R.string.install);
			uninstall.setText(R.string.uninstall);
			ignore.setText(R.string.ignore);
			delete.setText(R.string.delete);
			thanks.setText(R.string.thanks);
			new_update.setText(R.string.new_update);
			changelogs.setText(R.string.changelogs);
			reboot.setText(R.string.reboot);
			reset_preferences.setText(R.string.reset_preferences);
			list_auto_refresh.setText(R.string.list_auto_refresh);
			list_auto_refresh_info.setText(R.string.list_auto_refresh_desc);
			force_auto_install.setText(R.string.force_auto_install);
			force_auto_install_info.setText(R.string.force_auto_install_desc);
			apk_location.setText(R.string.apk_location);
			apk_location_info.setText(R.string.apk_location_desc);
			clear_directory_folders.setText(R.string.clear_directory_folders);
			clear_directory_folders_info.setText(R.string.clear_directory_folders_desc);
			cloned_version.setText(R.string.cloned_version);
			cloned_version_info.setText(R.string.cloned_version_desc);
			experiment_version.setText(R.string.experimental_version);
			experiment_version_info.setText(R.string.experimental_version_desc);
			disable_reward_ad.setText(R.string.disable_rewarded_ads);
			disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc);
			show_support.setText(R.string.show_support);
			show_support_desc.setText(R.string.show_support_desc);
			maintenance.setText(R.string.maintenance);
			maintenance_desc.setText(R.string.maintenance_desc);
			xmanager_dev.setText(R.string.xmanager_dev);
			patched_devs.setText(R.string.patched_devs);
			support_team.setText(R.string.support_team);
			manager_testers.setText(R.string.manager_testers);
			manager_hosting.setText(R.string.manager_hosting);
			mobilism_team.setText(R.string.mobilism_team);
			forum_team.setText(R.string.forum_team);
			contributors.setText(R.string.contributors);
			download_selected.setText(R.string.download_selected);
			download_ready.setText(R.string.download_ready);
			download_ready_desc.setText(R.string.download_ready_desc);
			downloading_file.setText(R.string.downloading_file);
			download_success.setText(R.string.download_success);
			installation_failed.setText(R.string.installation_failed);
			installation_failed_desc.setText(R.string.installation_failed_desc);
			installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc);
			installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc);
			existing_patched.setText(R.string.existing_patched);
			existing_patched_desc.setText(R.string.existing_patched_desc);
			lite_0 = lite.getText().toString();
			download_0 = download.getText().toString();
			continue_0 = continue_1.getText().toString();
			cancel_0 = cancel.getText().toString();
			later_0 = later.getText().toString();
			mirror_0 = mirror.getText().toString();
			install_now_0 = install_now.getText().toString();
			go_back_0 = go_back.getText().toString();
			install_update_0 = install_update.getText().toString();
			close_0 = close.getText().toString();
			uninstall_0 = uninstall.getText().toString();
			existing_patched_0 = existing_patched.getText().toString();
			existing_patched_desc_0 = existing_patched_desc.getText().toString();
			download_selected_0 = download_selected.getText().toString();
			download_ready_0 = download_ready.getText().toString();
			download_ready_desc_0 = download_ready_desc.getText().toString();
			downloading_file_0 = downloading_file.getText().toString();
			download_success_0 = download_success.getText().toString();
			installation_failed_0 = installation_failed.getText().toString();
			installation_failed_desc_0 = installation_failed_desc.getText().toString();
			installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
			installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
			select_language.setSelection((int)(0));
		}
		else {
			if (LANGUAGE.getString("LANGUAGE", "").equals("1")) {
				sub_text_installed.setText(R.string.installed_01);
				main_title.setText(R.string.main_title_01);
				about_title.setText(R.string.about_title_01);
				settings_title.setText(R.string.settings_title_01);
				experiment_title.setText(R.string.experimental_title_01);
				sub_title.setText(R.string.about_sub_01);
				sub_text_1.setText(R.string.latest_01);
				sub_text_2.setText(R.string.latest_01);
				sub_text_3.setText(R.string.latest_01);
				versions_1.setText(R.string.versions_01);
				versions_2.setText(R.string.versions_01);
				versions_3.setText(R.string.versions_01);
				title_sub.setText(R.string.manager_tools_01);
				source.setText(R.string.source_01);
				support.setText(R.string.support_01);
				donate.setText(R.string.donate_01);
				discord.setText(R.string.discord_01);
				about.setText(R.string.about_01);
				website.setText(R.string.website_01);
				reddit.setText(R.string.reddit_01);
				faq.setText(R.string.faq_01);
				theme.setText(R.string.show_themes_01);
				language.setText(R.string.language_01);
				download_update.setText(R.string.download_update_01);
				install_now.setText(R.string.install_now_01);
				install_update.setText(R.string.install_update_01);
				uninstall_patched.setText(R.string.uninstall_patched_01);
				open_settings.setText(R.string.open_settings_01);
				open_patched.setText(R.string.open_patched_01);
				lite.setText(R.string.lite_01);
				cloned.setText(R.string.cloned_01);
				spap.setText(R.string.spap_01);
				mirror.setText(R.string.mirror_01);
				download.setText(R.string.download_01);
				cancel.setText(R.string.cancel_01);
				later.setText(R.string.later_01);
				go_back.setText(R.string.go_back_01);
				not_now.setText(R.string.not_now_01);
				close.setText(R.string.close_01);
				continue_1.setText(R.string.continue_1_01);
				install.setText(R.string.install_01);
				uninstall.setText(R.string.uninstall_01);
				ignore.setText(R.string.ignore_01);
				delete.setText(R.string.delete_01);
				thanks.setText(R.string.thanks_01);
				new_update.setText(R.string.new_update_01);
				changelogs.setText(R.string.changelogs_01);
				reboot.setText(R.string.reboot_01);
				reset_preferences.setText(R.string.reset_preferences_01);
				list_auto_refresh.setText(R.string.list_auto_refresh_01);
				list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_01);
				force_auto_install.setText(R.string.force_auto_install_01);
				force_auto_install_info.setText(R.string.force_auto_install_desc_01);
				apk_location.setText(R.string.apk_location_01);
				apk_location_info.setText(R.string.apk_location_desc_01);
				clear_directory_folders.setText(R.string.clear_directory_folders_01);
				clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_01);
				cloned_version.setText(R.string.cloned_version_01);
				cloned_version_info.setText(R.string.cloned_version_desc_01);
				experiment_version.setText(R.string.experimental_version_01);
				experiment_version_info.setText(R.string.experimental_version_desc_01);
				disable_reward_ad.setText(R.string.disable_rewarded_ads_01);
				disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_01);
				show_support.setText(R.string.show_support_01);
				show_support_desc.setText(R.string.show_support_desc_01);
				maintenance.setText(R.string.maintenance_01);
				maintenance_desc.setText(R.string.maintenance_desc_01);
				xmanager_dev.setText(R.string.xmanager_dev_01);
				patched_devs.setText(R.string.patched_devs_01);
				support_team.setText(R.string.support_team_01);
				manager_testers.setText(R.string.manager_testers_01);
				manager_hosting.setText(R.string.manager_hosting_01);
				mobilism_team.setText(R.string.mobilism_team_01);
				forum_team.setText(R.string.forum_team_01);
				contributors.setText(R.string.contributors_01);
				download_selected.setText(R.string.download_selected_01);
				download_ready.setText(R.string.download_ready_01);
				download_ready_desc.setText(R.string.download_ready_desc_01);
				downloading_file.setText(R.string.downloading_file_01);
				download_success.setText(R.string.download_success_01);
				installation_failed.setText(R.string.installation_failed_01);
				installation_failed_desc.setText(R.string.installation_failed_desc_01);
				installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_01);
				installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_01);
				existing_patched.setText(R.string.existing_patched_01);
				existing_patched_desc.setText(R.string.existing_patched_desc_01);
				lite_0 = lite.getText().toString();
				download_0 = download.getText().toString();
				continue_0 = continue_1.getText().toString();
				cancel_0 = cancel.getText().toString();
				later_0 = later.getText().toString();
				mirror_0 = mirror.getText().toString();
				install_now_0 = install_now.getText().toString();
				go_back_0 = go_back.getText().toString();
				install_update_0 = install_update.getText().toString();
				close_0 = close.getText().toString();
				uninstall_0 = uninstall.getText().toString();
				existing_patched_0 = existing_patched.getText().toString();
				existing_patched_desc_0 = existing_patched_desc.getText().toString();
				download_selected_0 = download_selected.getText().toString();
				download_ready_0 = download_ready.getText().toString();
				download_ready_desc_0 = download_ready_desc.getText().toString();
				downloading_file_0 = downloading_file.getText().toString();
				download_success_0 = download_success.getText().toString();
				installation_failed_0 = installation_failed.getText().toString();
				installation_failed_desc_0 = installation_failed_desc.getText().toString();
				installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
				installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
				select_language.setSelection((int)(1));
			}
			else {
				if (LANGUAGE.getString("LANGUAGE", "").equals("2")) {
					sub_text_installed.setText(R.string.installed_02);
					main_title.setText(R.string.main_title_02);
					about_title.setText(R.string.about_title_02);
					settings_title.setText(R.string.settings_title_02);
					experiment_title.setText(R.string.experimental_title_02);
					sub_title.setText(R.string.about_sub_02);
					sub_text_1.setText(R.string.latest_02);
					sub_text_2.setText(R.string.latest_02);
					sub_text_3.setText(R.string.latest_02);
					versions_1.setText(R.string.versions_02);
					versions_2.setText(R.string.versions_02);
					versions_3.setText(R.string.versions_02);
					title_sub.setText(R.string.manager_tools_02);
					source.setText(R.string.source_02);
					support.setText(R.string.support_02);
					donate.setText(R.string.donate_02);
					discord.setText(R.string.discord_02);
					about.setText(R.string.about_02);
					website.setText(R.string.website_02);
					reddit.setText(R.string.reddit_02);
					faq.setText(R.string.faq_02);
					theme.setText(R.string.show_themes_02);
					language.setText(R.string.language_02);
					download_update.setText(R.string.download_update_02);
					install_now.setText(R.string.install_now_02);
					install_update.setText(R.string.install_update_02);
					uninstall_patched.setText(R.string.uninstall_patched_02);
					open_settings.setText(R.string.open_settings_02);
					open_patched.setText(R.string.open_patched_02);
					lite.setText(R.string.lite_02);
					cloned.setText(R.string.cloned_02);
					spap.setText(R.string.spap_02);
					mirror.setText(R.string.mirror_02);
					download.setText(R.string.download_02);
					cancel.setText(R.string.cancel_02);
					later.setText(R.string.later_02);
					go_back.setText(R.string.go_back_02);
					not_now.setText(R.string.not_now_02);
					close.setText(R.string.close_02);
					continue_1.setText(R.string.continue_1_02);
					install.setText(R.string.install_02);
					uninstall.setText(R.string.uninstall_02);
					ignore.setText(R.string.ignore_02);
					delete.setText(R.string.delete_02);
					thanks.setText(R.string.thanks_02);
					new_update.setText(R.string.new_update_02);
					changelogs.setText(R.string.changelogs_02);
					reboot.setText(R.string.reboot_02);
					reset_preferences.setText(R.string.reset_preferences_02);
					list_auto_refresh.setText(R.string.list_auto_refresh_02);
					list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_02);
					force_auto_install.setText(R.string.force_auto_install_02);
					force_auto_install_info.setText(R.string.force_auto_install_desc_02);
					apk_location.setText(R.string.apk_location_02);
					apk_location_info.setText(R.string.apk_location_desc_02);
					clear_directory_folders.setText(R.string.clear_directory_folders_02);
					clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_02);
					cloned_version.setText(R.string.cloned_version_02);
					cloned_version_info.setText(R.string.cloned_version_desc_02);
					experiment_version.setText(R.string.experimental_version_02);
					experiment_version_info.setText(R.string.experimental_version_desc_02);
					disable_reward_ad.setText(R.string.disable_rewarded_ads_02);
					disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_02);
					show_support.setText(R.string.show_support_02);
					show_support_desc.setText(R.string.show_support_desc_02);
					maintenance.setText(R.string.maintenance_02);
					maintenance_desc.setText(R.string.maintenance_desc_02);
					xmanager_dev.setText(R.string.xmanager_dev_02);
					patched_devs.setText(R.string.patched_devs_02);
					support_team.setText(R.string.support_team_02);
					manager_testers.setText(R.string.manager_testers_02);
					manager_hosting.setText(R.string.manager_hosting_02);
					mobilism_team.setText(R.string.mobilism_team_02);
					forum_team.setText(R.string.forum_team_02);
					contributors.setText(R.string.contributors_02);
					download_selected.setText(R.string.download_selected_02);
					download_ready.setText(R.string.download_ready_02);
					download_ready_desc.setText(R.string.download_ready_desc_02);
					downloading_file.setText(R.string.downloading_file_02);
					download_success.setText(R.string.download_success_02);
					installation_failed.setText(R.string.installation_failed_02);
					installation_failed_desc.setText(R.string.installation_failed_desc_02);
					installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_02);
					installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_02);
					existing_patched.setText(R.string.existing_patched_02);
					existing_patched_desc.setText(R.string.existing_patched_desc_02);
					lite_0 = lite.getText().toString();
					download_0 = download.getText().toString();
					continue_0 = continue_1.getText().toString();
					cancel_0 = cancel.getText().toString();
					later_0 = later.getText().toString();
					mirror_0 = mirror.getText().toString();
					install_now_0 = install_now.getText().toString();
					go_back_0 = go_back.getText().toString();
					install_update_0 = install_update.getText().toString();
					close_0 = close.getText().toString();
					uninstall_0 = uninstall.getText().toString();
					existing_patched_0 = existing_patched.getText().toString();
					existing_patched_desc_0 = existing_patched_desc.getText().toString();
					download_selected_0 = download_selected.getText().toString();
					download_ready_0 = download_ready.getText().toString();
					download_ready_desc_0 = download_ready_desc.getText().toString();
					downloading_file_0 = downloading_file.getText().toString();
					download_success_0 = download_success.getText().toString();
					installation_failed_0 = installation_failed.getText().toString();
					installation_failed_desc_0 = installation_failed_desc.getText().toString();
					installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
					installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
					select_language.setSelection((int)(2));
				}
				else {
					if (LANGUAGE.getString("LANGUAGE", "").equals("3")) {
						sub_text_installed.setText(R.string.installed_03);
						main_title.setText(R.string.main_title_03);
						about_title.setText(R.string.about_title_03);
						settings_title.setText(R.string.settings_title_03);
						experiment_title.setText(R.string.experimental_title_03);
						sub_title.setText(R.string.about_sub_03);
						sub_text_1.setText(R.string.latest_03);
						sub_text_2.setText(R.string.latest_03);
						sub_text_3.setText(R.string.latest_03);
						versions_1.setText(R.string.versions_03);
						versions_2.setText(R.string.versions_03);
						versions_3.setText(R.string.versions_03);
						title_sub.setText(R.string.manager_tools_03);
						source.setText(R.string.source_03);
						support.setText(R.string.support_03);
						donate.setText(R.string.donate_03);
						discord.setText(R.string.discord_03);
						about.setText(R.string.about_03);
						website.setText(R.string.website_03);
						reddit.setText(R.string.reddit_03);
						faq.setText(R.string.faq_03);
						theme.setText(R.string.show_themes_03);
						language.setText(R.string.language_03);
						download_update.setText(R.string.download_update_03);
						install_now.setText(R.string.install_now_03);
						install_update.setText(R.string.install_update_03);
						uninstall_patched.setText(R.string.uninstall_patched_03);
						open_settings.setText(R.string.open_settings_03);
						open_patched.setText(R.string.open_patched_03);
						lite.setText(R.string.lite_03);
						cloned.setText(R.string.cloned_03);
						spap.setText(R.string.spap_03);
						mirror.setText(R.string.mirror_03);
						download.setText(R.string.download_03);
						cancel.setText(R.string.cancel_03);
						later.setText(R.string.later_03);
						go_back.setText(R.string.go_back_03);
						not_now.setText(R.string.not_now_03);
						close.setText(R.string.close_03);
						continue_1.setText(R.string.continue_1_03);
						install.setText(R.string.install_03);
						uninstall.setText(R.string.uninstall_03);
						ignore.setText(R.string.ignore_03);
						delete.setText(R.string.delete_03);
						thanks.setText(R.string.thanks_03);
						new_update.setText(R.string.new_update_03);
						changelogs.setText(R.string.changelogs_03);
						reboot.setText(R.string.reboot_03);
						reset_preferences.setText(R.string.reset_preferences_03);
						list_auto_refresh.setText(R.string.list_auto_refresh_03);
						list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_03);
						force_auto_install.setText(R.string.force_auto_install_03);
						force_auto_install_info.setText(R.string.force_auto_install_desc_03);
						apk_location.setText(R.string.apk_location_03);
						apk_location_info.setText(R.string.apk_location_desc_03);
						clear_directory_folders.setText(R.string.clear_directory_folders_03);
						clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_03);
						cloned_version.setText(R.string.cloned_version_03);
						cloned_version_info.setText(R.string.cloned_version_desc_03);
						experiment_version.setText(R.string.experimental_version_03);
						experiment_version_info.setText(R.string.experimental_version_desc_03);
						disable_reward_ad.setText(R.string.disable_rewarded_ads_03);
						disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_03);
						show_support.setText(R.string.show_support_03);
						show_support_desc.setText(R.string.show_support_desc_03);
						maintenance.setText(R.string.maintenance_03);
						maintenance_desc.setText(R.string.maintenance_desc_03);
						xmanager_dev.setText(R.string.xmanager_dev_03);
						patched_devs.setText(R.string.patched_devs_03);
						support_team.setText(R.string.support_team_03);
						manager_testers.setText(R.string.manager_testers_03);
						manager_hosting.setText(R.string.manager_hosting_03);
						mobilism_team.setText(R.string.mobilism_team_03);
						forum_team.setText(R.string.forum_team_03);
						contributors.setText(R.string.contributors_03);
						download_selected.setText(R.string.download_selected_03);
						download_ready.setText(R.string.download_ready_03);
						download_ready_desc.setText(R.string.download_ready_desc_03);
						downloading_file.setText(R.string.downloading_file_03);
						download_success.setText(R.string.download_success_03);
						installation_failed.setText(R.string.installation_failed_03);
						installation_failed_desc.setText(R.string.installation_failed_desc_03);
						installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_03);
						installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_03);
						existing_patched.setText(R.string.existing_patched_03);
						existing_patched_desc.setText(R.string.existing_patched_desc_03);
						lite_0 = lite.getText().toString();
						download_0 = download.getText().toString();
						continue_0 = continue_1.getText().toString();
						cancel_0 = cancel.getText().toString();
						later_0 = later.getText().toString();
						mirror_0 = mirror.getText().toString();
						install_now_0 = install_now.getText().toString();
						go_back_0 = go_back.getText().toString();
						install_update_0 = install_update.getText().toString();
						close_0 = close.getText().toString();
						uninstall_0 = uninstall.getText().toString();
						existing_patched_0 = existing_patched.getText().toString();
						existing_patched_desc_0 = existing_patched_desc.getText().toString();
						download_selected_0 = download_selected.getText().toString();
						download_ready_0 = download_ready.getText().toString();
						download_ready_desc_0 = download_ready_desc.getText().toString();
						downloading_file_0 = downloading_file.getText().toString();
						download_success_0 = download_success.getText().toString();
						installation_failed_0 = installation_failed.getText().toString();
						installation_failed_desc_0 = installation_failed_desc.getText().toString();
						installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
						installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
						select_language.setSelection((int)(3));
					}
					else {
						if (LANGUAGE.getString("LANGUAGE", "").equals("4")) {
							sub_text_installed.setText(R.string.installed_04);
							main_title.setText(R.string.main_title_04);
							about_title.setText(R.string.about_title_04);
							settings_title.setText(R.string.settings_title_04);
							experiment_title.setText(R.string.experimental_title_04);
							sub_title.setText(R.string.about_sub_04);
							sub_text_1.setText(R.string.latest_04);
							sub_text_2.setText(R.string.latest_04);
							sub_text_3.setText(R.string.latest_04);
							versions_1.setText(R.string.versions_04);
							versions_2.setText(R.string.versions_04);
							versions_3.setText(R.string.versions_04);
							title_sub.setText(R.string.manager_tools_04);
							source.setText(R.string.source_04);
							support.setText(R.string.support_04);
							donate.setText(R.string.donate_04);
							discord.setText(R.string.discord_04);
							about.setText(R.string.about_04);
							website.setText(R.string.website_04);
							reddit.setText(R.string.reddit_04);
							faq.setText(R.string.faq_04);
							theme.setText(R.string.show_themes_04);
							language.setText(R.string.language_04);
							download_update.setText(R.string.download_update_04);
							install_now.setText(R.string.install_now_04);
							install_update.setText(R.string.install_update_04);
							uninstall_patched.setText(R.string.uninstall_patched_04);
							open_settings.setText(R.string.open_settings_04);
							open_patched.setText(R.string.open_patched_04);
							lite.setText(R.string.lite_04);
							cloned.setText(R.string.cloned_04);
							spap.setText(R.string.spap_04);
							mirror.setText(R.string.mirror_04);
							download.setText(R.string.download_04);
							cancel.setText(R.string.cancel_04);
							later.setText(R.string.later_04);
							go_back.setText(R.string.go_back_04);
							not_now.setText(R.string.not_now_04);
							close.setText(R.string.close_04);
							continue_1.setText(R.string.continue_1_04);
							install.setText(R.string.install_04);
							uninstall.setText(R.string.uninstall_04);
							ignore.setText(R.string.ignore_04);
							delete.setText(R.string.delete_04);
							thanks.setText(R.string.thanks_04);
							new_update.setText(R.string.new_update_04);
							changelogs.setText(R.string.changelogs_04);
							reboot.setText(R.string.reboot_04);
							reset_preferences.setText(R.string.reset_preferences_04);
							list_auto_refresh.setText(R.string.list_auto_refresh_04);
							list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_04);
							force_auto_install.setText(R.string.force_auto_install_04);
							force_auto_install_info.setText(R.string.force_auto_install_desc_04);
							apk_location.setText(R.string.apk_location_04);
							apk_location_info.setText(R.string.apk_location_desc_04);
							clear_directory_folders.setText(R.string.clear_directory_folders_04);
							clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_04);
							cloned_version.setText(R.string.cloned_version_04);
							cloned_version_info.setText(R.string.cloned_version_desc_04);
							experiment_version.setText(R.string.experimental_version_04);
							experiment_version_info.setText(R.string.experimental_version_desc_04);
							disable_reward_ad.setText(R.string.disable_rewarded_ads_04);
							disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_04);
							show_support.setText(R.string.show_support_04);
							show_support_desc.setText(R.string.show_support_desc_04);
							maintenance.setText(R.string.maintenance_04);
							maintenance_desc.setText(R.string.maintenance_desc_04);
							xmanager_dev.setText(R.string.xmanager_dev_04);
							patched_devs.setText(R.string.patched_devs_04);
							support_team.setText(R.string.support_team_04);
							manager_testers.setText(R.string.manager_testers_04);
							manager_hosting.setText(R.string.manager_hosting_04);
							mobilism_team.setText(R.string.mobilism_team_04);
							forum_team.setText(R.string.forum_team_04);
							contributors.setText(R.string.contributors_04);
							download_selected.setText(R.string.download_selected_04);
							download_ready.setText(R.string.download_ready_04);
							download_ready_desc.setText(R.string.download_ready_desc_04);
							downloading_file.setText(R.string.downloading_file_04);
							download_success.setText(R.string.download_success_04);
							installation_failed.setText(R.string.installation_failed_04);
							installation_failed_desc.setText(R.string.installation_failed_desc_04);
							installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_04);
							installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_04);
							existing_patched.setText(R.string.existing_patched_04);
							existing_patched_desc.setText(R.string.existing_patched_desc_04);
							lite_0 = lite.getText().toString();
							download_0 = download.getText().toString();
							continue_0 = continue_1.getText().toString();
							cancel_0 = cancel.getText().toString();
							later_0 = later.getText().toString();
							mirror_0 = mirror.getText().toString();
							install_now_0 = install_now.getText().toString();
							go_back_0 = go_back.getText().toString();
							install_update_0 = install_update.getText().toString();
							close_0 = close.getText().toString();
							uninstall_0 = uninstall.getText().toString();
							existing_patched_0 = existing_patched.getText().toString();
							existing_patched_desc_0 = existing_patched_desc.getText().toString();
							download_selected_0 = download_selected.getText().toString();
							download_ready_0 = download_ready.getText().toString();
							download_ready_desc_0 = download_ready_desc.getText().toString();
							downloading_file_0 = downloading_file.getText().toString();
							download_success_0 = download_success.getText().toString();
							installation_failed_0 = installation_failed.getText().toString();
							installation_failed_desc_0 = installation_failed_desc.getText().toString();
							installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
							installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
							select_language.setSelection((int)(4));
						}
						else {
							if (LANGUAGE.getString("LANGUAGE", "").equals("5")) {
								sub_text_installed.setText(R.string.installed_05);
								main_title.setText(R.string.main_title_05);
								about_title.setText(R.string.about_title_05);
								settings_title.setText(R.string.settings_title_05);
								experiment_title.setText(R.string.experimental_title_05);
								sub_title.setText(R.string.about_sub_05);
								sub_text_1.setText(R.string.latest_05);
								sub_text_2.setText(R.string.latest_05);
								sub_text_3.setText(R.string.latest_05);
								versions_1.setText(R.string.versions_05);
								versions_2.setText(R.string.versions_05);
								versions_3.setText(R.string.versions_05);
								title_sub.setText(R.string.manager_tools_05);
								source.setText(R.string.source_05);
								support.setText(R.string.support_05);
								donate.setText(R.string.donate_05);
								discord.setText(R.string.discord_05);
								about.setText(R.string.about_05);
								website.setText(R.string.website_05);
								reddit.setText(R.string.reddit_05);
								faq.setText(R.string.faq_05);
								theme.setText(R.string.show_themes_05);
								language.setText(R.string.language_05);
								download_update.setText(R.string.download_update_05);
								install_now.setText(R.string.install_now_05);
								install_update.setText(R.string.install_update_05);
								uninstall_patched.setText(R.string.uninstall_patched_05);
								open_settings.setText(R.string.open_settings_05);
								open_patched.setText(R.string.open_patched_05);
								lite.setText(R.string.lite_05);
								cloned.setText(R.string.cloned_05);
								spap.setText(R.string.spap_05);
								mirror.setText(R.string.mirror_05);
								download.setText(R.string.download_05);
								cancel.setText(R.string.cancel_05);
								later.setText(R.string.later_05);
								go_back.setText(R.string.go_back_05);
								not_now.setText(R.string.not_now_05);
								close.setText(R.string.close_05);
								continue_1.setText(R.string.continue_1_05);
								install.setText(R.string.install_05);
								uninstall.setText(R.string.uninstall_05);
								ignore.setText(R.string.ignore_05);
								delete.setText(R.string.delete_05);
								thanks.setText(R.string.thanks_05);
								new_update.setText(R.string.new_update_05);
								changelogs.setText(R.string.changelogs_05);
								reboot.setText(R.string.reboot_05);
								reset_preferences.setText(R.string.reset_preferences_05);
								list_auto_refresh.setText(R.string.list_auto_refresh_05);
								list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_05);
								force_auto_install.setText(R.string.force_auto_install_05);
								force_auto_install_info.setText(R.string.force_auto_install_desc_05);
								apk_location.setText(R.string.apk_location_05);
								apk_location_info.setText(R.string.apk_location_desc_05);
								clear_directory_folders.setText(R.string.clear_directory_folders_05);
								clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_05);
								cloned_version.setText(R.string.cloned_version_05);
								cloned_version_info.setText(R.string.cloned_version_desc_05);
								experiment_version.setText(R.string.experimental_version_05);
								experiment_version_info.setText(R.string.experimental_version_desc_05);
								disable_reward_ad.setText(R.string.disable_rewarded_ads_05);
								disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_05);
								show_support.setText(R.string.show_support_05);
								show_support_desc.setText(R.string.show_support_desc_05);
								maintenance.setText(R.string.maintenance_05);
								maintenance_desc.setText(R.string.maintenance_desc_05);
								xmanager_dev.setText(R.string.xmanager_dev_05);
								patched_devs.setText(R.string.patched_devs_05);
								support_team.setText(R.string.support_team_05);
								manager_testers.setText(R.string.manager_testers_05);
								manager_hosting.setText(R.string.manager_hosting_05);
								mobilism_team.setText(R.string.mobilism_team_05);
								forum_team.setText(R.string.forum_team_05);
								contributors.setText(R.string.contributors_05);
								download_selected.setText(R.string.download_selected_05);
								download_ready.setText(R.string.download_ready_05);
								download_ready_desc.setText(R.string.download_ready_desc_05);
								downloading_file.setText(R.string.downloading_file_05);
								download_success.setText(R.string.download_success_05);
								installation_failed.setText(R.string.installation_failed_05);
								installation_failed_desc.setText(R.string.installation_failed_desc_05);
								installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_05);
								installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_05);
								existing_patched.setText(R.string.existing_patched_05);
								existing_patched_desc.setText(R.string.existing_patched_desc_05);
								lite_0 = lite.getText().toString();
								download_0 = download.getText().toString();
								continue_0 = continue_1.getText().toString();
								cancel_0 = cancel.getText().toString();
								later_0 = later.getText().toString();
								mirror_0 = mirror.getText().toString();
								install_now_0 = install_now.getText().toString();
								go_back_0 = go_back.getText().toString();
								install_update_0 = install_update.getText().toString();
								close_0 = close.getText().toString();
								uninstall_0 = uninstall.getText().toString();
								existing_patched_0 = existing_patched.getText().toString();
								existing_patched_desc_0 = existing_patched_desc.getText().toString();
								download_selected_0 = download_selected.getText().toString();
								download_ready_0 = download_ready.getText().toString();
								download_ready_desc_0 = download_ready_desc.getText().toString();
								downloading_file_0 = downloading_file.getText().toString();
								download_success_0 = download_success.getText().toString();
								installation_failed_0 = installation_failed.getText().toString();
								installation_failed_desc_0 = installation_failed_desc.getText().toString();
								installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
								installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
								select_language.setSelection((int)(5));
							}
							else {
								if (LANGUAGE.getString("LANGUAGE", "").equals("6")) {
									sub_text_installed.setText(R.string.installed_06);
									main_title.setText(R.string.main_title_06);
									about_title.setText(R.string.about_title_06);
									settings_title.setText(R.string.settings_title_06);
									experiment_title.setText(R.string.experimental_title_06);
									sub_title.setText(R.string.about_sub_06);
									sub_text_1.setText(R.string.latest_06);
									sub_text_2.setText(R.string.latest_06);
									sub_text_3.setText(R.string.latest_06);
									versions_1.setText(R.string.versions_06);
									versions_2.setText(R.string.versions_06);
									versions_3.setText(R.string.versions_06);
									title_sub.setText(R.string.manager_tools_06);
									source.setText(R.string.source_06);
									support.setText(R.string.support_06);
									donate.setText(R.string.donate_06);
									discord.setText(R.string.discord_06);
									about.setText(R.string.about_06);
									website.setText(R.string.website_06);
									reddit.setText(R.string.reddit_06);
									faq.setText(R.string.faq_06);
									theme.setText(R.string.show_themes_06);
									language.setText(R.string.language_06);
									download_update.setText(R.string.download_update_06);
									install_now.setText(R.string.install_now_06);
									install_update.setText(R.string.install_update_06);
									uninstall_patched.setText(R.string.uninstall_patched_06);
									open_settings.setText(R.string.open_settings_06);
									open_patched.setText(R.string.open_patched_06);
									lite.setText(R.string.lite_06);
									cloned.setText(R.string.cloned_06);
									spap.setText(R.string.spap_06);
									mirror.setText(R.string.mirror_06);
									download.setText(R.string.download_06);
									cancel.setText(R.string.cancel_06);
									later.setText(R.string.later_06);
									go_back.setText(R.string.go_back_06);
									not_now.setText(R.string.not_now_06);
									close.setText(R.string.close_06);
									continue_1.setText(R.string.continue_1_06);
									install.setText(R.string.install_06);
									uninstall.setText(R.string.uninstall_06);
									ignore.setText(R.string.ignore_06);
									delete.setText(R.string.delete_06);
									thanks.setText(R.string.thanks_06);
									new_update.setText(R.string.new_update_06);
									changelogs.setText(R.string.changelogs_06);
									reboot.setText(R.string.reboot_06);
									reset_preferences.setText(R.string.reset_preferences_06);
									list_auto_refresh.setText(R.string.list_auto_refresh_06);
									list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_06);
									force_auto_install.setText(R.string.force_auto_install_06);
									force_auto_install_info.setText(R.string.force_auto_install_desc_06);
									apk_location.setText(R.string.apk_location_06);
									apk_location_info.setText(R.string.apk_location_desc_06);
									clear_directory_folders.setText(R.string.clear_directory_folders_06);
									clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_06);
									cloned_version.setText(R.string.cloned_version_06);
									cloned_version_info.setText(R.string.cloned_version_desc_06);
									experiment_version.setText(R.string.experimental_version_06);
									experiment_version_info.setText(R.string.experimental_version_desc_06);
									disable_reward_ad.setText(R.string.disable_rewarded_ads_06);
									disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_06);
									show_support.setText(R.string.show_support_06);
									show_support_desc.setText(R.string.show_support_desc_06);
									maintenance.setText(R.string.maintenance_06);
									maintenance_desc.setText(R.string.maintenance_desc_06);
									xmanager_dev.setText(R.string.xmanager_dev_06);
									patched_devs.setText(R.string.patched_devs_06);
									support_team.setText(R.string.support_team_06);
									manager_testers.setText(R.string.manager_testers_06);
									manager_hosting.setText(R.string.manager_hosting_06);
									mobilism_team.setText(R.string.mobilism_team_06);
									forum_team.setText(R.string.forum_team_06);
									contributors.setText(R.string.contributors_06);
									download_selected.setText(R.string.download_selected_06);
									download_ready.setText(R.string.download_ready_06);
									download_ready_desc.setText(R.string.download_ready_desc_06);
									downloading_file.setText(R.string.downloading_file_06);
									download_success.setText(R.string.download_success_06);
									installation_failed.setText(R.string.installation_failed_06);
									installation_failed_desc.setText(R.string.installation_failed_desc_06);
									installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_06);
									installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_06);
									existing_patched.setText(R.string.existing_patched_06);
									existing_patched_desc.setText(R.string.existing_patched_desc_06);
									lite_0 = lite.getText().toString();
									download_0 = download.getText().toString();
									continue_0 = continue_1.getText().toString();
									cancel_0 = cancel.getText().toString();
									later_0 = later.getText().toString();
									mirror_0 = mirror.getText().toString();
									install_now_0 = install_now.getText().toString();
									go_back_0 = go_back.getText().toString();
									install_update_0 = install_update.getText().toString();
									close_0 = close.getText().toString();
									uninstall_0 = uninstall.getText().toString();
									existing_patched_0 = existing_patched.getText().toString();
									existing_patched_desc_0 = existing_patched_desc.getText().toString();
									download_selected_0 = download_selected.getText().toString();
									download_ready_0 = download_ready.getText().toString();
									download_ready_desc_0 = download_ready_desc.getText().toString();
									downloading_file_0 = downloading_file.getText().toString();
									download_success_0 = download_success.getText().toString();
									installation_failed_0 = installation_failed.getText().toString();
									installation_failed_desc_0 = installation_failed_desc.getText().toString();
									installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
									installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
									select_language.setSelection((int)(6));
								}
								else {
									if (LANGUAGE.getString("LANGUAGE", "").equals("7")) {
										sub_text_installed.setText(R.string.installed_07);
										main_title.setText(R.string.main_title_07);
										about_title.setText(R.string.about_title_07);
										settings_title.setText(R.string.settings_title_07);
										experiment_title.setText(R.string.experimental_title_07);
										sub_title.setText(R.string.about_sub_07);
										sub_text_1.setText(R.string.latest_07);
										sub_text_2.setText(R.string.latest_07);
										sub_text_3.setText(R.string.latest_07);
										versions_1.setText(R.string.versions_07);
										versions_2.setText(R.string.versions_07);
										versions_3.setText(R.string.versions_07);
										title_sub.setText(R.string.manager_tools_07);
										source.setText(R.string.source_07);
										support.setText(R.string.support_07);
										donate.setText(R.string.donate_07);
										discord.setText(R.string.discord_07);
										about.setText(R.string.about_07);
										website.setText(R.string.website_07);
										reddit.setText(R.string.reddit_07);
										faq.setText(R.string.faq_07);
										theme.setText(R.string.show_themes_07);
										language.setText(R.string.language_07);
										download_update.setText(R.string.download_update_07);
										install_now.setText(R.string.install_now_07);
										install_update.setText(R.string.install_update_07);
										uninstall_patched.setText(R.string.uninstall_patched_07);
										open_settings.setText(R.string.open_settings_07);
										open_patched.setText(R.string.open_patched_07);
										lite.setText(R.string.lite_07);
										cloned.setText(R.string.cloned_07);
										spap.setText(R.string.spap_07);
										mirror.setText(R.string.mirror_07);
										download.setText(R.string.download_07);
										cancel.setText(R.string.cancel_07);
										later.setText(R.string.later_07);
										go_back.setText(R.string.go_back_07);
										not_now.setText(R.string.not_now_07);
										close.setText(R.string.close_07);
										continue_1.setText(R.string.continue_1_07);
										install.setText(R.string.install_07);
										uninstall.setText(R.string.uninstall_07);
										ignore.setText(R.string.ignore_07);
										delete.setText(R.string.delete_07);
										thanks.setText(R.string.thanks_07);
										new_update.setText(R.string.new_update_07);
										changelogs.setText(R.string.changelogs_07);
										reboot.setText(R.string.reboot_07);
										reset_preferences.setText(R.string.reset_preferences_07);
										list_auto_refresh.setText(R.string.list_auto_refresh_07);
										list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_07);
										force_auto_install.setText(R.string.force_auto_install_07);
										force_auto_install_info.setText(R.string.force_auto_install_desc_07);
										apk_location.setText(R.string.apk_location_07);
										apk_location_info.setText(R.string.apk_location_desc_07);
										clear_directory_folders.setText(R.string.clear_directory_folders_07);
										clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_07);
										cloned_version.setText(R.string.cloned_version_07);
										cloned_version_info.setText(R.string.cloned_version_desc_07);
										experiment_version.setText(R.string.experimental_version_07);
										experiment_version_info.setText(R.string.experimental_version_desc_07);
										disable_reward_ad.setText(R.string.disable_rewarded_ads_07);
										disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_07);
										show_support.setText(R.string.show_support_07);
										show_support_desc.setText(R.string.show_support_desc_07);
										maintenance.setText(R.string.maintenance_07);
										maintenance_desc.setText(R.string.maintenance_desc_07);
										xmanager_dev.setText(R.string.xmanager_dev_07);
										patched_devs.setText(R.string.patched_devs_07);
										support_team.setText(R.string.support_team_07);
										manager_testers.setText(R.string.manager_testers_07);
										manager_hosting.setText(R.string.manager_hosting_07);
										mobilism_team.setText(R.string.mobilism_team_07);
										forum_team.setText(R.string.forum_team_07);
										contributors.setText(R.string.contributors_07);
										download_selected.setText(R.string.download_selected_07);
										download_ready.setText(R.string.download_ready_07);
										download_ready_desc.setText(R.string.download_ready_desc_07);
										downloading_file.setText(R.string.downloading_file_07);
										download_success.setText(R.string.download_success_07);
										installation_failed.setText(R.string.installation_failed_07);
										installation_failed_desc.setText(R.string.installation_failed_desc_07);
										installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_07);
										installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_07);
										existing_patched.setText(R.string.existing_patched_07);
										existing_patched_desc.setText(R.string.existing_patched_desc_07);
										lite_0 = lite.getText().toString();
										download_0 = download.getText().toString();
										continue_0 = continue_1.getText().toString();
										cancel_0 = cancel.getText().toString();
										later_0 = later.getText().toString();
										mirror_0 = mirror.getText().toString();
										install_now_0 = install_now.getText().toString();
										go_back_0 = go_back.getText().toString();
										install_update_0 = install_update.getText().toString();
										close_0 = close.getText().toString();
										uninstall_0 = uninstall.getText().toString();
										existing_patched_0 = existing_patched.getText().toString();
										existing_patched_desc_0 = existing_patched_desc.getText().toString();
										download_selected_0 = download_selected.getText().toString();
										download_ready_0 = download_ready.getText().toString();
										download_ready_desc_0 = download_ready_desc.getText().toString();
										downloading_file_0 = downloading_file.getText().toString();
										download_success_0 = download_success.getText().toString();
										installation_failed_0 = installation_failed.getText().toString();
										installation_failed_desc_0 = installation_failed_desc.getText().toString();
										installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
										installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
										select_language.setSelection((int)(7));
									}
									else {
										if (LANGUAGE.getString("LANGUAGE", "").equals("8")) {
											sub_text_installed.setText(R.string.installed_08);
											main_title.setText(R.string.main_title_08);
											about_title.setText(R.string.about_title_08);
											settings_title.setText(R.string.settings_title_08);
											experiment_title.setText(R.string.experimental_title_08);
											sub_title.setText(R.string.about_sub_08);
											sub_text_1.setText(R.string.latest_08);
											sub_text_2.setText(R.string.latest_08);
											sub_text_3.setText(R.string.latest_08);
											versions_1.setText(R.string.versions_08);
											versions_2.setText(R.string.versions_08);
											versions_3.setText(R.string.versions_08);
											title_sub.setText(R.string.manager_tools_08);
											source.setText(R.string.source_08);
											support.setText(R.string.support_08);
											donate.setText(R.string.donate_08);
											discord.setText(R.string.discord_08);
											about.setText(R.string.about_08);
											website.setText(R.string.website_08);
											reddit.setText(R.string.reddit_08);
											faq.setText(R.string.faq_08);
											theme.setText(R.string.show_themes_08);
											language.setText(R.string.language_08);
											download_update.setText(R.string.download_update_08);
											install_now.setText(R.string.install_now_08);
											install_update.setText(R.string.install_update_08);
											uninstall_patched.setText(R.string.uninstall_patched_08);
											open_settings.setText(R.string.open_settings_08);
											open_patched.setText(R.string.open_patched_08);
											lite.setText(R.string.lite_08);
											cloned.setText(R.string.cloned_08);
											spap.setText(R.string.spap_08);
											mirror.setText(R.string.mirror_08);
											download.setText(R.string.download_08);
											cancel.setText(R.string.cancel_08);
											later.setText(R.string.later_08);
											go_back.setText(R.string.go_back_08);
											not_now.setText(R.string.not_now_08);
											close.setText(R.string.close_08);
											continue_1.setText(R.string.continue_1_08);
											install.setText(R.string.install_08);
											uninstall.setText(R.string.uninstall_08);
											ignore.setText(R.string.ignore_08);
											delete.setText(R.string.delete_08);
											thanks.setText(R.string.thanks_08);
											new_update.setText(R.string.new_update_08);
											changelogs.setText(R.string.changelogs_08);
											reboot.setText(R.string.reboot_08);
											reset_preferences.setText(R.string.reset_preferences_08);
											list_auto_refresh.setText(R.string.list_auto_refresh_08);
											list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_08);
											force_auto_install.setText(R.string.force_auto_install_08);
											force_auto_install_info.setText(R.string.force_auto_install_desc_08);
											apk_location.setText(R.string.apk_location_08);
											apk_location_info.setText(R.string.apk_location_desc_08);
											clear_directory_folders.setText(R.string.clear_directory_folders_08);
											clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_08);
											cloned_version.setText(R.string.cloned_version_08);
											cloned_version_info.setText(R.string.cloned_version_desc_08);
											experiment_version.setText(R.string.experimental_version_08);
											experiment_version_info.setText(R.string.experimental_version_desc_08);
											disable_reward_ad.setText(R.string.disable_rewarded_ads_08);
											disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_08);
											show_support.setText(R.string.show_support_08);
											show_support_desc.setText(R.string.show_support_desc_08);
											maintenance.setText(R.string.maintenance_08);
											maintenance_desc.setText(R.string.maintenance_desc_08);
											xmanager_dev.setText(R.string.xmanager_dev_08);
											patched_devs.setText(R.string.patched_devs_08);
											support_team.setText(R.string.support_team_08);
											manager_testers.setText(R.string.manager_testers_08);
											manager_hosting.setText(R.string.manager_hosting_08);
											mobilism_team.setText(R.string.mobilism_team_08);
											forum_team.setText(R.string.forum_team_08);
											contributors.setText(R.string.contributors_08);
											download_selected.setText(R.string.download_selected_08);
											download_ready.setText(R.string.download_ready_08);
											download_ready_desc.setText(R.string.download_ready_desc_08);
											downloading_file.setText(R.string.downloading_file_08);
											download_success.setText(R.string.download_success_08);
											installation_failed.setText(R.string.installation_failed_08);
											installation_failed_desc.setText(R.string.installation_failed_desc_08);
											installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_08);
											installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_08);
											existing_patched.setText(R.string.existing_patched_08);
											existing_patched_desc.setText(R.string.existing_patched_desc_08);
											lite_0 = lite.getText().toString();
											download_0 = download.getText().toString();
											continue_0 = continue_1.getText().toString();
											cancel_0 = cancel.getText().toString();
											later_0 = later.getText().toString();
											mirror_0 = mirror.getText().toString();
											install_now_0 = install_now.getText().toString();
											go_back_0 = go_back.getText().toString();
											install_update_0 = install_update.getText().toString();
											close_0 = close.getText().toString();
											uninstall_0 = uninstall.getText().toString();
											existing_patched_0 = existing_patched.getText().toString();
											existing_patched_desc_0 = existing_patched_desc.getText().toString();
											download_selected_0 = download_selected.getText().toString();
											download_ready_0 = download_ready.getText().toString();
											download_ready_desc_0 = download_ready_desc.getText().toString();
											downloading_file_0 = downloading_file.getText().toString();
											download_success_0 = download_success.getText().toString();
											installation_failed_0 = installation_failed.getText().toString();
											installation_failed_desc_0 = installation_failed_desc.getText().toString();
											installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
											installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
											select_language.setSelection((int)(8));
										}
										else {
											if (LANGUAGE.getString("LANGUAGE", "").equals("9")) {
												sub_text_installed.setText(R.string.installed_09);
												main_title.setText(R.string.main_title_09);
												about_title.setText(R.string.about_title_09);
												settings_title.setText(R.string.settings_title_09);
												experiment_title.setText(R.string.experimental_title_09);
												sub_title.setText(R.string.about_sub_09);
												sub_text_1.setText(R.string.latest_09);
												sub_text_2.setText(R.string.latest_09);
												sub_text_3.setText(R.string.latest_09);
												versions_1.setText(R.string.versions_09);
												versions_2.setText(R.string.versions_09);
												versions_3.setText(R.string.versions_09);
												title_sub.setText(R.string.manager_tools_09);
												source.setText(R.string.source_09);
												support.setText(R.string.support_09);
												donate.setText(R.string.donate_09);
												discord.setText(R.string.discord_09);
												about.setText(R.string.about_09);
												website.setText(R.string.website_09);
												reddit.setText(R.string.reddit_09);
												faq.setText(R.string.faq_09);
												theme.setText(R.string.show_themes_09);
												language.setText(R.string.language_09);
												download_update.setText(R.string.download_update_09);
												install_now.setText(R.string.install_now_09);
												install_update.setText(R.string.install_update_09);
												uninstall_patched.setText(R.string.uninstall_patched_09);
												open_settings.setText(R.string.open_settings_09);
												open_patched.setText(R.string.open_patched_09);
												lite.setText(R.string.lite_09);
												cloned.setText(R.string.cloned_09);
												spap.setText(R.string.spap_09);
												mirror.setText(R.string.mirror_09);
												download.setText(R.string.download_09);
												cancel.setText(R.string.cancel_09);
												later.setText(R.string.later_09);
												go_back.setText(R.string.go_back_09);
												not_now.setText(R.string.not_now_09);
												close.setText(R.string.close_09);
												continue_1.setText(R.string.continue_1_09);
												install.setText(R.string.install_09);
												uninstall.setText(R.string.uninstall_09);
												ignore.setText(R.string.ignore_09);
												delete.setText(R.string.delete_09);
												thanks.setText(R.string.thanks_09);
												new_update.setText(R.string.new_update_09);
												changelogs.setText(R.string.changelogs_09);
												reboot.setText(R.string.reboot_09);
												reset_preferences.setText(R.string.reset_preferences_09);
												list_auto_refresh.setText(R.string.list_auto_refresh_09);
												list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_09);
												force_auto_install.setText(R.string.force_auto_install_09);
												force_auto_install_info.setText(R.string.force_auto_install_desc_09);
												apk_location.setText(R.string.apk_location_09);
												apk_location_info.setText(R.string.apk_location_desc_09);
												clear_directory_folders.setText(R.string.clear_directory_folders_09);
												clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_09);
												cloned_version.setText(R.string.cloned_version_09);
												cloned_version_info.setText(R.string.cloned_version_desc_09);
												experiment_version.setText(R.string.experimental_version_09);
												experiment_version_info.setText(R.string.experimental_version_desc_09);
												disable_reward_ad.setText(R.string.disable_rewarded_ads_09);
												disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_09);
												show_support.setText(R.string.show_support_09);
												show_support_desc.setText(R.string.show_support_desc_09);
												maintenance.setText(R.string.maintenance_09);
												maintenance_desc.setText(R.string.maintenance_desc_09);
												xmanager_dev.setText(R.string.xmanager_dev_09);
												patched_devs.setText(R.string.patched_devs_09);
												support_team.setText(R.string.support_team_09);
												manager_testers.setText(R.string.manager_testers_09);
												manager_hosting.setText(R.string.manager_hosting_09);
												mobilism_team.setText(R.string.mobilism_team_09);
												forum_team.setText(R.string.forum_team_09);
												contributors.setText(R.string.contributors_09);
												download_selected.setText(R.string.download_selected_09);
												download_ready.setText(R.string.download_ready_09);
												download_ready_desc.setText(R.string.download_ready_desc_09);
												downloading_file.setText(R.string.downloading_file_09);
												download_success.setText(R.string.download_success_09);
												installation_failed.setText(R.string.installation_failed_09);
												installation_failed_desc.setText(R.string.installation_failed_desc_09);
												installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_09);
												installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_09);
												existing_patched.setText(R.string.existing_patched_09);
												existing_patched_desc.setText(R.string.existing_patched_desc_09);
												lite_0 = lite.getText().toString();
												download_0 = download.getText().toString();
												continue_0 = continue_1.getText().toString();
												cancel_0 = cancel.getText().toString();
												later_0 = later.getText().toString();
												mirror_0 = mirror.getText().toString();
												install_now_0 = install_now.getText().toString();
												go_back_0 = go_back.getText().toString();
												install_update_0 = install_update.getText().toString();
												close_0 = close.getText().toString();
												uninstall_0 = uninstall.getText().toString();
												existing_patched_0 = existing_patched.getText().toString();
												existing_patched_desc_0 = existing_patched_desc.getText().toString();
												download_selected_0 = download_selected.getText().toString();
												download_ready_0 = download_ready.getText().toString();
												download_ready_desc_0 = download_ready_desc.getText().toString();
												downloading_file_0 = downloading_file.getText().toString();
												download_success_0 = download_success.getText().toString();
												installation_failed_0 = installation_failed.getText().toString();
												installation_failed_desc_0 = installation_failed_desc.getText().toString();
												installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
												installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
												select_language.setSelection((int)(9));
											}
											else {
												if (LANGUAGE.getString("LANGUAGE", "").equals("10")) {
													sub_text_installed.setText(R.string.installed_10);
													main_title.setText(R.string.main_title_10);
													about_title.setText(R.string.about_title_10);
													settings_title.setText(R.string.settings_title_10);
													experiment_title.setText(R.string.experimental_title_10);
													sub_title.setText(R.string.about_sub_10);
													sub_text_1.setText(R.string.latest_10);
													sub_text_2.setText(R.string.latest_10);
													sub_text_3.setText(R.string.latest_10);
													versions_1.setText(R.string.versions_10);
													versions_2.setText(R.string.versions_10);
													versions_3.setText(R.string.versions_10);
													title_sub.setText(R.string.manager_tools_10);
													source.setText(R.string.source_10);
													support.setText(R.string.support_10);
													donate.setText(R.string.donate_10);
													discord.setText(R.string.discord_10);
													about.setText(R.string.about_10);
													website.setText(R.string.website_10);
													reddit.setText(R.string.reddit_10);
													faq.setText(R.string.faq_10);
													theme.setText(R.string.show_themes_10);
													language.setText(R.string.language_10);
													download_update.setText(R.string.download_update_10);
													install_now.setText(R.string.install_now_10);
													install_update.setText(R.string.install_update_10);
													uninstall_patched.setText(R.string.uninstall_patched_10);
													open_settings.setText(R.string.open_settings_10);
													open_patched.setText(R.string.open_patched_10);
													lite.setText(R.string.lite_10);
													cloned.setText(R.string.cloned_10);
													spap.setText(R.string.spap_10);
													mirror.setText(R.string.mirror_10);
													download.setText(R.string.download_10);
													cancel.setText(R.string.cancel_10);
													later.setText(R.string.later_10);
													go_back.setText(R.string.go_back_10);
													not_now.setText(R.string.not_now_10);
													close.setText(R.string.close_10);
													continue_1.setText(R.string.continue_1_10);
													install.setText(R.string.install_10);
													uninstall.setText(R.string.uninstall_10);
													ignore.setText(R.string.ignore_10);
													delete.setText(R.string.delete_10);
													thanks.setText(R.string.thanks_10);
													new_update.setText(R.string.new_update_10);
													changelogs.setText(R.string.changelogs_10);
													reboot.setText(R.string.reboot_10);
													reset_preferences.setText(R.string.reset_preferences_10);
													list_auto_refresh.setText(R.string.list_auto_refresh_10);
													list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_10);
													force_auto_install.setText(R.string.force_auto_install_10);
													force_auto_install_info.setText(R.string.force_auto_install_desc_10);
													apk_location.setText(R.string.apk_location_10);
													apk_location_info.setText(R.string.apk_location_desc_10);
													clear_directory_folders.setText(R.string.clear_directory_folders_10);
													clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_10);
													cloned_version.setText(R.string.cloned_version_10);
													cloned_version_info.setText(R.string.cloned_version_desc_10);
													experiment_version.setText(R.string.experimental_version_10);
													experiment_version_info.setText(R.string.experimental_version_desc_10);
													disable_reward_ad.setText(R.string.disable_rewarded_ads_10);
													disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_10);
													show_support.setText(R.string.show_support_10);
													show_support_desc.setText(R.string.show_support_desc_10);
													maintenance.setText(R.string.maintenance_10);
													maintenance_desc.setText(R.string.maintenance_desc_10);
													xmanager_dev.setText(R.string.xmanager_dev_10);
													patched_devs.setText(R.string.patched_devs_10);
													support_team.setText(R.string.support_team_10);
													manager_testers.setText(R.string.manager_testers_10);
													manager_hosting.setText(R.string.manager_hosting_10);
													mobilism_team.setText(R.string.mobilism_team_10);
													forum_team.setText(R.string.forum_team_10);
													contributors.setText(R.string.contributors_10);
													download_selected.setText(R.string.download_selected_10);
													download_ready.setText(R.string.download_ready_10);
													download_ready_desc.setText(R.string.download_ready_desc_10);
													downloading_file.setText(R.string.downloading_file_10);
													download_success.setText(R.string.download_success_10);
													installation_failed.setText(R.string.installation_failed_10);
													installation_failed_desc.setText(R.string.installation_failed_desc_10);
													installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_10);
													installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_10);
													existing_patched.setText(R.string.existing_patched_10);
													existing_patched_desc.setText(R.string.existing_patched_desc_10);
													lite_0 = lite.getText().toString();
													download_0 = download.getText().toString();
													continue_0 = continue_1.getText().toString();
													cancel_0 = cancel.getText().toString();
													later_0 = later.getText().toString();
													mirror_0 = mirror.getText().toString();
													install_now_0 = install_now.getText().toString();
													go_back_0 = go_back.getText().toString();
													install_update_0 = install_update.getText().toString();
													close_0 = close.getText().toString();
													uninstall_0 = uninstall.getText().toString();
													existing_patched_0 = existing_patched.getText().toString();
													existing_patched_desc_0 = existing_patched_desc.getText().toString();
													download_selected_0 = download_selected.getText().toString();
													download_ready_0 = download_ready.getText().toString();
													download_ready_desc_0 = download_ready_desc.getText().toString();
													downloading_file_0 = downloading_file.getText().toString();
													download_success_0 = download_success.getText().toString();
													installation_failed_0 = installation_failed.getText().toString();
													installation_failed_desc_0 = installation_failed_desc.getText().toString();
													installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
													installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
													select_language.setSelection((int)(10));
												}
												else {
													if (LANGUAGE.getString("LANGUAGE", "").equals("11")) {
														sub_text_installed.setText(R.string.installed_11);
														main_title.setText(R.string.main_title_11);
														about_title.setText(R.string.about_title_11);
														settings_title.setText(R.string.settings_title_11);
														experiment_title.setText(R.string.experimental_title_11);
														sub_title.setText(R.string.about_sub_11);
														sub_text_1.setText(R.string.latest_11);
														sub_text_2.setText(R.string.latest_11);
														sub_text_3.setText(R.string.latest_11);
														versions_1.setText(R.string.versions_11);
														versions_2.setText(R.string.versions_11);
														versions_3.setText(R.string.versions_11);
														title_sub.setText(R.string.manager_tools_11);
														source.setText(R.string.source_11);
														support.setText(R.string.support_11);
														donate.setText(R.string.donate_11);
														discord.setText(R.string.discord_11);
														about.setText(R.string.about_11);
														website.setText(R.string.website_11);
														reddit.setText(R.string.reddit_11);
														faq.setText(R.string.faq_11);
														theme.setText(R.string.show_themes_11);
														language.setText(R.string.language_11);
														download_update.setText(R.string.download_update_11);
														install_now.setText(R.string.install_now_11);
														install_update.setText(R.string.install_update_11);
														uninstall_patched.setText(R.string.uninstall_patched_11);
														open_settings.setText(R.string.open_settings_11);
														open_patched.setText(R.string.open_patched_11);
														lite.setText(R.string.lite_11);
														cloned.setText(R.string.cloned_11);
														spap.setText(R.string.spap_11);
														mirror.setText(R.string.mirror_11);
														download.setText(R.string.download_11);
														cancel.setText(R.string.cancel_11);
														later.setText(R.string.later_11);
														go_back.setText(R.string.go_back_11);
														not_now.setText(R.string.not_now_11);
														close.setText(R.string.close_11);
														continue_1.setText(R.string.continue_1_11);
														install.setText(R.string.install_11);
														uninstall.setText(R.string.uninstall_11);
														ignore.setText(R.string.ignore_11);
														delete.setText(R.string.delete_11);
														thanks.setText(R.string.thanks_11);
														new_update.setText(R.string.new_update_11);
														changelogs.setText(R.string.changelogs_11);
														reboot.setText(R.string.reboot_11);
														reset_preferences.setText(R.string.reset_preferences_11);
														list_auto_refresh.setText(R.string.list_auto_refresh_11);
														list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_11);
														force_auto_install.setText(R.string.force_auto_install_11);
														force_auto_install_info.setText(R.string.force_auto_install_desc_11);
														apk_location.setText(R.string.apk_location_11);
														apk_location_info.setText(R.string.apk_location_desc_11);
														clear_directory_folders.setText(R.string.clear_directory_folders_11);
														clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_11);
														cloned_version.setText(R.string.cloned_version_11);
														cloned_version_info.setText(R.string.cloned_version_desc_11);
														experiment_version.setText(R.string.experimental_version_11);
														experiment_version_info.setText(R.string.experimental_version_desc_11);
														disable_reward_ad.setText(R.string.disable_rewarded_ads_11);
														disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_11);
														show_support.setText(R.string.show_support_11);
														show_support_desc.setText(R.string.show_support_desc_11);
														maintenance.setText(R.string.maintenance_11);
														maintenance_desc.setText(R.string.maintenance_desc_11);
														xmanager_dev.setText(R.string.xmanager_dev_11);
														patched_devs.setText(R.string.patched_devs_11);
														support_team.setText(R.string.support_team_11);
														manager_testers.setText(R.string.manager_testers_11);
														manager_hosting.setText(R.string.manager_hosting_11);
														mobilism_team.setText(R.string.mobilism_team_11);
														forum_team.setText(R.string.forum_team_11);
														contributors.setText(R.string.contributors_11);
														download_selected.setText(R.string.download_selected_11);
														download_ready.setText(R.string.download_ready_11);
														download_ready_desc.setText(R.string.download_ready_desc_11);
														downloading_file.setText(R.string.downloading_file_11);
														download_success.setText(R.string.download_success_11);
														installation_failed.setText(R.string.installation_failed_11);
														installation_failed_desc.setText(R.string.installation_failed_desc_11);
														installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_11);
														installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_11);
														existing_patched.setText(R.string.existing_patched_11);
														existing_patched_desc.setText(R.string.existing_patched_desc_11);
														lite_0 = lite.getText().toString();
														download_0 = download.getText().toString();
														continue_0 = continue_1.getText().toString();
														cancel_0 = cancel.getText().toString();
														later_0 = later.getText().toString();
														mirror_0 = mirror.getText().toString();
														install_now_0 = install_now.getText().toString();
														go_back_0 = go_back.getText().toString();
														install_update_0 = install_update.getText().toString();
														close_0 = close.getText().toString();
														uninstall_0 = uninstall.getText().toString();
														existing_patched_0 = existing_patched.getText().toString();
														existing_patched_desc_0 = existing_patched_desc.getText().toString();
														download_selected_0 = download_selected.getText().toString();
														download_ready_0 = download_ready.getText().toString();
														download_ready_desc_0 = download_ready_desc.getText().toString();
														downloading_file_0 = downloading_file.getText().toString();
														download_success_0 = download_success.getText().toString();
														installation_failed_0 = installation_failed.getText().toString();
														installation_failed_desc_0 = installation_failed_desc.getText().toString();
														installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
														installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
														select_language.setSelection((int)(11));
													}
													else {
														if (LANGUAGE.getString("LANGUAGE", "").equals("12")) {
															sub_text_installed.setText(R.string.installed_12);
															main_title.setText(R.string.main_title_12);
															about_title.setText(R.string.about_title_12);
															settings_title.setText(R.string.settings_title_12);
															experiment_title.setText(R.string.experimental_title_12);
															sub_title.setText(R.string.about_sub_12);
															sub_text_1.setText(R.string.latest_12);
															sub_text_2.setText(R.string.latest_12);
															sub_text_3.setText(R.string.latest_12);
															versions_1.setText(R.string.versions_12);
															versions_2.setText(R.string.versions_12);
															versions_3.setText(R.string.versions_12);
															title_sub.setText(R.string.manager_tools_12);
															source.setText(R.string.source_12);
															support.setText(R.string.support_12);
															donate.setText(R.string.donate_12);
															discord.setText(R.string.discord_12);
															about.setText(R.string.about_12);
															website.setText(R.string.website_12);
															reddit.setText(R.string.reddit_12);
															faq.setText(R.string.faq_12);
															theme.setText(R.string.show_themes_12);
															language.setText(R.string.language_12);
															download_update.setText(R.string.download_update_12);
															install_now.setText(R.string.install_now_12);
															install_update.setText(R.string.install_update_12);
															uninstall_patched.setText(R.string.uninstall_patched_12);
															open_settings.setText(R.string.open_settings_12);
															open_patched.setText(R.string.open_patched_12);
															lite.setText(R.string.lite_12);
															cloned.setText(R.string.cloned_12);
															spap.setText(R.string.spap_12);
															mirror.setText(R.string.mirror_12);
															download.setText(R.string.download_12);
															cancel.setText(R.string.cancel_12);
															later.setText(R.string.later_12);
															go_back.setText(R.string.go_back_12);
															not_now.setText(R.string.not_now_12);
															close.setText(R.string.close_12);
															continue_1.setText(R.string.continue_1_12);
															install.setText(R.string.install_12);
															uninstall.setText(R.string.uninstall_12);
															ignore.setText(R.string.ignore_12);
															delete.setText(R.string.delete_12);
															thanks.setText(R.string.thanks_12);
															new_update.setText(R.string.new_update_12);
															changelogs.setText(R.string.changelogs_12);
															reboot.setText(R.string.reboot_12);
															reset_preferences.setText(R.string.reset_preferences_12);
															list_auto_refresh.setText(R.string.list_auto_refresh_12);
															list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_12);
															force_auto_install.setText(R.string.force_auto_install_12);
															force_auto_install_info.setText(R.string.force_auto_install_desc_12);
															apk_location.setText(R.string.apk_location_12);
															apk_location_info.setText(R.string.apk_location_desc_12);
															clear_directory_folders.setText(R.string.clear_directory_folders_12);
															clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_12);
															cloned_version.setText(R.string.cloned_version_12);
															cloned_version_info.setText(R.string.cloned_version_desc_12);
															experiment_version.setText(R.string.experimental_version_12);
															experiment_version_info.setText(R.string.experimental_version_desc_12);
															disable_reward_ad.setText(R.string.disable_rewarded_ads_12);
															disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_12);
															show_support.setText(R.string.show_support_12);
															show_support_desc.setText(R.string.show_support_desc_12);
															maintenance.setText(R.string.maintenance_12);
															maintenance_desc.setText(R.string.maintenance_desc_12);
															xmanager_dev.setText(R.string.xmanager_dev_12);
															patched_devs.setText(R.string.patched_devs_12);
															support_team.setText(R.string.support_team_12);
															manager_testers.setText(R.string.manager_testers_12);
															manager_hosting.setText(R.string.manager_hosting_12);
															mobilism_team.setText(R.string.mobilism_team_12);
															forum_team.setText(R.string.forum_team_12);
															contributors.setText(R.string.contributors_12);
															download_selected.setText(R.string.download_selected_12);
															download_ready.setText(R.string.download_ready_12);
															download_ready_desc.setText(R.string.download_ready_desc_12);
															downloading_file.setText(R.string.downloading_file_12);
															download_success.setText(R.string.download_success_12);
															installation_failed.setText(R.string.installation_failed_12);
															installation_failed_desc.setText(R.string.installation_failed_desc_12);
															installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_12);
															installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_12);
															existing_patched.setText(R.string.existing_patched_12);
															existing_patched_desc.setText(R.string.existing_patched_desc_12);
															lite_0 = lite.getText().toString();
															download_0 = download.getText().toString();
															continue_0 = continue_1.getText().toString();
															cancel_0 = cancel.getText().toString();
															later_0 = later.getText().toString();
															mirror_0 = mirror.getText().toString();
															install_now_0 = install_now.getText().toString();
															go_back_0 = go_back.getText().toString();
															install_update_0 = install_update.getText().toString();
															close_0 = close.getText().toString();
															uninstall_0 = uninstall.getText().toString();
															existing_patched_0 = existing_patched.getText().toString();
															existing_patched_desc_0 = existing_patched_desc.getText().toString();
															download_selected_0 = download_selected.getText().toString();
															download_ready_0 = download_ready.getText().toString();
															download_ready_desc_0 = download_ready_desc.getText().toString();
															downloading_file_0 = downloading_file.getText().toString();
															download_success_0 = download_success.getText().toString();
															installation_failed_0 = installation_failed.getText().toString();
															installation_failed_desc_0 = installation_failed_desc.getText().toString();
															installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
															installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
															select_language.setSelection((int)(12));
														}
														else {
															if (LANGUAGE.getString("LANGUAGE", "").equals("13")) {
																sub_text_installed.setText(R.string.installed_13);
																main_title.setText(R.string.main_title_13);
																about_title.setText(R.string.about_title_13);
																settings_title.setText(R.string.settings_title_13);
																experiment_title.setText(R.string.experimental_title_13);
																sub_title.setText(R.string.about_sub_13);
																sub_text_1.setText(R.string.latest_13);
																sub_text_2.setText(R.string.latest_13);
																sub_text_3.setText(R.string.latest_13);
																versions_1.setText(R.string.versions_13);
																versions_2.setText(R.string.versions_13);
																versions_3.setText(R.string.versions_13);
																title_sub.setText(R.string.manager_tools_13);
																source.setText(R.string.source_13);
																support.setText(R.string.support_13);
																donate.setText(R.string.donate_13);
																discord.setText(R.string.discord_13);
																about.setText(R.string.about_13);
																website.setText(R.string.website_13);
																reddit.setText(R.string.reddit_13);
																faq.setText(R.string.faq_13);
																theme.setText(R.string.show_themes_13);
																language.setText(R.string.language_13);
																download_update.setText(R.string.download_update_13);
																install_now.setText(R.string.install_now_13);
																install_update.setText(R.string.install_update_13);
																uninstall_patched.setText(R.string.uninstall_patched_13);
																open_settings.setText(R.string.open_settings_13);
																open_patched.setText(R.string.open_patched_13);
																lite.setText(R.string.lite_13);
																cloned.setText(R.string.cloned_13);
																spap.setText(R.string.spap_13);
																mirror.setText(R.string.mirror_13);
																download.setText(R.string.download_13);
																cancel.setText(R.string.cancel_13);
																later.setText(R.string.later_13);
																go_back.setText(R.string.go_back_13);
																not_now.setText(R.string.not_now_13);
																close.setText(R.string.close_13);
																continue_1.setText(R.string.continue_1_13);
																install.setText(R.string.install_13);
																uninstall.setText(R.string.uninstall_13);
																ignore.setText(R.string.ignore_13);
																delete.setText(R.string.delete_13);
																thanks.setText(R.string.thanks_13);
																new_update.setText(R.string.new_update_13);
																changelogs.setText(R.string.changelogs_13);
																reboot.setText(R.string.reboot_13);
																reset_preferences.setText(R.string.reset_preferences_13);
																list_auto_refresh.setText(R.string.list_auto_refresh_13);
																list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_13);
																force_auto_install.setText(R.string.force_auto_install_13);
																force_auto_install_info.setText(R.string.force_auto_install_desc_13);
																apk_location.setText(R.string.apk_location_13);
																apk_location_info.setText(R.string.apk_location_desc_13);
																clear_directory_folders.setText(R.string.clear_directory_folders_13);
																clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_13);
																cloned_version.setText(R.string.cloned_version_13);
																cloned_version_info.setText(R.string.cloned_version_desc_13);
																experiment_version.setText(R.string.experimental_version_13);
																experiment_version_info.setText(R.string.experimental_version_desc_13);
																disable_reward_ad.setText(R.string.disable_rewarded_ads_13);
																disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_13);
																show_support.setText(R.string.show_support_13);
																show_support_desc.setText(R.string.show_support_desc_13);
																maintenance.setText(R.string.maintenance_13);
																maintenance_desc.setText(R.string.maintenance_desc_13);
																xmanager_dev.setText(R.string.xmanager_dev_13);
																patched_devs.setText(R.string.patched_devs_13);
																support_team.setText(R.string.support_team_13);
																manager_testers.setText(R.string.manager_testers_13);
																manager_hosting.setText(R.string.manager_hosting_13);
																mobilism_team.setText(R.string.mobilism_team_13);
																forum_team.setText(R.string.forum_team_13);
																contributors.setText(R.string.contributors_13);
																download_selected.setText(R.string.download_selected_13);
																download_ready.setText(R.string.download_ready_13);
																download_ready_desc.setText(R.string.download_ready_desc_13);
																downloading_file.setText(R.string.downloading_file_13);
																download_success.setText(R.string.download_success_13);
																installation_failed.setText(R.string.installation_failed_13);
																installation_failed_desc.setText(R.string.installation_failed_desc_13);
																installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_13);
																installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_13);
																existing_patched.setText(R.string.existing_patched_13);
																existing_patched_desc.setText(R.string.existing_patched_desc_13);
																lite_0 = lite.getText().toString();
																download_0 = download.getText().toString();
																continue_0 = continue_1.getText().toString();
																cancel_0 = cancel.getText().toString();
																later_0 = later.getText().toString();
																mirror_0 = mirror.getText().toString();
																install_now_0 = install_now.getText().toString();
																go_back_0 = go_back.getText().toString();
																install_update_0 = install_update.getText().toString();
																close_0 = close.getText().toString();
																uninstall_0 = uninstall.getText().toString();
																existing_patched_0 = existing_patched.getText().toString();
																existing_patched_desc_0 = existing_patched_desc.getText().toString();
																download_selected_0 = download_selected.getText().toString();
																download_ready_0 = download_ready.getText().toString();
																download_ready_desc_0 = download_ready_desc.getText().toString();
																downloading_file_0 = downloading_file.getText().toString();
																download_success_0 = download_success.getText().toString();
																installation_failed_0 = installation_failed.getText().toString();
																installation_failed_desc_0 = installation_failed_desc.getText().toString();
																installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																select_language.setSelection((int)(13));
															}
															else {
																if (LANGUAGE.getString("LANGUAGE", "").equals("14")) {
																	sub_text_installed.setText(R.string.installed_14);
																	main_title.setText(R.string.main_title_14);
																	about_title.setText(R.string.about_title_14);
																	settings_title.setText(R.string.settings_title_14);
																	experiment_title.setText(R.string.experimental_title_14);
																	sub_title.setText(R.string.about_sub_14);
																	sub_text_1.setText(R.string.latest_14);
																	sub_text_2.setText(R.string.latest_14);
																	sub_text_3.setText(R.string.latest_14);
																	versions_1.setText(R.string.versions_14);
																	versions_2.setText(R.string.versions_14);
																	versions_3.setText(R.string.versions_14);
																	title_sub.setText(R.string.manager_tools_14);
																	source.setText(R.string.source_14);
																	support.setText(R.string.support_14);
																	donate.setText(R.string.donate_14);
																	discord.setText(R.string.discord_14);
																	about.setText(R.string.about_14);
																	website.setText(R.string.website_14);
																	reddit.setText(R.string.reddit_14);
																	faq.setText(R.string.faq_14);
																	theme.setText(R.string.show_themes_14);
																	language.setText(R.string.language_14);
																	download_update.setText(R.string.download_update_14);
																	install_now.setText(R.string.install_now_14);
																	install_update.setText(R.string.install_update_14);
																	uninstall_patched.setText(R.string.uninstall_patched_14);
																	open_settings.setText(R.string.open_settings_14);
																	open_patched.setText(R.string.open_patched_14);
																	lite.setText(R.string.lite_14);
																	cloned.setText(R.string.cloned_14);
																	spap.setText(R.string.spap_14);
																	mirror.setText(R.string.mirror_14);
																	download.setText(R.string.download_14);
																	cancel.setText(R.string.cancel_14);
																	later.setText(R.string.later_14);
																	go_back.setText(R.string.go_back_14);
																	not_now.setText(R.string.not_now_14);
																	close.setText(R.string.close_14);
																	continue_1.setText(R.string.continue_1_14);
																	install.setText(R.string.install_14);
																	uninstall.setText(R.string.uninstall_14);
																	ignore.setText(R.string.ignore_14);
																	delete.setText(R.string.delete_14);
																	thanks.setText(R.string.thanks_14);
																	new_update.setText(R.string.new_update_14);
																	changelogs.setText(R.string.changelogs_14);
																	reboot.setText(R.string.reboot_14);
																	reset_preferences.setText(R.string.reset_preferences_14);
																	list_auto_refresh.setText(R.string.list_auto_refresh_14);
																	list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_14);
																	force_auto_install.setText(R.string.force_auto_install_14);
																	force_auto_install_info.setText(R.string.force_auto_install_desc_14);
																	apk_location.setText(R.string.apk_location_14);
																	apk_location_info.setText(R.string.apk_location_desc_14);
																	clear_directory_folders.setText(R.string.clear_directory_folders_14);
																	clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_14);
																	cloned_version.setText(R.string.cloned_version_14);
																	cloned_version_info.setText(R.string.cloned_version_desc_14);
																	experiment_version.setText(R.string.experimental_version_14);
																	experiment_version_info.setText(R.string.experimental_version_desc_14);
																	disable_reward_ad.setText(R.string.disable_rewarded_ads_14);
																	disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_14);
																	show_support.setText(R.string.show_support_14);
																	show_support_desc.setText(R.string.show_support_desc_14);
																	maintenance.setText(R.string.maintenance_14);
																	maintenance_desc.setText(R.string.maintenance_desc_14);
																	xmanager_dev.setText(R.string.xmanager_dev_14);
																	patched_devs.setText(R.string.patched_devs_14);
																	support_team.setText(R.string.support_team_14);
																	manager_testers.setText(R.string.manager_testers_14);
																	manager_hosting.setText(R.string.manager_hosting_14);
																	mobilism_team.setText(R.string.mobilism_team_14);
																	forum_team.setText(R.string.forum_team_14);
																	contributors.setText(R.string.contributors_14);
																	download_selected.setText(R.string.download_selected_14);
																	download_ready.setText(R.string.download_ready_14);
																	download_ready_desc.setText(R.string.download_ready_desc_14);
																	downloading_file.setText(R.string.downloading_file_14);
																	download_success.setText(R.string.download_success_14);
																	installation_failed.setText(R.string.installation_failed_14);
																	installation_failed_desc.setText(R.string.installation_failed_desc_14);
																	installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_14);
																	installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_14);
																	existing_patched.setText(R.string.existing_patched_14);
																	existing_patched_desc.setText(R.string.existing_patched_desc_14);
																	lite_0 = lite.getText().toString();
																	download_0 = download.getText().toString();
																	continue_0 = continue_1.getText().toString();
																	cancel_0 = cancel.getText().toString();
																	later_0 = later.getText().toString();
																	mirror_0 = mirror.getText().toString();
																	install_now_0 = install_now.getText().toString();
																	go_back_0 = go_back.getText().toString();
																	install_update_0 = install_update.getText().toString();
																	close_0 = close.getText().toString();
																	uninstall_0 = uninstall.getText().toString();
																	existing_patched_0 = existing_patched.getText().toString();
																	existing_patched_desc_0 = existing_patched_desc.getText().toString();
																	download_selected_0 = download_selected.getText().toString();
																	download_ready_0 = download_ready.getText().toString();
																	download_ready_desc_0 = download_ready_desc.getText().toString();
																	downloading_file_0 = downloading_file.getText().toString();
																	download_success_0 = download_success.getText().toString();
																	installation_failed_0 = installation_failed.getText().toString();
																	installation_failed_desc_0 = installation_failed_desc.getText().toString();
																	installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																	installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																	select_language.setSelection((int)(14));
																}
																else {
																	if (LANGUAGE.getString("LANGUAGE", "").equals("15")) {
																		sub_text_installed.setText(R.string.installed_15);
																		main_title.setText(R.string.main_title_15);
																		about_title.setText(R.string.about_title_15);
																		settings_title.setText(R.string.settings_title_15);
																		experiment_title.setText(R.string.experimental_title_15);
																		sub_title.setText(R.string.about_sub_15);
																		sub_text_1.setText(R.string.latest_15);
																		sub_text_2.setText(R.string.latest_15);
																		sub_text_3.setText(R.string.latest_15);
																		versions_1.setText(R.string.versions_15);
																		versions_2.setText(R.string.versions_15);
																		versions_3.setText(R.string.versions_15);
																		title_sub.setText(R.string.manager_tools_15);
																		source.setText(R.string.source_15);
																		support.setText(R.string.support_15);
																		donate.setText(R.string.donate_15);
																		discord.setText(R.string.discord_15);
																		about.setText(R.string.about_15);
																		website.setText(R.string.website_15);
																		reddit.setText(R.string.reddit_15);
																		faq.setText(R.string.faq_15);
																		theme.setText(R.string.show_themes_15);
																		language.setText(R.string.language_15);
																		download_update.setText(R.string.download_update_15);
																		install_now.setText(R.string.install_now_15);
																		install_update.setText(R.string.install_update_15);
																		uninstall_patched.setText(R.string.uninstall_patched_15);
																		open_settings.setText(R.string.open_settings_15);
																		open_patched.setText(R.string.open_patched_15);
																		lite.setText(R.string.lite_15);
																		cloned.setText(R.string.cloned_15);
																		spap.setText(R.string.spap_15);
																		mirror.setText(R.string.mirror_15);
																		download.setText(R.string.download_15);
																		cancel.setText(R.string.cancel_15);
																		later.setText(R.string.later_15);
																		go_back.setText(R.string.go_back_15);
																		not_now.setText(R.string.not_now_15);
																		close.setText(R.string.close_15);
																		continue_1.setText(R.string.continue_1_15);
																		install.setText(R.string.install_15);
																		uninstall.setText(R.string.uninstall_15);
																		ignore.setText(R.string.ignore_15);
																		delete.setText(R.string.delete_15);
																		thanks.setText(R.string.thanks_15);
																		new_update.setText(R.string.new_update_15);
																		changelogs.setText(R.string.changelogs_15);
																		reboot.setText(R.string.reboot_15);
																		reset_preferences.setText(R.string.reset_preferences_15);
																		list_auto_refresh.setText(R.string.list_auto_refresh_15);
																		list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_15);
																		force_auto_install.setText(R.string.force_auto_install_15);
																		force_auto_install_info.setText(R.string.force_auto_install_desc_15);
																		apk_location.setText(R.string.apk_location_15);
																		apk_location_info.setText(R.string.apk_location_desc_15);
																		clear_directory_folders.setText(R.string.clear_directory_folders_15);
																		clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_15);
																		cloned_version.setText(R.string.cloned_version_15);
																		cloned_version_info.setText(R.string.cloned_version_desc_15);
																		experiment_version.setText(R.string.experimental_version_15);
																		experiment_version_info.setText(R.string.experimental_version_desc_15);
																		disable_reward_ad.setText(R.string.disable_rewarded_ads_15);
																		disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_15);
																		show_support.setText(R.string.show_support_15);
																		show_support_desc.setText(R.string.show_support_desc_15);
																		maintenance.setText(R.string.maintenance_15);
																		maintenance_desc.setText(R.string.maintenance_desc_15);
																		xmanager_dev.setText(R.string.xmanager_dev_15);
																		patched_devs.setText(R.string.patched_devs_15);
																		support_team.setText(R.string.support_team_15);
																		manager_testers.setText(R.string.manager_testers_15);
																		manager_hosting.setText(R.string.manager_hosting_15);
																		mobilism_team.setText(R.string.mobilism_team_15);
																		forum_team.setText(R.string.forum_team_15);
																		contributors.setText(R.string.contributors_15);
																		download_selected.setText(R.string.download_selected_15);
																		download_ready.setText(R.string.download_ready_15);
																		download_ready_desc.setText(R.string.download_ready_desc_15);
																		downloading_file.setText(R.string.downloading_file_15);
																		download_success.setText(R.string.download_success_15);
																		installation_failed.setText(R.string.installation_failed_15);
																		installation_failed_desc.setText(R.string.installation_failed_desc_15);
																		installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_15);
																		installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_15);
																		existing_patched.setText(R.string.existing_patched_15);
																		existing_patched_desc.setText(R.string.existing_patched_desc_15);
																		lite_0 = lite.getText().toString();
																		download_0 = download.getText().toString();
																		continue_0 = continue_1.getText().toString();
																		cancel_0 = cancel.getText().toString();
																		later_0 = later.getText().toString();
																		mirror_0 = mirror.getText().toString();
																		install_now_0 = install_now.getText().toString();
																		go_back_0 = go_back.getText().toString();
																		install_update_0 = install_update.getText().toString();
																		close_0 = close.getText().toString();
																		uninstall_0 = uninstall.getText().toString();
																		existing_patched_0 = existing_patched.getText().toString();
																		existing_patched_desc_0 = existing_patched_desc.getText().toString();
																		download_selected_0 = download_selected.getText().toString();
																		download_ready_0 = download_ready.getText().toString();
																		download_ready_desc_0 = download_ready_desc.getText().toString();
																		downloading_file_0 = downloading_file.getText().toString();
																		download_success_0 = download_success.getText().toString();
																		installation_failed_0 = installation_failed.getText().toString();
																		installation_failed_desc_0 = installation_failed_desc.getText().toString();
																		installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																		installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																		select_language.setSelection((int)(15));
																	}
																	else {
																		if (LANGUAGE.getString("LANGUAGE", "").equals("16")) {
																			sub_text_installed.setText(R.string.installed_16);
																			main_title.setText(R.string.main_title_16);
																			about_title.setText(R.string.about_title_16);
																			settings_title.setText(R.string.settings_title_16);
																			experiment_title.setText(R.string.experimental_title_16);
																			sub_title.setText(R.string.about_sub_16);
																			sub_text_1.setText(R.string.latest_16);
																			sub_text_2.setText(R.string.latest_16);
																			sub_text_3.setText(R.string.latest_16);
																			versions_1.setText(R.string.versions_16);
																			versions_2.setText(R.string.versions_16);
																			versions_3.setText(R.string.versions_16);
																			title_sub.setText(R.string.manager_tools_16);
																			source.setText(R.string.source_16);
																			support.setText(R.string.support_16);
																			donate.setText(R.string.donate_16);
																			discord.setText(R.string.discord_16);
																			about.setText(R.string.about_16);
																			website.setText(R.string.website_16);
																			reddit.setText(R.string.reddit_16);
																			faq.setText(R.string.faq_16);
																			theme.setText(R.string.show_themes_16);
																			language.setText(R.string.language_16);
																			download_update.setText(R.string.download_update_16);
																			install_now.setText(R.string.install_now_16);
																			install_update.setText(R.string.install_update_16);
																			uninstall_patched.setText(R.string.uninstall_patched_16);
																			open_settings.setText(R.string.open_settings_16);
																			open_patched.setText(R.string.open_patched_16);
																			lite.setText(R.string.lite_16);
																			cloned.setText(R.string.cloned_16);
																			spap.setText(R.string.spap_16);
																			mirror.setText(R.string.mirror_16);
																			download.setText(R.string.download_16);
																			cancel.setText(R.string.cancel_16);
																			later.setText(R.string.later_16);
																			go_back.setText(R.string.go_back_16);
																			not_now.setText(R.string.not_now_16);
																			close.setText(R.string.close_16);
																			continue_1.setText(R.string.continue_1_16);
																			install.setText(R.string.install_16);
																			uninstall.setText(R.string.uninstall_16);
																			ignore.setText(R.string.ignore_16);
																			delete.setText(R.string.delete_16);
																			thanks.setText(R.string.thanks_16);
																			new_update.setText(R.string.new_update_16);
																			changelogs.setText(R.string.changelogs_16);
																			reboot.setText(R.string.reboot_16);
																			reset_preferences.setText(R.string.reset_preferences_16);
																			list_auto_refresh.setText(R.string.list_auto_refresh_16);
																			list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_16);
																			force_auto_install.setText(R.string.force_auto_install_16);
																			force_auto_install_info.setText(R.string.force_auto_install_desc_16);
																			apk_location.setText(R.string.apk_location_16);
																			apk_location_info.setText(R.string.apk_location_desc_16);
																			clear_directory_folders.setText(R.string.clear_directory_folders_16);
																			clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_16);
																			cloned_version.setText(R.string.cloned_version_16);
																			cloned_version_info.setText(R.string.cloned_version_desc_16);
																			experiment_version.setText(R.string.experimental_version_16);
																			experiment_version_info.setText(R.string.experimental_version_desc_16);
																			disable_reward_ad.setText(R.string.disable_rewarded_ads_16);
																			disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_16);
																			show_support.setText(R.string.show_support_16);
																			show_support_desc.setText(R.string.show_support_desc_16);
																			maintenance.setText(R.string.maintenance_16);
																			maintenance_desc.setText(R.string.maintenance_desc_16);
																			xmanager_dev.setText(R.string.xmanager_dev_16);
																			patched_devs.setText(R.string.patched_devs_16);
																			support_team.setText(R.string.support_team_16);
																			manager_testers.setText(R.string.manager_testers_16);
																			manager_hosting.setText(R.string.manager_hosting_16);
																			mobilism_team.setText(R.string.mobilism_team_16);
																			forum_team.setText(R.string.forum_team_16);
																			contributors.setText(R.string.contributors_16);
																			download_selected.setText(R.string.download_selected_16);
																			download_ready.setText(R.string.download_ready_16);
																			download_ready_desc.setText(R.string.download_ready_desc_16);
																			downloading_file.setText(R.string.downloading_file_16);
																			download_success.setText(R.string.download_success_16);
																			installation_failed.setText(R.string.installation_failed_16);
																			installation_failed_desc.setText(R.string.installation_failed_desc_16);
																			installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_16);
																			installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_16);
																			existing_patched.setText(R.string.existing_patched_16);
																			existing_patched_desc.setText(R.string.existing_patched_desc_16);
																			lite_0 = lite.getText().toString();
																			download_0 = download.getText().toString();
																			continue_0 = continue_1.getText().toString();
																			cancel_0 = cancel.getText().toString();
																			later_0 = later.getText().toString();
																			mirror_0 = mirror.getText().toString();
																			install_now_0 = install_now.getText().toString();
																			go_back_0 = go_back.getText().toString();
																			install_update_0 = install_update.getText().toString();
																			close_0 = close.getText().toString();
																			uninstall_0 = uninstall.getText().toString();
																			existing_patched_0 = existing_patched.getText().toString();
																			existing_patched_desc_0 = existing_patched_desc.getText().toString();
																			download_selected_0 = download_selected.getText().toString();
																			download_ready_0 = download_ready.getText().toString();
																			download_ready_desc_0 = download_ready_desc.getText().toString();
																			downloading_file_0 = downloading_file.getText().toString();
																			download_success_0 = download_success.getText().toString();
																			installation_failed_0 = installation_failed.getText().toString();
																			installation_failed_desc_0 = installation_failed_desc.getText().toString();
																			installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																			installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																			select_language.setSelection((int)(16));
																		}
																		else {
																			if (LANGUAGE.getString("LANGUAGE", "").equals("17")) {
																				sub_text_installed.setText(R.string.installed_17);
																				main_title.setText(R.string.main_title_17);
																				about_title.setText(R.string.about_title_17);
																				settings_title.setText(R.string.settings_title_17);
																				experiment_title.setText(R.string.experimental_title_17);
																				sub_title.setText(R.string.about_sub_17);
																				sub_text_1.setText(R.string.latest_17);
																				sub_text_2.setText(R.string.latest_17);
																				sub_text_3.setText(R.string.latest_17);
																				versions_1.setText(R.string.versions_17);
																				versions_2.setText(R.string.versions_17);
																				versions_3.setText(R.string.versions_17);
																				title_sub.setText(R.string.manager_tools_17);
																				source.setText(R.string.source_17);
																				support.setText(R.string.support_17);
																				donate.setText(R.string.donate_17);
																				discord.setText(R.string.discord_17);
																				about.setText(R.string.about_17);
																				website.setText(R.string.website_17);
																				reddit.setText(R.string.reddit_17);
																				faq.setText(R.string.faq_17);
																				theme.setText(R.string.show_themes_17);
																				language.setText(R.string.language_17);
																				download_update.setText(R.string.download_update_17);
																				install_now.setText(R.string.install_now_17);
																				install_update.setText(R.string.install_update_17);
																				uninstall_patched.setText(R.string.uninstall_patched_17);
																				open_settings.setText(R.string.open_settings_17);
																				open_patched.setText(R.string.open_patched_17);
																				lite.setText(R.string.lite_17);
																				cloned.setText(R.string.cloned_17);
																				spap.setText(R.string.spap_17);
																				mirror.setText(R.string.mirror_17);
																				download.setText(R.string.download_17);
																				cancel.setText(R.string.cancel_17);
																				later.setText(R.string.later_17);
																				go_back.setText(R.string.go_back_17);
																				not_now.setText(R.string.not_now_17);
																				close.setText(R.string.close_17);
																				continue_1.setText(R.string.continue_1_17);
																				install.setText(R.string.install_17);
																				uninstall.setText(R.string.uninstall_17);
																				ignore.setText(R.string.ignore_17);
																				delete.setText(R.string.delete_17);
																				thanks.setText(R.string.thanks_17);
																				new_update.setText(R.string.new_update_17);
																				changelogs.setText(R.string.changelogs_17);
																				reboot.setText(R.string.reboot_17);
																				reset_preferences.setText(R.string.reset_preferences_17);
																				list_auto_refresh.setText(R.string.list_auto_refresh_17);
																				list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_17);
																				force_auto_install.setText(R.string.force_auto_install_17);
																				force_auto_install_info.setText(R.string.force_auto_install_desc_17);
																				apk_location.setText(R.string.apk_location_17);
																				apk_location_info.setText(R.string.apk_location_desc_17);
																				clear_directory_folders.setText(R.string.clear_directory_folders_17);
																				clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_17);
																				cloned_version.setText(R.string.cloned_version_17);
																				cloned_version_info.setText(R.string.cloned_version_desc_17);
																				experiment_version.setText(R.string.experimental_version_17);
																				experiment_version_info.setText(R.string.experimental_version_desc_17);
																				disable_reward_ad.setText(R.string.disable_rewarded_ads_17);
																				disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_17);
																				show_support.setText(R.string.show_support_17);
																				show_support_desc.setText(R.string.show_support_desc_17);
																				maintenance.setText(R.string.maintenance_17);
																				maintenance_desc.setText(R.string.maintenance_desc_17);
																				xmanager_dev.setText(R.string.xmanager_dev_17);
																				patched_devs.setText(R.string.patched_devs_17);
																				support_team.setText(R.string.support_team_17);
																				manager_testers.setText(R.string.manager_testers_17);
																				manager_hosting.setText(R.string.manager_hosting_17);
																				mobilism_team.setText(R.string.mobilism_team_17);
																				forum_team.setText(R.string.forum_team_17);
																				contributors.setText(R.string.contributors_17);
																				download_selected.setText(R.string.download_selected_17);
																				download_ready.setText(R.string.download_ready_17);
																				download_ready_desc.setText(R.string.download_ready_desc_17);
																				downloading_file.setText(R.string.downloading_file_17);
																				download_success.setText(R.string.download_success_17);
																				installation_failed.setText(R.string.installation_failed_17);
																				installation_failed_desc.setText(R.string.installation_failed_desc_17);
																				installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_17);
																				installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_17);
																				existing_patched.setText(R.string.existing_patched_17);
																				existing_patched_desc.setText(R.string.existing_patched_desc_17);
																				lite_0 = lite.getText().toString();
																				download_0 = download.getText().toString();
																				continue_0 = continue_1.getText().toString();
																				cancel_0 = cancel.getText().toString();
																				later_0 = later.getText().toString();
																				mirror_0 = mirror.getText().toString();
																				install_now_0 = install_now.getText().toString();
																				go_back_0 = go_back.getText().toString();
																				install_update_0 = install_update.getText().toString();
																				close_0 = close.getText().toString();
																				uninstall_0 = uninstall.getText().toString();
																				existing_patched_0 = existing_patched.getText().toString();
																				existing_patched_desc_0 = existing_patched_desc.getText().toString();
																				download_selected_0 = download_selected.getText().toString();
																				download_ready_0 = download_ready.getText().toString();
																				download_ready_desc_0 = download_ready_desc.getText().toString();
																				downloading_file_0 = downloading_file.getText().toString();
																				download_success_0 = download_success.getText().toString();
																				installation_failed_0 = installation_failed.getText().toString();
																				installation_failed_desc_0 = installation_failed_desc.getText().toString();
																				installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																				installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																				select_language.setSelection((int)(17));
																			}
																			else {
																				if (LANGUAGE.getString("LANGUAGE", "").equals("18")) {
																					sub_text_installed.setText(R.string.installed_18);
																					main_title.setText(R.string.main_title_18);
																					about_title.setText(R.string.about_title_18);
																					settings_title.setText(R.string.settings_title_18);
																					experiment_title.setText(R.string.experimental_title_18);
																					sub_title.setText(R.string.about_sub_18);
																					sub_text_1.setText(R.string.latest_18);
																					sub_text_2.setText(R.string.latest_18);
																					sub_text_3.setText(R.string.latest_18);
																					versions_1.setText(R.string.versions_18);
																					versions_2.setText(R.string.versions_18);
																					versions_3.setText(R.string.versions_18);
																					title_sub.setText(R.string.manager_tools_18);
																					source.setText(R.string.source_18);
																					support.setText(R.string.support_18);
																					donate.setText(R.string.donate_18);
																					discord.setText(R.string.discord_18);
																					about.setText(R.string.about_18);
																					website.setText(R.string.website_18);
																					reddit.setText(R.string.reddit_18);
																					faq.setText(R.string.faq_18);
																					theme.setText(R.string.show_themes_18);
																					language.setText(R.string.language_18);
																					download_update.setText(R.string.download_update_18);
																					install_now.setText(R.string.install_now_18);
																					install_update.setText(R.string.install_update_18);
																					uninstall_patched.setText(R.string.uninstall_patched_18);
																					open_settings.setText(R.string.open_settings_18);
																					open_patched.setText(R.string.open_patched_18);
																					lite.setText(R.string.lite_18);
																					cloned.setText(R.string.cloned_18);
																					spap.setText(R.string.spap_18);
																					mirror.setText(R.string.mirror_18);
																					download.setText(R.string.download_18);
																					cancel.setText(R.string.cancel_18);
																					later.setText(R.string.later_18);
																					go_back.setText(R.string.go_back_18);
																					not_now.setText(R.string.not_now_18);
																					close.setText(R.string.close_18);
																					continue_1.setText(R.string.continue_1_18);
																					install.setText(R.string.install_18);
																					uninstall.setText(R.string.uninstall_18);
																					ignore.setText(R.string.ignore_18);
																					delete.setText(R.string.delete_18);
																					thanks.setText(R.string.thanks_18);
																					new_update.setText(R.string.new_update_18);
																					changelogs.setText(R.string.changelogs_18);
																					reboot.setText(R.string.reboot_18);
																					reset_preferences.setText(R.string.reset_preferences_18);
																					list_auto_refresh.setText(R.string.list_auto_refresh_18);
																					list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_18);
																					force_auto_install.setText(R.string.force_auto_install_18);
																					force_auto_install_info.setText(R.string.force_auto_install_desc_18);
																					apk_location.setText(R.string.apk_location_18);
																					apk_location_info.setText(R.string.apk_location_desc_18);
																					clear_directory_folders.setText(R.string.clear_directory_folders_18);
																					clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_18);
																					cloned_version.setText(R.string.cloned_version_18);
																					cloned_version_info.setText(R.string.cloned_version_desc_18);
																					experiment_version.setText(R.string.experimental_version_18);
																					experiment_version_info.setText(R.string.experimental_version_desc_18);
																					disable_reward_ad.setText(R.string.disable_rewarded_ads_18);
																					disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_18);
																					show_support.setText(R.string.show_support_18);
																					show_support_desc.setText(R.string.show_support_desc_18);
																					maintenance.setText(R.string.maintenance_18);
																					maintenance_desc.setText(R.string.maintenance_desc_18);
																					xmanager_dev.setText(R.string.xmanager_dev_18);
																					patched_devs.setText(R.string.patched_devs_18);
																					support_team.setText(R.string.support_team_18);
																					manager_testers.setText(R.string.manager_testers_18);
																					manager_hosting.setText(R.string.manager_hosting_18);
																					mobilism_team.setText(R.string.mobilism_team_18);
																					forum_team.setText(R.string.forum_team_18);
																					contributors.setText(R.string.contributors_18);
																					download_selected.setText(R.string.download_selected_18);
																					download_ready.setText(R.string.download_ready_18);
																					download_ready_desc.setText(R.string.download_ready_desc_18);
																					downloading_file.setText(R.string.downloading_file_18);
																					download_success.setText(R.string.download_success_18);
																					installation_failed.setText(R.string.installation_failed_18);
																					installation_failed_desc.setText(R.string.installation_failed_desc_18);
																					installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_18);
																					installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_18);
																					existing_patched.setText(R.string.existing_patched_18);
																					existing_patched_desc.setText(R.string.existing_patched_desc_18);
																					lite_0 = lite.getText().toString();
																					download_0 = download.getText().toString();
																					continue_0 = continue_1.getText().toString();
																					cancel_0 = cancel.getText().toString();
																					later_0 = later.getText().toString();
																					mirror_0 = mirror.getText().toString();
																					install_now_0 = install_now.getText().toString();
																					go_back_0 = go_back.getText().toString();
																					install_update_0 = install_update.getText().toString();
																					close_0 = close.getText().toString();
																					uninstall_0 = uninstall.getText().toString();
																					existing_patched_0 = existing_patched.getText().toString();
																					existing_patched_desc_0 = existing_patched_desc.getText().toString();
																					download_selected_0 = download_selected.getText().toString();
																					download_ready_0 = download_ready.getText().toString();
																					download_ready_desc_0 = download_ready_desc.getText().toString();
																					downloading_file_0 = downloading_file.getText().toString();
																					download_success_0 = download_success.getText().toString();
																					installation_failed_0 = installation_failed.getText().toString();
																					installation_failed_desc_0 = installation_failed_desc.getText().toString();
																					installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																					installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																					select_language.setSelection((int)(18));
																				}
																				else {
																					if (LANGUAGE.getString("LANGUAGE", "").equals("19")) {
																						sub_text_installed.setText(R.string.installed_19);
																						main_title.setText(R.string.main_title_19);
																						about_title.setText(R.string.about_title_19);
																						settings_title.setText(R.string.settings_title_19);
																						experiment_title.setText(R.string.experimental_title_19);
																						sub_title.setText(R.string.about_sub_19);
																						sub_text_1.setText(R.string.latest_19);
																						sub_text_2.setText(R.string.latest_19);
																						sub_text_3.setText(R.string.latest_19);
																						versions_1.setText(R.string.versions_19);
																						versions_2.setText(R.string.versions_19);
																						versions_3.setText(R.string.versions_19);
																						title_sub.setText(R.string.manager_tools_19);
																						source.setText(R.string.source_19);
																						support.setText(R.string.support_19);
																						donate.setText(R.string.donate_19);
																						discord.setText(R.string.discord_19);
																						about.setText(R.string.about_19);
																						website.setText(R.string.website_19);
																						reddit.setText(R.string.reddit_19);
																						faq.setText(R.string.faq_19);
																						theme.setText(R.string.show_themes_19);
																						language.setText(R.string.language_19);
																						download_update.setText(R.string.download_update_19);
																						install_now.setText(R.string.install_now_19);
																						install_update.setText(R.string.install_update_19);
																						uninstall_patched.setText(R.string.uninstall_patched_19);
																						open_settings.setText(R.string.open_settings_19);
																						open_patched.setText(R.string.open_patched_19);
																						lite.setText(R.string.lite_19);
																						cloned.setText(R.string.cloned_19);
																						spap.setText(R.string.spap_19);
																						mirror.setText(R.string.mirror_19);
																						download.setText(R.string.download_19);
																						cancel.setText(R.string.cancel_19);
																						later.setText(R.string.later_19);
																						go_back.setText(R.string.go_back_19);
																						not_now.setText(R.string.not_now_19);
																						close.setText(R.string.close_19);
																						continue_1.setText(R.string.continue_1_19);
																						install.setText(R.string.install_19);
																						uninstall.setText(R.string.uninstall_19);
																						ignore.setText(R.string.ignore_19);
																						delete.setText(R.string.delete_19);
																						thanks.setText(R.string.thanks_19);
																						new_update.setText(R.string.new_update_19);
																						changelogs.setText(R.string.changelogs_19);
																						reboot.setText(R.string.reboot_19);
																						reset_preferences.setText(R.string.reset_preferences_19);
																						list_auto_refresh.setText(R.string.list_auto_refresh_19);
																						list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_19);
																						force_auto_install.setText(R.string.force_auto_install_19);
																						force_auto_install_info.setText(R.string.force_auto_install_desc_19);
																						apk_location.setText(R.string.apk_location_19);
																						apk_location_info.setText(R.string.apk_location_desc_19);
																						clear_directory_folders.setText(R.string.clear_directory_folders_19);
																						clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_19);
																						cloned_version.setText(R.string.cloned_version_19);
																						cloned_version_info.setText(R.string.cloned_version_desc_19);
																						experiment_version.setText(R.string.experimental_version_19);
																						experiment_version_info.setText(R.string.experimental_version_desc_19);
																						disable_reward_ad.setText(R.string.disable_rewarded_ads_19);
																						disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_19);
																						show_support.setText(R.string.show_support_19);
																						show_support_desc.setText(R.string.show_support_desc_19);
																						maintenance.setText(R.string.maintenance_19);
																						maintenance_desc.setText(R.string.maintenance_desc_19);
																						xmanager_dev.setText(R.string.xmanager_dev_19);
																						patched_devs.setText(R.string.patched_devs_19);
																						support_team.setText(R.string.support_team_19);
																						manager_testers.setText(R.string.manager_testers_19);
																						manager_hosting.setText(R.string.manager_hosting_19);
																						mobilism_team.setText(R.string.mobilism_team_19);
																						forum_team.setText(R.string.forum_team_19);
																						contributors.setText(R.string.contributors_19);
																						download_selected.setText(R.string.download_selected_19);
																						download_ready.setText(R.string.download_ready_19);
																						download_ready_desc.setText(R.string.download_ready_desc_19);
																						downloading_file.setText(R.string.downloading_file_19);
																						download_success.setText(R.string.download_success_19);
																						installation_failed.setText(R.string.installation_failed_19);
																						installation_failed_desc.setText(R.string.installation_failed_desc_19);
																						installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_19);
																						installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_19);
																						existing_patched.setText(R.string.existing_patched_19);
																						existing_patched_desc.setText(R.string.existing_patched_desc_19);
																						lite_0 = lite.getText().toString();
																						download_0 = download.getText().toString();
																						continue_0 = continue_1.getText().toString();
																						cancel_0 = cancel.getText().toString();
																						later_0 = later.getText().toString();
																						mirror_0 = mirror.getText().toString();
																						install_now_0 = install_now.getText().toString();
																						go_back_0 = go_back.getText().toString();
																						install_update_0 = install_update.getText().toString();
																						close_0 = close.getText().toString();
																						uninstall_0 = uninstall.getText().toString();
																						existing_patched_0 = existing_patched.getText().toString();
																						existing_patched_desc_0 = existing_patched_desc.getText().toString();
																						download_selected_0 = download_selected.getText().toString();
																						download_ready_0 = download_ready.getText().toString();
																						download_ready_desc_0 = download_ready_desc.getText().toString();
																						downloading_file_0 = downloading_file.getText().toString();
																						download_success_0 = download_success.getText().toString();
																						installation_failed_0 = installation_failed.getText().toString();
																						installation_failed_desc_0 = installation_failed_desc.getText().toString();
																						installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																						installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																						select_language.setSelection((int)(19));
																					}
																					else {
																						if (LANGUAGE.getString("LANGUAGE", "").equals("20")) {
																							sub_text_installed.setText(R.string.installed_20);
																							main_title.setText(R.string.main_title_20);
																							about_title.setText(R.string.about_title_20);
																							settings_title.setText(R.string.settings_title_20);
																							experiment_title.setText(R.string.experimental_title_20);
																							sub_title.setText(R.string.about_sub_20);
																							sub_text_1.setText(R.string.latest_20);
																							sub_text_2.setText(R.string.latest_20);
																							sub_text_3.setText(R.string.latest_20);
																							versions_1.setText(R.string.versions_20);
																							versions_2.setText(R.string.versions_20);
																							versions_3.setText(R.string.versions_20);
																							title_sub.setText(R.string.manager_tools_20);
																							source.setText(R.string.source_20);
																							support.setText(R.string.support_20);
																							donate.setText(R.string.donate_20);
																							discord.setText(R.string.discord_20);
																							about.setText(R.string.about_20);
																							website.setText(R.string.website_20);
																							reddit.setText(R.string.reddit_20);
																							faq.setText(R.string.faq_20);
																							theme.setText(R.string.show_themes_20);
																							language.setText(R.string.language_20);
																							download_update.setText(R.string.download_update_20);
																							install_now.setText(R.string.install_now_20);
																							install_update.setText(R.string.install_update_20);
																							uninstall_patched.setText(R.string.uninstall_patched_20);
																							open_settings.setText(R.string.open_settings_20);
																							open_patched.setText(R.string.open_patched_20);
																							lite.setText(R.string.lite_20);
																							cloned.setText(R.string.cloned_20);
																							spap.setText(R.string.spap_20);
																							mirror.setText(R.string.mirror_20);
																							download.setText(R.string.download_20);
																							cancel.setText(R.string.cancel_20);
																							later.setText(R.string.later_20);
																							go_back.setText(R.string.go_back_20);
																							not_now.setText(R.string.not_now_20);
																							close.setText(R.string.close_20);
																							continue_1.setText(R.string.continue_1_20);
																							install.setText(R.string.install_20);
																							uninstall.setText(R.string.uninstall_20);
																							ignore.setText(R.string.ignore_20);
																							delete.setText(R.string.delete_20);
																							thanks.setText(R.string.thanks_20);
																							new_update.setText(R.string.new_update_20);
																							changelogs.setText(R.string.changelogs_20);
																							reboot.setText(R.string.reboot_20);
																							reset_preferences.setText(R.string.reset_preferences_20);
																							list_auto_refresh.setText(R.string.list_auto_refresh_20);
																							list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_20);
																							force_auto_install.setText(R.string.force_auto_install_20);
																							force_auto_install_info.setText(R.string.force_auto_install_desc_20);
																							apk_location.setText(R.string.apk_location_20);
																							apk_location_info.setText(R.string.apk_location_desc_20);
																							clear_directory_folders.setText(R.string.clear_directory_folders_20);
																							clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_20);
																							cloned_version.setText(R.string.cloned_version_20);
																							cloned_version_info.setText(R.string.cloned_version_desc_20);
																							experiment_version.setText(R.string.experimental_version_20);
																							experiment_version_info.setText(R.string.experimental_version_desc_20);
																							disable_reward_ad.setText(R.string.disable_rewarded_ads_20);
																							disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_20);
																							show_support.setText(R.string.show_support_20);
																							show_support_desc.setText(R.string.show_support_desc_20);
																							maintenance.setText(R.string.maintenance_20);
																							maintenance_desc.setText(R.string.maintenance_desc_20);
																							xmanager_dev.setText(R.string.xmanager_dev_20);
																							patched_devs.setText(R.string.patched_devs_20);
																							support_team.setText(R.string.support_team_20);
																							manager_testers.setText(R.string.manager_testers_20);
																							manager_hosting.setText(R.string.manager_hosting_20);
																							mobilism_team.setText(R.string.mobilism_team_20);
																							forum_team.setText(R.string.forum_team_20);
																							contributors.setText(R.string.contributors_20);
																							download_selected.setText(R.string.download_selected_20);
																							download_ready.setText(R.string.download_ready_20);
																							download_ready_desc.setText(R.string.download_ready_desc_20);
																							downloading_file.setText(R.string.downloading_file_20);
																							download_success.setText(R.string.download_success_20);
																							installation_failed.setText(R.string.installation_failed_20);
																							installation_failed_desc.setText(R.string.installation_failed_desc_20);
																							installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_20);
																							installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_20);
																							existing_patched.setText(R.string.existing_patched_20);
																							existing_patched_desc.setText(R.string.existing_patched_desc_20);
																							lite_0 = lite.getText().toString();
																							download_0 = download.getText().toString();
																							continue_0 = continue_1.getText().toString();
																							cancel_0 = cancel.getText().toString();
																							later_0 = later.getText().toString();
																							mirror_0 = mirror.getText().toString();
																							install_now_0 = install_now.getText().toString();
																							go_back_0 = go_back.getText().toString();
																							install_update_0 = install_update.getText().toString();
																							close_0 = close.getText().toString();
																							uninstall_0 = uninstall.getText().toString();
																							existing_patched_0 = existing_patched.getText().toString();
																							existing_patched_desc_0 = existing_patched_desc.getText().toString();
																							download_selected_0 = download_selected.getText().toString();
																							download_ready_0 = download_ready.getText().toString();
																							download_ready_desc_0 = download_ready_desc.getText().toString();
																							downloading_file_0 = downloading_file.getText().toString();
																							download_success_0 = download_success.getText().toString();
																							installation_failed_0 = installation_failed.getText().toString();
																							installation_failed_desc_0 = installation_failed_desc.getText().toString();
																							installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																							installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																							select_language.setSelection((int)(20));
																						}
																						else {
																							if (LANGUAGE.getString("LANGUAGE", "").equals("21")) {
																								sub_text_installed.setText(R.string.installed_21);
																								main_title.setText(R.string.main_title_21);
																								about_title.setText(R.string.about_title_21);
																								settings_title.setText(R.string.settings_title_21);
																								experiment_title.setText(R.string.experimental_title_21);
																								sub_title.setText(R.string.about_sub_21);
																								sub_text_1.setText(R.string.latest_21);
																								sub_text_2.setText(R.string.latest_21);
																								sub_text_3.setText(R.string.latest_21);
																								versions_1.setText(R.string.versions_21);
																								versions_2.setText(R.string.versions_21);
																								versions_3.setText(R.string.versions_21);
																								title_sub.setText(R.string.manager_tools_21);
																								source.setText(R.string.source_21);
																								support.setText(R.string.support_21);
																								donate.setText(R.string.donate_21);
																								discord.setText(R.string.discord_21);
																								about.setText(R.string.about_21);
																								website.setText(R.string.website_21);
																								reddit.setText(R.string.reddit_21);
																								faq.setText(R.string.faq_21);
																								theme.setText(R.string.show_themes_21);
																								language.setText(R.string.language_21);
																								download_update.setText(R.string.download_update_21);
																								install_now.setText(R.string.install_now_21);
																								install_update.setText(R.string.install_update_21);
																								uninstall_patched.setText(R.string.uninstall_patched_21);
																								open_settings.setText(R.string.open_settings_21);
																								open_patched.setText(R.string.open_patched_21);
																								lite.setText(R.string.lite_21);
																								cloned.setText(R.string.cloned_21);
																								spap.setText(R.string.spap_21);
																								mirror.setText(R.string.mirror_21);
																								download.setText(R.string.download_21);
																								cancel.setText(R.string.cancel_21);
																								later.setText(R.string.later_21);
																								go_back.setText(R.string.go_back_21);
																								not_now.setText(R.string.not_now_21);
																								close.setText(R.string.close_21);
																								continue_1.setText(R.string.continue_1_21);
																								install.setText(R.string.install_21);
																								uninstall.setText(R.string.uninstall_21);
																								ignore.setText(R.string.ignore_21);
																								delete.setText(R.string.delete_21);
																								thanks.setText(R.string.thanks_21);
																								new_update.setText(R.string.new_update_21);
																								changelogs.setText(R.string.changelogs_21);
																								reboot.setText(R.string.reboot_21);
																								reset_preferences.setText(R.string.reset_preferences_21);
																								list_auto_refresh.setText(R.string.list_auto_refresh_21);
																								list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_21);
																								force_auto_install.setText(R.string.force_auto_install_21);
																								force_auto_install_info.setText(R.string.force_auto_install_desc_21);
																								apk_location.setText(R.string.apk_location_21);
																								apk_location_info.setText(R.string.apk_location_desc_21);
																								clear_directory_folders.setText(R.string.clear_directory_folders_21);
																								clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_21);
																								cloned_version.setText(R.string.cloned_version_21);
																								cloned_version_info.setText(R.string.cloned_version_desc_21);
																								experiment_version.setText(R.string.experimental_version_21);
																								experiment_version_info.setText(R.string.experimental_version_desc_21);
																								disable_reward_ad.setText(R.string.disable_rewarded_ads_21);
																								disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_21);
																								show_support.setText(R.string.show_support_21);
																								show_support_desc.setText(R.string.show_support_desc_21);
																								maintenance.setText(R.string.maintenance_21);
																								maintenance_desc.setText(R.string.maintenance_desc_21);
																								xmanager_dev.setText(R.string.xmanager_dev_21);
																								patched_devs.setText(R.string.patched_devs_21);
																								support_team.setText(R.string.support_team_21);
																								manager_testers.setText(R.string.manager_testers_21);
																								manager_hosting.setText(R.string.manager_hosting_21);
																								mobilism_team.setText(R.string.mobilism_team_21);
																								forum_team.setText(R.string.forum_team_21);
																								contributors.setText(R.string.contributors_21);
																								download_selected.setText(R.string.download_selected_21);
																								download_ready.setText(R.string.download_ready_21);
																								download_ready_desc.setText(R.string.download_ready_desc_21);
																								downloading_file.setText(R.string.downloading_file_21);
																								download_success.setText(R.string.download_success_21);
																								installation_failed.setText(R.string.installation_failed_21);
																								installation_failed_desc.setText(R.string.installation_failed_desc_21);
																								installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_21);
																								installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_21);
																								existing_patched.setText(R.string.existing_patched_21);
																								existing_patched_desc.setText(R.string.existing_patched_desc_21);
																								lite_0 = lite.getText().toString();
																								download_0 = download.getText().toString();
																								continue_0 = continue_1.getText().toString();
																								cancel_0 = cancel.getText().toString();
																								later_0 = later.getText().toString();
																								mirror_0 = mirror.getText().toString();
																								install_now_0 = install_now.getText().toString();
																								go_back_0 = go_back.getText().toString();
																								install_update_0 = install_update.getText().toString();
																								close_0 = close.getText().toString();
																								uninstall_0 = uninstall.getText().toString();
																								existing_patched_0 = existing_patched.getText().toString();
																								existing_patched_desc_0 = existing_patched_desc.getText().toString();
																								download_selected_0 = download_selected.getText().toString();
																								download_ready_0 = download_ready.getText().toString();
																								download_ready_desc_0 = download_ready_desc.getText().toString();
																								downloading_file_0 = downloading_file.getText().toString();
																								download_success_0 = download_success.getText().toString();
																								installation_failed_0 = installation_failed.getText().toString();
																								installation_failed_desc_0 = installation_failed_desc.getText().toString();
																								installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																								installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																								select_language.setSelection((int)(21));
																							}
																							else {
																								if (LANGUAGE.getString("LANGUAGE", "").equals("22")) {
																									sub_text_installed.setText(R.string.installed_22);
																									main_title.setText(R.string.main_title_22);
																									about_title.setText(R.string.about_title_22);
																									settings_title.setText(R.string.settings_title_22);
																									experiment_title.setText(R.string.experimental_title_22);
																									sub_title.setText(R.string.about_sub_22);
																									sub_text_1.setText(R.string.latest_22);
																									sub_text_2.setText(R.string.latest_22);
																									sub_text_3.setText(R.string.latest_22);
																									versions_1.setText(R.string.versions_22);
																									versions_2.setText(R.string.versions_22);
																									versions_3.setText(R.string.versions_22);
																									title_sub.setText(R.string.manager_tools_22);
																									source.setText(R.string.source_22);
																									support.setText(R.string.support_22);
																									donate.setText(R.string.donate_22);
																									discord.setText(R.string.discord_22);
																									about.setText(R.string.about_22);
																									website.setText(R.string.website_22);
																									reddit.setText(R.string.reddit_22);
																									faq.setText(R.string.faq_22);
																									theme.setText(R.string.show_themes_22);
																									language.setText(R.string.language_22);
																									download_update.setText(R.string.download_update_22);
																									install_now.setText(R.string.install_now_22);
																									install_update.setText(R.string.install_update_22);
																									uninstall_patched.setText(R.string.uninstall_patched_22);
																									open_settings.setText(R.string.open_settings_22);
																									open_patched.setText(R.string.open_patched_22);
																									lite.setText(R.string.lite_22);
																									cloned.setText(R.string.cloned_22);
																									spap.setText(R.string.spap_22);
																									mirror.setText(R.string.mirror_22);
																									download.setText(R.string.download_22);
																									cancel.setText(R.string.cancel_22);
																									later.setText(R.string.later_22);
																									go_back.setText(R.string.go_back_22);
																									not_now.setText(R.string.not_now_22);
																									close.setText(R.string.close_22);
																									continue_1.setText(R.string.continue_1_22);
																									install.setText(R.string.install_22);
																									uninstall.setText(R.string.uninstall_22);
																									ignore.setText(R.string.ignore_22);
																									delete.setText(R.string.delete_22);
																									thanks.setText(R.string.thanks_22);
																									new_update.setText(R.string.new_update_22);
																									changelogs.setText(R.string.changelogs_22);
																									reboot.setText(R.string.reboot_22);
																									reset_preferences.setText(R.string.reset_preferences_22);
																									list_auto_refresh.setText(R.string.list_auto_refresh_22);
																									list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_22);
																									force_auto_install.setText(R.string.force_auto_install_22);
																									force_auto_install_info.setText(R.string.force_auto_install_desc_22);
																									apk_location.setText(R.string.apk_location_22);
																									apk_location_info.setText(R.string.apk_location_desc_22);
																									clear_directory_folders.setText(R.string.clear_directory_folders_22);
																									clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_22);
																									cloned_version.setText(R.string.cloned_version_22);
																									cloned_version_info.setText(R.string.cloned_version_desc_22);
																									experiment_version.setText(R.string.experimental_version_22);
																									experiment_version_info.setText(R.string.experimental_version_desc_22);
																									disable_reward_ad.setText(R.string.disable_rewarded_ads_22);
																									disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_22);
																									show_support.setText(R.string.show_support_22);
																									show_support_desc.setText(R.string.show_support_desc_22);
																									maintenance.setText(R.string.maintenance_22);
																									maintenance_desc.setText(R.string.maintenance_desc_22);
																									xmanager_dev.setText(R.string.xmanager_dev_22);
																									patched_devs.setText(R.string.patched_devs_22);
																									support_team.setText(R.string.support_team_22);
																									manager_testers.setText(R.string.manager_testers_22);
																									manager_hosting.setText(R.string.manager_hosting_22);
																									mobilism_team.setText(R.string.mobilism_team_22);
																									forum_team.setText(R.string.forum_team_22);
																									contributors.setText(R.string.contributors_22);
																									download_selected.setText(R.string.download_selected_22);
																									download_ready.setText(R.string.download_ready_22);
																									download_ready_desc.setText(R.string.download_ready_desc_22);
																									downloading_file.setText(R.string.downloading_file_22);
																									download_success.setText(R.string.download_success_22);
																									installation_failed.setText(R.string.installation_failed_22);
																									installation_failed_desc.setText(R.string.installation_failed_desc_22);
																									installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_22);
																									installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_22);
																									existing_patched.setText(R.string.existing_patched_22);
																									existing_patched_desc.setText(R.string.existing_patched_desc_22);
																									lite_0 = lite.getText().toString();
																									download_0 = download.getText().toString();
																									continue_0 = continue_1.getText().toString();
																									cancel_0 = cancel.getText().toString();
																									later_0 = later.getText().toString();
																									mirror_0 = mirror.getText().toString();
																									install_now_0 = install_now.getText().toString();
																									go_back_0 = go_back.getText().toString();
																									install_update_0 = install_update.getText().toString();
																									close_0 = close.getText().toString();
																									uninstall_0 = uninstall.getText().toString();
																									existing_patched_0 = existing_patched.getText().toString();
																									existing_patched_desc_0 = existing_patched_desc.getText().toString();
																									download_selected_0 = download_selected.getText().toString();
																									download_ready_0 = download_ready.getText().toString();
																									download_ready_desc_0 = download_ready_desc.getText().toString();
																									downloading_file_0 = downloading_file.getText().toString();
																									download_success_0 = download_success.getText().toString();
																									installation_failed_0 = installation_failed.getText().toString();
																									installation_failed_desc_0 = installation_failed_desc.getText().toString();
																									installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																									installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																									select_language.setSelection((int)(22));
																								}
																								else {
																									if (LANGUAGE.getString("LANGUAGE", "").equals("23")) {
																										sub_text_installed.setText(R.string.installed_23);
																										main_title.setText(R.string.main_title_23);
																										about_title.setText(R.string.about_title_23);
																										settings_title.setText(R.string.settings_title_23);
																										experiment_title.setText(R.string.experimental_title_23);
																										sub_title.setText(R.string.about_sub_23);
																										sub_text_1.setText(R.string.latest_23);
																										sub_text_2.setText(R.string.latest_23);
																										sub_text_3.setText(R.string.latest_23);
																										versions_1.setText(R.string.versions_23);
																										versions_2.setText(R.string.versions_23);
																										versions_3.setText(R.string.versions_23);
																										title_sub.setText(R.string.manager_tools_23);
																										source.setText(R.string.source_23);
																										support.setText(R.string.support_23);
																										donate.setText(R.string.donate_23);
																										discord.setText(R.string.discord_23);
																										about.setText(R.string.about_23);
																										website.setText(R.string.website_23);
																										reddit.setText(R.string.reddit_23);
																										faq.setText(R.string.faq_23);
																										theme.setText(R.string.show_themes_23);
																										language.setText(R.string.language_23);
																										download_update.setText(R.string.download_update_23);
																										install_now.setText(R.string.install_now_23);
																										install_update.setText(R.string.install_update_23);
																										uninstall_patched.setText(R.string.uninstall_patched_23);
																										open_settings.setText(R.string.open_settings_23);
																										open_patched.setText(R.string.open_patched_23);
																										lite.setText(R.string.lite_23);
																										cloned.setText(R.string.cloned_23);
																										spap.setText(R.string.spap_23);
																										mirror.setText(R.string.mirror_23);
																										download.setText(R.string.download_23);
																										cancel.setText(R.string.cancel_23);
																										later.setText(R.string.later_23);
																										go_back.setText(R.string.go_back_23);
																										not_now.setText(R.string.not_now_23);
																										close.setText(R.string.close_23);
																										continue_1.setText(R.string.continue_1_23);
																										install.setText(R.string.install_23);
																										uninstall.setText(R.string.uninstall_23);
																										ignore.setText(R.string.ignore_23);
																										delete.setText(R.string.delete_23);
																										thanks.setText(R.string.thanks_23);
																										new_update.setText(R.string.new_update_23);
																										changelogs.setText(R.string.changelogs_23);
																										reboot.setText(R.string.reboot_23);
																										reset_preferences.setText(R.string.reset_preferences_23);
																										list_auto_refresh.setText(R.string.list_auto_refresh_23);
																										list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_23);
																										force_auto_install.setText(R.string.force_auto_install_23);
																										force_auto_install_info.setText(R.string.force_auto_install_desc_23);
																										apk_location.setText(R.string.apk_location_23);
																										apk_location_info.setText(R.string.apk_location_desc_23);
																										clear_directory_folders.setText(R.string.clear_directory_folders_23);
																										clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_23);
																										cloned_version.setText(R.string.cloned_version_23);
																										cloned_version_info.setText(R.string.cloned_version_desc_23);
																										experiment_version.setText(R.string.experimental_version_23);
																										experiment_version_info.setText(R.string.experimental_version_desc_23);
																										disable_reward_ad.setText(R.string.disable_rewarded_ads_23);
																										disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_23);
																										show_support.setText(R.string.show_support_23);
																										show_support_desc.setText(R.string.show_support_desc_23);
																										maintenance.setText(R.string.maintenance_23);
																										maintenance_desc.setText(R.string.maintenance_desc_23);
																										xmanager_dev.setText(R.string.xmanager_dev_23);
																										patched_devs.setText(R.string.patched_devs_23);
																										support_team.setText(R.string.support_team_23);
																										manager_testers.setText(R.string.manager_testers_23);
																										manager_hosting.setText(R.string.manager_hosting_23);
																										mobilism_team.setText(R.string.mobilism_team_23);
																										forum_team.setText(R.string.forum_team_23);
																										contributors.setText(R.string.contributors_23);
																										download_selected.setText(R.string.download_selected_23);
																										download_ready.setText(R.string.download_ready_23);
																										download_ready_desc.setText(R.string.download_ready_desc_23);
																										downloading_file.setText(R.string.downloading_file_23);
																										download_success.setText(R.string.download_success_23);
																										installation_failed.setText(R.string.installation_failed_23);
																										installation_failed_desc.setText(R.string.installation_failed_desc_23);
																										installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_23);
																										installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_23);
																										existing_patched.setText(R.string.existing_patched_23);
																										existing_patched_desc.setText(R.string.existing_patched_desc_23);
																										lite_0 = lite.getText().toString();
																										download_0 = download.getText().toString();
																										continue_0 = continue_1.getText().toString();
																										cancel_0 = cancel.getText().toString();
																										later_0 = later.getText().toString();
																										mirror_0 = mirror.getText().toString();
																										install_now_0 = install_now.getText().toString();
																										go_back_0 = go_back.getText().toString();
																										install_update_0 = install_update.getText().toString();
																										close_0 = close.getText().toString();
																										uninstall_0 = uninstall.getText().toString();
																										existing_patched_0 = existing_patched.getText().toString();
																										existing_patched_desc_0 = existing_patched_desc.getText().toString();
																										download_selected_0 = download_selected.getText().toString();
																										download_ready_0 = download_ready.getText().toString();
																										download_ready_desc_0 = download_ready_desc.getText().toString();
																										downloading_file_0 = downloading_file.getText().toString();
																										download_success_0 = download_success.getText().toString();
																										installation_failed_0 = installation_failed.getText().toString();
																										installation_failed_desc_0 = installation_failed_desc.getText().toString();
																										installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																										installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																										select_language.setSelection((int)(23));
																									}
																									else {
																										if (LANGUAGE.getString("LANGUAGE", "").equals("24")) {
																											sub_text_installed.setText(R.string.installed_24);
																											main_title.setText(R.string.main_title_24);
																											about_title.setText(R.string.about_title_24);
																											settings_title.setText(R.string.settings_title_24);
																											experiment_title.setText(R.string.experimental_title_24);
																											sub_title.setText(R.string.about_sub_24);
																											sub_text_1.setText(R.string.latest_24);
																											sub_text_2.setText(R.string.latest_24);
																											sub_text_3.setText(R.string.latest_24);
																											versions_1.setText(R.string.versions_24);
																											versions_2.setText(R.string.versions_24);
																											versions_3.setText(R.string.versions_24);
																											title_sub.setText(R.string.manager_tools_24);
																											source.setText(R.string.source_24);
																											support.setText(R.string.support_24);
																											donate.setText(R.string.donate_24);
																											discord.setText(R.string.discord_24);
																											about.setText(R.string.about_24);
																											website.setText(R.string.website_24);
																											reddit.setText(R.string.reddit_24);
																											faq.setText(R.string.faq_24);
																											theme.setText(R.string.show_themes_24);
																											language.setText(R.string.language_24);
																											download_update.setText(R.string.download_update_24);
																											install_now.setText(R.string.install_now_24);
																											install_update.setText(R.string.install_update_24);
																											uninstall_patched.setText(R.string.uninstall_patched_24);
																											open_settings.setText(R.string.open_settings_24);
																											open_patched.setText(R.string.open_patched_24);
																											lite.setText(R.string.lite_24);
																											cloned.setText(R.string.cloned_24);
																											spap.setText(R.string.spap_24);
																											mirror.setText(R.string.mirror_24);
																											download.setText(R.string.download_24);
																											cancel.setText(R.string.cancel_24);
																											later.setText(R.string.later_24);
																											go_back.setText(R.string.go_back_24);
																											not_now.setText(R.string.not_now_24);
																											close.setText(R.string.close_24);
																											continue_1.setText(R.string.continue_1_24);
																											install.setText(R.string.install_24);
																											uninstall.setText(R.string.uninstall_24);
																											ignore.setText(R.string.ignore_24);
																											delete.setText(R.string.delete_24);
																											thanks.setText(R.string.thanks_24);
																											new_update.setText(R.string.new_update_24);
																											changelogs.setText(R.string.changelogs_24);
																											reboot.setText(R.string.reboot_24);
																											reset_preferences.setText(R.string.reset_preferences_24);
																											list_auto_refresh.setText(R.string.list_auto_refresh_24);
																											list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_24);
																											force_auto_install.setText(R.string.force_auto_install_24);
																											force_auto_install_info.setText(R.string.force_auto_install_desc_24);
																											apk_location.setText(R.string.apk_location_24);
																											apk_location_info.setText(R.string.apk_location_desc_24);
																											clear_directory_folders.setText(R.string.clear_directory_folders_24);
																											clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_24);
																											cloned_version.setText(R.string.cloned_version_24);
																											cloned_version_info.setText(R.string.cloned_version_desc_24);
																											experiment_version.setText(R.string.experimental_version_24);
																											experiment_version_info.setText(R.string.experimental_version_desc_24);
																											disable_reward_ad.setText(R.string.disable_rewarded_ads_24);
																											disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_24);
																											show_support.setText(R.string.show_support_24);
																											show_support_desc.setText(R.string.show_support_desc_24);
																											maintenance.setText(R.string.maintenance_24);
																											maintenance_desc.setText(R.string.maintenance_desc_24);
																											xmanager_dev.setText(R.string.xmanager_dev_24);
																											patched_devs.setText(R.string.patched_devs_24);
																											support_team.setText(R.string.support_team_24);
																											manager_testers.setText(R.string.manager_testers_24);
																											manager_hosting.setText(R.string.manager_hosting_24);
																											mobilism_team.setText(R.string.mobilism_team_24);
																											forum_team.setText(R.string.forum_team_24);
																											contributors.setText(R.string.contributors_24);
																											download_selected.setText(R.string.download_selected_24);
																											download_ready.setText(R.string.download_ready_24);
																											download_ready_desc.setText(R.string.download_ready_desc_24);
																											downloading_file.setText(R.string.downloading_file_24);
																											download_success.setText(R.string.download_success_24);
																											installation_failed.setText(R.string.installation_failed_24);
																											installation_failed_desc.setText(R.string.installation_failed_desc_24);
																											installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_24);
																											installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_24);
																											existing_patched.setText(R.string.existing_patched_24);
																											existing_patched_desc.setText(R.string.existing_patched_desc_24);
																											lite_0 = lite.getText().toString();
																											download_0 = download.getText().toString();
																											continue_0 = continue_1.getText().toString();
																											cancel_0 = cancel.getText().toString();
																											later_0 = later.getText().toString();
																											mirror_0 = mirror.getText().toString();
																											install_now_0 = install_now.getText().toString();
																											go_back_0 = go_back.getText().toString();
																											install_update_0 = install_update.getText().toString();
																											close_0 = close.getText().toString();
																											uninstall_0 = uninstall.getText().toString();
																											existing_patched_0 = existing_patched.getText().toString();
																											existing_patched_desc_0 = existing_patched_desc.getText().toString();
																											download_selected_0 = download_selected.getText().toString();
																											download_ready_0 = download_ready.getText().toString();
																											download_ready_desc_0 = download_ready_desc.getText().toString();
																											downloading_file_0 = downloading_file.getText().toString();
																											download_success_0 = download_success.getText().toString();
																											installation_failed_0 = installation_failed.getText().toString();
																											installation_failed_desc_0 = installation_failed_desc.getText().toString();
																											installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																											installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																											select_language.setSelection((int)(24));
																										}
																										else {
																											if (LANGUAGE.getString("LANGUAGE", "").equals("25")) {
																												sub_text_installed.setText(R.string.installed_25);
																												main_title.setText(R.string.main_title_25);
																												about_title.setText(R.string.about_title_25);
																												settings_title.setText(R.string.settings_title_25);
																												experiment_title.setText(R.string.experimental_title_25);
																												sub_title.setText(R.string.about_sub_25);
																												sub_text_1.setText(R.string.latest_25);
																												sub_text_2.setText(R.string.latest_25);
																												sub_text_3.setText(R.string.latest_25);
																												versions_1.setText(R.string.versions_25);
																												versions_2.setText(R.string.versions_25);
																												versions_3.setText(R.string.versions_25);
																												title_sub.setText(R.string.manager_tools_25);
																												source.setText(R.string.source_25);
																												support.setText(R.string.support_25);
																												donate.setText(R.string.donate_25);
																												discord.setText(R.string.discord_25);
																												about.setText(R.string.about_25);
																												website.setText(R.string.website_25);
																												reddit.setText(R.string.reddit_25);
																												faq.setText(R.string.faq_25);
																												theme.setText(R.string.show_themes_25);
																												language.setText(R.string.language_25);
																												download_update.setText(R.string.download_update_25);
																												install_now.setText(R.string.install_now_25);
																												install_update.setText(R.string.install_update_25);
																												uninstall_patched.setText(R.string.uninstall_patched_25);
																												open_settings.setText(R.string.open_settings_25);
																												open_patched.setText(R.string.open_patched_25);
																												lite.setText(R.string.lite_25);
																												cloned.setText(R.string.cloned_25);
																												spap.setText(R.string.spap_25);
																												mirror.setText(R.string.mirror_25);
																												download.setText(R.string.download_25);
																												cancel.setText(R.string.cancel_25);
																												later.setText(R.string.later_25);
																												go_back.setText(R.string.go_back_25);
																												not_now.setText(R.string.not_now_25);
																												close.setText(R.string.close_25);
																												continue_1.setText(R.string.continue_1_25);
																												install.setText(R.string.install_25);
																												uninstall.setText(R.string.uninstall_25);
																												ignore.setText(R.string.ignore_25);
																												delete.setText(R.string.delete_25);
																												thanks.setText(R.string.thanks_25);
																												new_update.setText(R.string.new_update_25);
																												changelogs.setText(R.string.changelogs_25);
																												reboot.setText(R.string.reboot_25);
																												reset_preferences.setText(R.string.reset_preferences_25);
																												list_auto_refresh.setText(R.string.list_auto_refresh_25);
																												list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_25);
																												force_auto_install.setText(R.string.force_auto_install_25);
																												force_auto_install_info.setText(R.string.force_auto_install_desc_25);
																												apk_location.setText(R.string.apk_location_25);
																												apk_location_info.setText(R.string.apk_location_desc_25);
																												clear_directory_folders.setText(R.string.clear_directory_folders_25);
																												clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_25);
																												cloned_version.setText(R.string.cloned_version_25);
																												cloned_version_info.setText(R.string.cloned_version_desc_25);
																												experiment_version.setText(R.string.experimental_version_25);
																												experiment_version_info.setText(R.string.experimental_version_desc_25);
																												disable_reward_ad.setText(R.string.disable_rewarded_ads_25);
																												disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_25);
																												show_support.setText(R.string.show_support_25);
																												show_support_desc.setText(R.string.show_support_desc_25);
																												maintenance.setText(R.string.maintenance_25);
																												maintenance_desc.setText(R.string.maintenance_desc_25);
																												xmanager_dev.setText(R.string.xmanager_dev_25);
																												patched_devs.setText(R.string.patched_devs_25);
																												support_team.setText(R.string.support_team_25);
																												manager_testers.setText(R.string.manager_testers_25);
																												manager_hosting.setText(R.string.manager_hosting_25);
																												mobilism_team.setText(R.string.mobilism_team_25);
																												forum_team.setText(R.string.forum_team_25);
																												contributors.setText(R.string.contributors_25);
																												download_selected.setText(R.string.download_selected_25);
																												download_ready.setText(R.string.download_ready_25);
																												download_ready_desc.setText(R.string.download_ready_desc_25);
																												downloading_file.setText(R.string.downloading_file_25);
																												download_success.setText(R.string.download_success_25);
																												installation_failed.setText(R.string.installation_failed_25);
																												installation_failed_desc.setText(R.string.installation_failed_desc_25);
																												installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_25);
																												installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_25);
																												existing_patched.setText(R.string.existing_patched_25);
																												existing_patched_desc.setText(R.string.existing_patched_desc_25);
																												lite_0 = lite.getText().toString();
																												download_0 = download.getText().toString();
																												continue_0 = continue_1.getText().toString();
																												cancel_0 = cancel.getText().toString();
																												later_0 = later.getText().toString();
																												mirror_0 = mirror.getText().toString();
																												install_now_0 = install_now.getText().toString();
																												go_back_0 = go_back.getText().toString();
																												install_update_0 = install_update.getText().toString();
																												close_0 = close.getText().toString();
																												uninstall_0 = uninstall.getText().toString();
																												existing_patched_0 = existing_patched.getText().toString();
																												existing_patched_desc_0 = existing_patched_desc.getText().toString();
																												download_selected_0 = download_selected.getText().toString();
																												download_ready_0 = download_ready.getText().toString();
																												download_ready_desc_0 = download_ready_desc.getText().toString();
																												downloading_file_0 = downloading_file.getText().toString();
																												download_success_0 = download_success.getText().toString();
																												installation_failed_0 = installation_failed.getText().toString();
																												installation_failed_desc_0 = installation_failed_desc.getText().toString();
																												installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																												installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																												select_language.setSelection((int)(25));
																											}
																											else {
																												if (LANGUAGE.getString("LANGUAGE", "").equals("26")) {
																													sub_text_installed.setText(R.string.installed_26);
																													main_title.setText(R.string.main_title_26);
																													about_title.setText(R.string.about_title_26);
																													settings_title.setText(R.string.settings_title_26);
																													experiment_title.setText(R.string.experimental_title_26);
																													sub_title.setText(R.string.about_sub_26);
																													sub_text_1.setText(R.string.latest_26);
																													sub_text_2.setText(R.string.latest_26);
																													sub_text_3.setText(R.string.latest_26);
																													versions_1.setText(R.string.versions_26);
																													versions_2.setText(R.string.versions_26);
																													versions_3.setText(R.string.versions_26);
																													title_sub.setText(R.string.manager_tools_26);
																													source.setText(R.string.source_26);
																													support.setText(R.string.support_26);
																													donate.setText(R.string.donate_26);
																													discord.setText(R.string.discord_26);
																													about.setText(R.string.about_26);
																													website.setText(R.string.website_26);
																													reddit.setText(R.string.reddit_26);
																													faq.setText(R.string.faq_26);
																													theme.setText(R.string.show_themes_26);
																													language.setText(R.string.language_26);
																													download_update.setText(R.string.download_update_26);
																													install_now.setText(R.string.install_now_26);
																													install_update.setText(R.string.install_update_26);
																													uninstall_patched.setText(R.string.uninstall_patched_26);
																													open_settings.setText(R.string.open_settings_26);
																													open_patched.setText(R.string.open_patched_26);
																													lite.setText(R.string.lite_26);
																													cloned.setText(R.string.cloned_26);
																													spap.setText(R.string.spap_26);
																													mirror.setText(R.string.mirror_26);
																													download.setText(R.string.download_26);
																													cancel.setText(R.string.cancel_26);
																													later.setText(R.string.later_26);
																													go_back.setText(R.string.go_back_26);
																													not_now.setText(R.string.not_now_26);
																													close.setText(R.string.close_26);
																													continue_1.setText(R.string.continue_1_26);
																													install.setText(R.string.install_26);
																													uninstall.setText(R.string.uninstall_26);
																													ignore.setText(R.string.ignore_26);
																													delete.setText(R.string.delete_26);
																													thanks.setText(R.string.thanks_26);
																													new_update.setText(R.string.new_update_26);
																													changelogs.setText(R.string.changelogs_26);
																													reboot.setText(R.string.reboot_26);
																													reset_preferences.setText(R.string.reset_preferences_26);
																													list_auto_refresh.setText(R.string.list_auto_refresh_26);
																													list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_26);
																													force_auto_install.setText(R.string.force_auto_install_26);
																													force_auto_install_info.setText(R.string.force_auto_install_desc_26);
																													apk_location.setText(R.string.apk_location_26);
																													apk_location_info.setText(R.string.apk_location_desc_26);
																													clear_directory_folders.setText(R.string.clear_directory_folders_26);
																													clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_26);
																													cloned_version.setText(R.string.cloned_version_26);
																													cloned_version_info.setText(R.string.cloned_version_desc_26);
																													experiment_version.setText(R.string.experimental_version_26);
																													experiment_version_info.setText(R.string.experimental_version_desc_26);
																													disable_reward_ad.setText(R.string.disable_rewarded_ads_26);
																													disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_26);
																													show_support.setText(R.string.show_support_26);
																													show_support_desc.setText(R.string.show_support_desc_26);
																													maintenance.setText(R.string.maintenance_26);
																													maintenance_desc.setText(R.string.maintenance_desc_26);
																													xmanager_dev.setText(R.string.xmanager_dev_26);
																													patched_devs.setText(R.string.patched_devs_26);
																													support_team.setText(R.string.support_team_26);
																													manager_testers.setText(R.string.manager_testers_26);
																													manager_hosting.setText(R.string.manager_hosting_26);
																													mobilism_team.setText(R.string.mobilism_team_26);
																													forum_team.setText(R.string.forum_team_26);
																													contributors.setText(R.string.contributors_26);
																													download_selected.setText(R.string.download_selected_26);
																													download_ready.setText(R.string.download_ready_26);
																													download_ready_desc.setText(R.string.download_ready_desc_26);
																													downloading_file.setText(R.string.downloading_file_26);
																													download_success.setText(R.string.download_success_26);
																													installation_failed.setText(R.string.installation_failed_26);
																													installation_failed_desc.setText(R.string.installation_failed_desc_26);
																													installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_26);
																													installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_26);
																													existing_patched.setText(R.string.existing_patched_26);
																													existing_patched_desc.setText(R.string.existing_patched_desc_26);
																													lite_0 = lite.getText().toString();
																													download_0 = download.getText().toString();
																													continue_0 = continue_1.getText().toString();
																													cancel_0 = cancel.getText().toString();
																													later_0 = later.getText().toString();
																													mirror_0 = mirror.getText().toString();
																													install_now_0 = install_now.getText().toString();
																													go_back_0 = go_back.getText().toString();
																													install_update_0 = install_update.getText().toString();
																													close_0 = close.getText().toString();
																													uninstall_0 = uninstall.getText().toString();
																													existing_patched_0 = existing_patched.getText().toString();
																													existing_patched_desc_0 = existing_patched_desc.getText().toString();
																													download_selected_0 = download_selected.getText().toString();
																													download_ready_0 = download_ready.getText().toString();
																													download_ready_desc_0 = download_ready_desc.getText().toString();
																													downloading_file_0 = downloading_file.getText().toString();
																													download_success_0 = download_success.getText().toString();
																													installation_failed_0 = installation_failed.getText().toString();
																													installation_failed_desc_0 = installation_failed_desc.getText().toString();
																													installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																													installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																													select_language.setSelection((int)(26));
																												}
																												else {
																													if (LANGUAGE.getString("LANGUAGE", "").equals("27")) {
																														sub_text_installed.setText(R.string.installed_27);
																														main_title.setText(R.string.main_title_27);
																														about_title.setText(R.string.about_title_27);
																														settings_title.setText(R.string.settings_title_27);
																														experiment_title.setText(R.string.experimental_title_27);
																														sub_title.setText(R.string.about_sub_27);
																														sub_text_1.setText(R.string.latest_27);
																														sub_text_2.setText(R.string.latest_27);
																														sub_text_3.setText(R.string.latest_27);
																														versions_1.setText(R.string.versions_27);
																														versions_2.setText(R.string.versions_27);
																														versions_3.setText(R.string.versions_27);
																														title_sub.setText(R.string.manager_tools_27);
																														source.setText(R.string.source_27);
																														support.setText(R.string.support_27);
																														donate.setText(R.string.donate_27);
																														discord.setText(R.string.discord_27);
																														about.setText(R.string.about_27);
																														website.setText(R.string.website_27);
																														reddit.setText(R.string.reddit_27);
																														faq.setText(R.string.faq_27);
																														theme.setText(R.string.show_themes_27);
																														language.setText(R.string.language_27);
																														download_update.setText(R.string.download_update_27);
																														install_now.setText(R.string.install_now_27);
																														install_update.setText(R.string.install_update_27);
																														uninstall_patched.setText(R.string.uninstall_patched_27);
																														open_settings.setText(R.string.open_settings_27);
																														open_patched.setText(R.string.open_patched_27);
																														lite.setText(R.string.lite_27);
																														cloned.setText(R.string.cloned_27);
																														spap.setText(R.string.spap_27);
																														mirror.setText(R.string.mirror_27);
																														download.setText(R.string.download_27);
																														cancel.setText(R.string.cancel_27);
																														later.setText(R.string.later_27);
																														go_back.setText(R.string.go_back_27);
																														not_now.setText(R.string.not_now_27);
																														close.setText(R.string.close_27);
																														continue_1.setText(R.string.continue_1_27);
																														install.setText(R.string.install_27);
																														uninstall.setText(R.string.uninstall_27);
																														ignore.setText(R.string.ignore_27);
																														delete.setText(R.string.delete_27);
																														thanks.setText(R.string.thanks_27);
																														new_update.setText(R.string.new_update_27);
																														changelogs.setText(R.string.changelogs_27);
																														reboot.setText(R.string.reboot_27);
																														reset_preferences.setText(R.string.reset_preferences_27);
																														list_auto_refresh.setText(R.string.list_auto_refresh_27);
																														list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_27);
																														force_auto_install.setText(R.string.force_auto_install_27);
																														force_auto_install_info.setText(R.string.force_auto_install_desc_27);
																														apk_location.setText(R.string.apk_location_27);
																														apk_location_info.setText(R.string.apk_location_desc_27);
																														clear_directory_folders.setText(R.string.clear_directory_folders_27);
																														clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_27);
																														cloned_version.setText(R.string.cloned_version_27);
																														cloned_version_info.setText(R.string.cloned_version_desc_27);
																														experiment_version.setText(R.string.experimental_version_27);
																														experiment_version_info.setText(R.string.experimental_version_desc_27);
																														disable_reward_ad.setText(R.string.disable_rewarded_ads_27);
																														disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_27);
																														show_support.setText(R.string.show_support_27);
																														show_support_desc.setText(R.string.show_support_desc_27);
																														maintenance.setText(R.string.maintenance_27);
																														maintenance_desc.setText(R.string.maintenance_desc_27);
																														xmanager_dev.setText(R.string.xmanager_dev_27);
																														patched_devs.setText(R.string.patched_devs_27);
																														support_team.setText(R.string.support_team_27);
																														manager_testers.setText(R.string.manager_testers_27);
																														manager_hosting.setText(R.string.manager_hosting_27);
																														mobilism_team.setText(R.string.mobilism_team_27);
																														forum_team.setText(R.string.forum_team_27);
																														contributors.setText(R.string.contributors_27);
																														download_selected.setText(R.string.download_selected_27);
																														download_ready.setText(R.string.download_ready_27);
																														download_ready_desc.setText(R.string.download_ready_desc_27);
																														downloading_file.setText(R.string.downloading_file_27);
																														download_success.setText(R.string.download_success_27);
																														installation_failed.setText(R.string.installation_failed_27);
																														installation_failed_desc.setText(R.string.installation_failed_desc_27);
																														installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_27);
																														installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_27);
																														existing_patched.setText(R.string.existing_patched_27);
																														existing_patched_desc.setText(R.string.existing_patched_desc_27);
																														lite_0 = lite.getText().toString();
																														download_0 = download.getText().toString();
																														continue_0 = continue_1.getText().toString();
																														cancel_0 = cancel.getText().toString();
																														later_0 = later.getText().toString();
																														mirror_0 = mirror.getText().toString();
																														install_now_0 = install_now.getText().toString();
																														go_back_0 = go_back.getText().toString();
																														install_update_0 = install_update.getText().toString();
																														close_0 = close.getText().toString();
																														uninstall_0 = uninstall.getText().toString();
																														existing_patched_0 = existing_patched.getText().toString();
																														existing_patched_desc_0 = existing_patched_desc.getText().toString();
																														download_selected_0 = download_selected.getText().toString();
																														download_ready_0 = download_ready.getText().toString();
																														download_ready_desc_0 = download_ready_desc.getText().toString();
																														downloading_file_0 = downloading_file.getText().toString();
																														download_success_0 = download_success.getText().toString();
																														installation_failed_0 = installation_failed.getText().toString();
																														installation_failed_desc_0 = installation_failed_desc.getText().toString();
																														installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																														installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																														select_language.setSelection((int)(27));
																													}
																													else {
																														if (LANGUAGE.getString("LANGUAGE", "").equals("28")) {
																															sub_text_installed.setText(R.string.installed_28);
																															main_title.setText(R.string.main_title_28);
																															about_title.setText(R.string.about_title_28);
																															settings_title.setText(R.string.settings_title_28);
																															experiment_title.setText(R.string.experimental_title_28);
																															sub_title.setText(R.string.about_sub_28);
																															sub_text_1.setText(R.string.latest_28);
																															sub_text_2.setText(R.string.latest_28);
																															sub_text_3.setText(R.string.latest_28);
																															versions_1.setText(R.string.versions_28);
																															versions_2.setText(R.string.versions_28);
																															versions_3.setText(R.string.versions_28);
																															title_sub.setText(R.string.manager_tools_28);
																															source.setText(R.string.source_28);
																															support.setText(R.string.support_28);
																															donate.setText(R.string.donate_28);
																															discord.setText(R.string.discord_28);
																															about.setText(R.string.about_28);
																															website.setText(R.string.website_28);
																															reddit.setText(R.string.reddit_28);
																															faq.setText(R.string.faq_28);
																															theme.setText(R.string.show_themes_28);
																															language.setText(R.string.language_28);
																															download_update.setText(R.string.download_update_28);
																															install_now.setText(R.string.install_now_28);
																															install_update.setText(R.string.install_update_28);
																															uninstall_patched.setText(R.string.uninstall_patched_28);
																															open_settings.setText(R.string.open_settings_28);
																															open_patched.setText(R.string.open_patched_28);
																															lite.setText(R.string.lite_28);
																															cloned.setText(R.string.cloned_28);
																															spap.setText(R.string.spap_28);
																															mirror.setText(R.string.mirror_28);
																															download.setText(R.string.download_28);
																															cancel.setText(R.string.cancel_28);
																															later.setText(R.string.later_28);
																															go_back.setText(R.string.go_back_28);
																															not_now.setText(R.string.not_now_28);
																															close.setText(R.string.close_28);
																															continue_1.setText(R.string.continue_1_28);
																															install.setText(R.string.install_28);
																															uninstall.setText(R.string.uninstall_28);
																															ignore.setText(R.string.ignore_28);
																															delete.setText(R.string.delete_28);
																															thanks.setText(R.string.thanks_28);
																															new_update.setText(R.string.new_update_28);
																															changelogs.setText(R.string.changelogs_28);
																															reboot.setText(R.string.reboot_28);
																															reset_preferences.setText(R.string.reset_preferences_28);
																															list_auto_refresh.setText(R.string.list_auto_refresh_28);
																															list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_28);
																															force_auto_install.setText(R.string.force_auto_install_28);
																															force_auto_install_info.setText(R.string.force_auto_install_desc_28);
																															apk_location.setText(R.string.apk_location_28);
																															apk_location_info.setText(R.string.apk_location_desc_28);
																															clear_directory_folders.setText(R.string.clear_directory_folders_28);
																															clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_28);
																															cloned_version.setText(R.string.cloned_version_28);
																															cloned_version_info.setText(R.string.cloned_version_desc_28);
																															experiment_version.setText(R.string.experimental_version_28);
																															experiment_version_info.setText(R.string.experimental_version_desc_28);
																															disable_reward_ad.setText(R.string.disable_rewarded_ads_28);
																															disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_28);
																															show_support.setText(R.string.show_support_28);
																															show_support_desc.setText(R.string.show_support_desc_28);
																															maintenance.setText(R.string.maintenance_28);
																															maintenance_desc.setText(R.string.maintenance_desc_28);
																															xmanager_dev.setText(R.string.xmanager_dev_28);
																															patched_devs.setText(R.string.patched_devs_28);
																															support_team.setText(R.string.support_team_28);
																															manager_testers.setText(R.string.manager_testers_28);
																															manager_hosting.setText(R.string.manager_hosting_28);
																															mobilism_team.setText(R.string.mobilism_team_28);
																															forum_team.setText(R.string.forum_team_28);
																															contributors.setText(R.string.contributors_28);
																															download_selected.setText(R.string.download_selected_28);
																															download_ready.setText(R.string.download_ready_28);
																															download_ready_desc.setText(R.string.download_ready_desc_28);
																															downloading_file.setText(R.string.downloading_file_28);
																															download_success.setText(R.string.download_success_28);
																															installation_failed.setText(R.string.installation_failed_28);
																															installation_failed_desc.setText(R.string.installation_failed_desc_28);
																															installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_28);
																															installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_28);
																															existing_patched.setText(R.string.existing_patched_28);
																															existing_patched_desc.setText(R.string.existing_patched_desc_28);
																															lite_0 = lite.getText().toString();
																															download_0 = download.getText().toString();
																															continue_0 = continue_1.getText().toString();
																															cancel_0 = cancel.getText().toString();
																															later_0 = later.getText().toString();
																															mirror_0 = mirror.getText().toString();
																															install_now_0 = install_now.getText().toString();
																															go_back_0 = go_back.getText().toString();
																															install_update_0 = install_update.getText().toString();
																															close_0 = close.getText().toString();
																															uninstall_0 = uninstall.getText().toString();
																															existing_patched_0 = existing_patched.getText().toString();
																															existing_patched_desc_0 = existing_patched_desc.getText().toString();
																															download_selected_0 = download_selected.getText().toString();
																															download_ready_0 = download_ready.getText().toString();
																															download_ready_desc_0 = download_ready_desc.getText().toString();
																															downloading_file_0 = downloading_file.getText().toString();
																															download_success_0 = download_success.getText().toString();
																															installation_failed_0 = installation_failed.getText().toString();
																															installation_failed_desc_0 = installation_failed_desc.getText().toString();
																															installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																															installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																															select_language.setSelection((int)(28));
																														}
																														else {
																															if (LANGUAGE.getString("LANGUAGE", "").equals("29")) {
																																sub_text_installed.setText(R.string.installed_29);
																																main_title.setText(R.string.main_title_29);
																																about_title.setText(R.string.about_title_29);
																																settings_title.setText(R.string.settings_title_29);
																																experiment_title.setText(R.string.experimental_title_29);
																																sub_title.setText(R.string.about_sub_29);
																																sub_text_1.setText(R.string.latest_29);
																																sub_text_2.setText(R.string.latest_29);
																																sub_text_3.setText(R.string.latest_29);
																																versions_1.setText(R.string.versions_29);
																																versions_2.setText(R.string.versions_29);
																																versions_3.setText(R.string.versions_29);
																																title_sub.setText(R.string.manager_tools_29);
																																source.setText(R.string.source_29);
																																support.setText(R.string.support_29);
																																donate.setText(R.string.donate_29);
																																discord.setText(R.string.discord_29);
																																about.setText(R.string.about_29);
																																website.setText(R.string.website_29);
																																reddit.setText(R.string.reddit_29);
																																faq.setText(R.string.faq_29);
																																theme.setText(R.string.show_themes_29);
																																language.setText(R.string.language_29);
																																download_update.setText(R.string.download_update_29);
																																install_now.setText(R.string.install_now_29);
																																install_update.setText(R.string.install_update_29);
																																uninstall_patched.setText(R.string.uninstall_patched_29);
																																open_settings.setText(R.string.open_settings_29);
																																open_patched.setText(R.string.open_patched_29);
																																lite.setText(R.string.lite_29);
																																cloned.setText(R.string.cloned_29);
																																spap.setText(R.string.spap_29);
																																mirror.setText(R.string.mirror_29);
																																download.setText(R.string.download_29);
																																cancel.setText(R.string.cancel_29);
																																later.setText(R.string.later_29);
																																go_back.setText(R.string.go_back_29);
																																not_now.setText(R.string.not_now_29);
																																close.setText(R.string.close_29);
																																continue_1.setText(R.string.continue_1_29);
																																install.setText(R.string.install_29);
																																uninstall.setText(R.string.uninstall_29);
																																ignore.setText(R.string.ignore_29);
																																delete.setText(R.string.delete_29);
																																thanks.setText(R.string.thanks_29);
																																new_update.setText(R.string.new_update_29);
																																changelogs.setText(R.string.changelogs_29);
																																reboot.setText(R.string.reboot_29);
																																reset_preferences.setText(R.string.reset_preferences_29);
																																list_auto_refresh.setText(R.string.list_auto_refresh_29);
																																list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_29);
																																force_auto_install.setText(R.string.force_auto_install_29);
																																force_auto_install_info.setText(R.string.force_auto_install_desc_29);
																																apk_location.setText(R.string.apk_location_29);
																																apk_location_info.setText(R.string.apk_location_desc_29);
																																clear_directory_folders.setText(R.string.clear_directory_folders_29);
																																clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_29);
																																cloned_version.setText(R.string.cloned_version_29);
																																cloned_version_info.setText(R.string.cloned_version_desc_29);
																																experiment_version.setText(R.string.experimental_version_29);
																																experiment_version_info.setText(R.string.experimental_version_desc_29);
																																disable_reward_ad.setText(R.string.disable_rewarded_ads_29);
																																disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_29);
																																show_support.setText(R.string.show_support_29);
																																show_support_desc.setText(R.string.show_support_desc_29);
																																maintenance.setText(R.string.maintenance_29);
																																maintenance_desc.setText(R.string.maintenance_desc_29);
																																xmanager_dev.setText(R.string.xmanager_dev_29);
																																patched_devs.setText(R.string.patched_devs_29);
																																support_team.setText(R.string.support_team_29);
																																manager_testers.setText(R.string.manager_testers_29);
																																manager_hosting.setText(R.string.manager_hosting_29);
																																mobilism_team.setText(R.string.mobilism_team_29);
																																forum_team.setText(R.string.forum_team_29);
																																contributors.setText(R.string.contributors_29);
																																download_selected.setText(R.string.download_selected_29);
																																download_ready.setText(R.string.download_ready_29);
																																download_ready_desc.setText(R.string.download_ready_desc_29);
																																downloading_file.setText(R.string.downloading_file_29);
																																download_success.setText(R.string.download_success_29);
																																installation_failed.setText(R.string.installation_failed_29);
																																installation_failed_desc.setText(R.string.installation_failed_desc_29);
																																installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_29);
																																installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_29);
																																existing_patched.setText(R.string.existing_patched_29);
																																existing_patched_desc.setText(R.string.existing_patched_desc_29);
																																lite_0 = lite.getText().toString();
																																download_0 = download.getText().toString();
																																continue_0 = continue_1.getText().toString();
																																cancel_0 = cancel.getText().toString();
																																later_0 = later.getText().toString();
																																mirror_0 = mirror.getText().toString();
																																install_now_0 = install_now.getText().toString();
																																go_back_0 = go_back.getText().toString();
																																install_update_0 = install_update.getText().toString();
																																close_0 = close.getText().toString();
																																uninstall_0 = uninstall.getText().toString();
																																existing_patched_0 = existing_patched.getText().toString();
																																existing_patched_desc_0 = existing_patched_desc.getText().toString();
																																download_selected_0 = download_selected.getText().toString();
																																download_ready_0 = download_ready.getText().toString();
																																download_ready_desc_0 = download_ready_desc.getText().toString();
																																downloading_file_0 = downloading_file.getText().toString();
																																download_success_0 = download_success.getText().toString();
																																installation_failed_0 = installation_failed.getText().toString();
																																installation_failed_desc_0 = installation_failed_desc.getText().toString();
																																installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																																installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																																select_language.setSelection((int)(29));
																															}
																															else {
																																if (LANGUAGE.getString("LANGUAGE", "").equals("30")) {
																																	sub_text_installed.setText(R.string.installed_30);
																																	main_title.setText(R.string.main_title_30);
																																	about_title.setText(R.string.about_title_30);
																																	settings_title.setText(R.string.settings_title_30);
																																	experiment_title.setText(R.string.experimental_title_30);
																																	sub_title.setText(R.string.about_sub_30);
																																	sub_text_1.setText(R.string.latest_30);
																																	sub_text_2.setText(R.string.latest_30);
																																	sub_text_3.setText(R.string.latest_30);
																																	versions_1.setText(R.string.versions_30);
																																	versions_2.setText(R.string.versions_30);
																																	versions_3.setText(R.string.versions_30);
																																	title_sub.setText(R.string.manager_tools_30);
																																	source.setText(R.string.source_30);
																																	support.setText(R.string.support_30);
																																	donate.setText(R.string.donate_30);
																																	discord.setText(R.string.discord_30);
																																	about.setText(R.string.about_30);
																																	website.setText(R.string.website_30);
																																	reddit.setText(R.string.reddit_30);
																																	faq.setText(R.string.faq_30);
																																	theme.setText(R.string.show_themes_30);
																																	language.setText(R.string.language_30);
																																	download_update.setText(R.string.download_update_30);
																																	install_now.setText(R.string.install_now_30);
																																	install_update.setText(R.string.install_update_30);
																																	uninstall_patched.setText(R.string.uninstall_patched_30);
																																	open_settings.setText(R.string.open_settings_30);
																																	open_patched.setText(R.string.open_patched_30);
																																	lite.setText(R.string.lite_30);
																																	cloned.setText(R.string.cloned_30);
																																	spap.setText(R.string.spap_30);
																																	mirror.setText(R.string.mirror_30);
																																	download.setText(R.string.download_30);
																																	cancel.setText(R.string.cancel_30);
																																	later.setText(R.string.later_30);
																																	go_back.setText(R.string.go_back_30);
																																	not_now.setText(R.string.not_now_30);
																																	close.setText(R.string.close_30);
																																	continue_1.setText(R.string.continue_1_30);
																																	install.setText(R.string.install_30);
																																	uninstall.setText(R.string.uninstall_30);
																																	ignore.setText(R.string.ignore_30);
																																	delete.setText(R.string.delete_30);
																																	thanks.setText(R.string.thanks_30);
																																	new_update.setText(R.string.new_update_30);
																																	changelogs.setText(R.string.changelogs_30);
																																	reboot.setText(R.string.reboot_30);
																																	reset_preferences.setText(R.string.reset_preferences_30);
																																	list_auto_refresh.setText(R.string.list_auto_refresh_30);
																																	list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_30);
																																	force_auto_install.setText(R.string.force_auto_install_30);
																																	force_auto_install_info.setText(R.string.force_auto_install_desc_30);
																																	apk_location.setText(R.string.apk_location_30);
																																	apk_location_info.setText(R.string.apk_location_desc_30);
																																	clear_directory_folders.setText(R.string.clear_directory_folders_30);
																																	clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_30);
																																	cloned_version.setText(R.string.cloned_version_30);
																																	cloned_version_info.setText(R.string.cloned_version_desc_30);
																																	experiment_version.setText(R.string.experimental_version_30);
																																	experiment_version_info.setText(R.string.experimental_version_desc_30);
																																	disable_reward_ad.setText(R.string.disable_rewarded_ads_30);
																																	disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_30);
																																	show_support.setText(R.string.show_support_30);
																																	show_support_desc.setText(R.string.show_support_desc_30);
																																	maintenance.setText(R.string.maintenance_30);
																																	maintenance_desc.setText(R.string.maintenance_desc_30);
																																	xmanager_dev.setText(R.string.xmanager_dev_30);
																																	patched_devs.setText(R.string.patched_devs_30);
																																	support_team.setText(R.string.support_team_30);
																																	manager_testers.setText(R.string.manager_testers_30);
																																	manager_hosting.setText(R.string.manager_hosting_30);
																																	mobilism_team.setText(R.string.mobilism_team_30);
																																	forum_team.setText(R.string.forum_team_30);
																																	contributors.setText(R.string.contributors_30);
																																	download_selected.setText(R.string.download_selected_30);
																																	download_ready.setText(R.string.download_ready_30);
																																	download_ready_desc.setText(R.string.download_ready_desc_30);
																																	downloading_file.setText(R.string.downloading_file_30);
																																	download_success.setText(R.string.download_success_30);
																																	installation_failed.setText(R.string.installation_failed_30);
																																	installation_failed_desc.setText(R.string.installation_failed_desc_30);
																																	installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_30);
																																	installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_30);
																																	existing_patched.setText(R.string.existing_patched_30);
																																	existing_patched_desc.setText(R.string.existing_patched_desc_30);
																																	lite_0 = lite.getText().toString();
																																	download_0 = download.getText().toString();
																																	continue_0 = continue_1.getText().toString();
																																	cancel_0 = cancel.getText().toString();
																																	later_0 = later.getText().toString();
																																	mirror_0 = mirror.getText().toString();
																																	install_now_0 = install_now.getText().toString();
																																	go_back_0 = go_back.getText().toString();
																																	install_update_0 = install_update.getText().toString();
																																	close_0 = close.getText().toString();
																																	uninstall_0 = uninstall.getText().toString();
																																	existing_patched_0 = existing_patched.getText().toString();
																																	existing_patched_desc_0 = existing_patched_desc.getText().toString();
																																	download_selected_0 = download_selected.getText().toString();
																																	download_ready_0 = download_ready.getText().toString();
																																	download_ready_desc_0 = download_ready_desc.getText().toString();
																																	downloading_file_0 = downloading_file.getText().toString();
																																	download_success_0 = download_success.getText().toString();
																																	installation_failed_0 = installation_failed.getText().toString();
																																	installation_failed_desc_0 = installation_failed_desc.getText().toString();
																																	installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																																	installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																																	select_language.setSelection((int)(30));
																																}
																																else {
																																	if (LANGUAGE.getString("LANGUAGE", "").equals("31")) {
																																		sub_text_installed.setText(R.string.installed_31);
																																		main_title.setText(R.string.main_title_31);
																																		about_title.setText(R.string.about_title_31);
																																		settings_title.setText(R.string.settings_title_31);
																																		experiment_title.setText(R.string.experimental_title_31);
																																		sub_title.setText(R.string.about_sub_31);
																																		sub_text_1.setText(R.string.latest_31);
																																		sub_text_2.setText(R.string.latest_31);
																																		sub_text_3.setText(R.string.latest_31);
																																		versions_1.setText(R.string.versions_31);
																																		versions_2.setText(R.string.versions_31);
																																		versions_3.setText(R.string.versions_31);
																																		title_sub.setText(R.string.manager_tools_31);
																																		source.setText(R.string.source_31);
																																		support.setText(R.string.support_31);
																																		donate.setText(R.string.donate_31);
																																		discord.setText(R.string.discord_31);
																																		about.setText(R.string.about_31);
																																		website.setText(R.string.website_31);
																																		reddit.setText(R.string.reddit_31);
																																		faq.setText(R.string.faq_31);
																																		theme.setText(R.string.show_themes_31);
																																		language.setText(R.string.language_31);
																																		download_update.setText(R.string.download_update_31);
																																		install_now.setText(R.string.install_now_31);
																																		install_update.setText(R.string.install_update_31);
																																		uninstall_patched.setText(R.string.uninstall_patched_31);
																																		open_settings.setText(R.string.open_settings_31);
																																		open_patched.setText(R.string.open_patched_31);
																																		lite.setText(R.string.lite_31);
																																		cloned.setText(R.string.cloned_31);
																																		spap.setText(R.string.spap_31);
																																		mirror.setText(R.string.mirror_31);
																																		download.setText(R.string.download_31);
																																		cancel.setText(R.string.cancel_31);
																																		later.setText(R.string.later_31);
																																		go_back.setText(R.string.go_back_31);
																																		not_now.setText(R.string.not_now_31);
																																		close.setText(R.string.close_31);
																																		continue_1.setText(R.string.continue_1_31);
																																		install.setText(R.string.install_31);
																																		uninstall.setText(R.string.uninstall_31);
																																		ignore.setText(R.string.ignore_31);
																																		delete.setText(R.string.delete_31);
																																		thanks.setText(R.string.thanks_31);
																																		new_update.setText(R.string.new_update_31);
																																		changelogs.setText(R.string.changelogs_31);
																																		reboot.setText(R.string.reboot_31);
																																		reset_preferences.setText(R.string.reset_preferences_31);
																																		list_auto_refresh.setText(R.string.list_auto_refresh_31);
																																		list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_31);
																																		force_auto_install.setText(R.string.force_auto_install_31);
																																		force_auto_install_info.setText(R.string.force_auto_install_desc_31);
																																		apk_location.setText(R.string.apk_location_31);
																																		apk_location_info.setText(R.string.apk_location_desc_31);
																																		clear_directory_folders.setText(R.string.clear_directory_folders_31);
																																		clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_31);
																																		cloned_version.setText(R.string.cloned_version_31);
																																		cloned_version_info.setText(R.string.cloned_version_desc_31);
																																		experiment_version.setText(R.string.experimental_version_31);
																																		experiment_version_info.setText(R.string.experimental_version_desc_31);
																																		disable_reward_ad.setText(R.string.disable_rewarded_ads_31);
																																		disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_31);
																																		show_support.setText(R.string.show_support_31);
																																		show_support_desc.setText(R.string.show_support_desc_31);
																																		maintenance.setText(R.string.maintenance_31);
																																		maintenance_desc.setText(R.string.maintenance_desc_31);
																																		xmanager_dev.setText(R.string.xmanager_dev_31);
																																		patched_devs.setText(R.string.patched_devs_31);
																																		support_team.setText(R.string.support_team_31);
																																		manager_testers.setText(R.string.manager_testers_31);
																																		manager_hosting.setText(R.string.manager_hosting_31);
																																		mobilism_team.setText(R.string.mobilism_team_31);
																																		forum_team.setText(R.string.forum_team_31);
																																		contributors.setText(R.string.contributors_31);
																																		download_selected.setText(R.string.download_selected_31);
																																		download_ready.setText(R.string.download_ready_31);
																																		download_ready_desc.setText(R.string.download_ready_desc_31);
																																		downloading_file.setText(R.string.downloading_file_31);
																																		download_success.setText(R.string.download_success_31);
																																		installation_failed.setText(R.string.installation_failed_31);
																																		installation_failed_desc.setText(R.string.installation_failed_desc_31);
																																		installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_31);
																																		installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_31);
																																		existing_patched.setText(R.string.existing_patched_31);
																																		existing_patched_desc.setText(R.string.existing_patched_desc_31);
																																		lite_0 = lite.getText().toString();
																																		download_0 = download.getText().toString();
																																		continue_0 = continue_1.getText().toString();
																																		cancel_0 = cancel.getText().toString();
																																		later_0 = later.getText().toString();
																																		mirror_0 = mirror.getText().toString();
																																		install_now_0 = install_now.getText().toString();
																																		go_back_0 = go_back.getText().toString();
																																		install_update_0 = install_update.getText().toString();
																																		close_0 = close.getText().toString();
																																		uninstall_0 = uninstall.getText().toString();
																																		existing_patched_0 = existing_patched.getText().toString();
																																		existing_patched_desc_0 = existing_patched_desc.getText().toString();
																																		download_selected_0 = download_selected.getText().toString();
																																		download_ready_0 = download_ready.getText().toString();
																																		download_ready_desc_0 = download_ready_desc.getText().toString();
																																		downloading_file_0 = downloading_file.getText().toString();
																																		download_success_0 = download_success.getText().toString();
																																		installation_failed_0 = installation_failed.getText().toString();
																																		installation_failed_desc_0 = installation_failed_desc.getText().toString();
																																		installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																																		installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																																		select_language.setSelection((int)(31));
																																	}
																																	else {
																																		if (LANGUAGE.getString("LANGUAGE", "").equals("32")) {
																																			sub_text_installed.setText(R.string.installed_32);
																																			main_title.setText(R.string.main_title_32);
																																			about_title.setText(R.string.about_title_32);
																																			settings_title.setText(R.string.settings_title_32);
																																			experiment_title.setText(R.string.experimental_title_32);
																																			sub_title.setText(R.string.about_sub_32);
																																			sub_text_1.setText(R.string.latest_32);
																																			sub_text_2.setText(R.string.latest_32);
																																			sub_text_3.setText(R.string.latest_32);
																																			versions_1.setText(R.string.versions_32);
																																			versions_2.setText(R.string.versions_32);
																																			versions_3.setText(R.string.versions_32);
																																			title_sub.setText(R.string.manager_tools_32);
																																			source.setText(R.string.source_32);
																																			support.setText(R.string.support_32);
																																			donate.setText(R.string.donate_32);
																																			discord.setText(R.string.discord_32);
																																			about.setText(R.string.about_32);
																																			website.setText(R.string.website_32);
																																			reddit.setText(R.string.reddit_32);
																																			faq.setText(R.string.faq_32);
																																			theme.setText(R.string.show_themes_32);
																																			language.setText(R.string.language_32);
																																			download_update.setText(R.string.download_update_32);
																																			install_now.setText(R.string.install_now_32);
																																			install_update.setText(R.string.install_update_32);
																																			uninstall_patched.setText(R.string.uninstall_patched_32);
																																			open_settings.setText(R.string.open_settings_32);
																																			open_patched.setText(R.string.open_patched_32);
																																			lite.setText(R.string.lite_32);
																																			cloned.setText(R.string.cloned_32);
																																			spap.setText(R.string.spap_32);
																																			mirror.setText(R.string.mirror_32);
																																			download.setText(R.string.download_32);
																																			cancel.setText(R.string.cancel_32);
																																			later.setText(R.string.later_32);
																																			go_back.setText(R.string.go_back_32);
																																			not_now.setText(R.string.not_now_32);
																																			close.setText(R.string.close_32);
																																			continue_1.setText(R.string.continue_1_32);
																																			install.setText(R.string.install_32);
																																			uninstall.setText(R.string.uninstall_32);
																																			ignore.setText(R.string.ignore_32);
																																			delete.setText(R.string.delete_32);
																																			thanks.setText(R.string.thanks_32);
																																			new_update.setText(R.string.new_update_32);
																																			changelogs.setText(R.string.changelogs_32);
																																			reboot.setText(R.string.reboot_32);
																																			reset_preferences.setText(R.string.reset_preferences_32);
																																			list_auto_refresh.setText(R.string.list_auto_refresh_32);
																																			list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_32);
																																			force_auto_install.setText(R.string.force_auto_install_32);
																																			force_auto_install_info.setText(R.string.force_auto_install_desc_32);
																																			apk_location.setText(R.string.apk_location_32);
																																			apk_location_info.setText(R.string.apk_location_desc_32);
																																			clear_directory_folders.setText(R.string.clear_directory_folders_32);
																																			clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_32);
																																			cloned_version.setText(R.string.cloned_version_32);
																																			cloned_version_info.setText(R.string.cloned_version_desc_32);
																																			experiment_version.setText(R.string.experimental_version_32);
																																			experiment_version_info.setText(R.string.experimental_version_desc_32);
																																			disable_reward_ad.setText(R.string.disable_rewarded_ads_32);
																																			disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_32);
																																			show_support.setText(R.string.show_support_32);
																																			show_support_desc.setText(R.string.show_support_desc_32);
																																			maintenance.setText(R.string.maintenance_32);
																																			maintenance_desc.setText(R.string.maintenance_desc_32);
																																			xmanager_dev.setText(R.string.xmanager_dev_32);
																																			patched_devs.setText(R.string.patched_devs_32);
																																			support_team.setText(R.string.support_team_32);
																																			manager_testers.setText(R.string.manager_testers_32);
																																			manager_hosting.setText(R.string.manager_hosting_32);
																																			mobilism_team.setText(R.string.mobilism_team_32);
																																			forum_team.setText(R.string.forum_team_32);
																																			contributors.setText(R.string.contributors_32);
																																			download_selected.setText(R.string.download_selected_32);
																																			download_ready.setText(R.string.download_ready_32);
																																			download_ready_desc.setText(R.string.download_ready_desc_32);
																																			downloading_file.setText(R.string.downloading_file_32);
																																			download_success.setText(R.string.download_success_32);
																																			installation_failed.setText(R.string.installation_failed_32);
																																			installation_failed_desc.setText(R.string.installation_failed_desc_32);
																																			installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_32);
																																			installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_32);
																																			existing_patched.setText(R.string.existing_patched_32);
																																			existing_patched_desc.setText(R.string.existing_patched_desc_32);
																																			lite_0 = lite.getText().toString();
																																			download_0 = download.getText().toString();
																																			continue_0 = continue_1.getText().toString();
																																			cancel_0 = cancel.getText().toString();
																																			later_0 = later.getText().toString();
																																			mirror_0 = mirror.getText().toString();
																																			install_now_0 = install_now.getText().toString();
																																			go_back_0 = go_back.getText().toString();
																																			install_update_0 = install_update.getText().toString();
																																			close_0 = close.getText().toString();
																																			uninstall_0 = uninstall.getText().toString();
																																			existing_patched_0 = existing_patched.getText().toString();
																																			existing_patched_desc_0 = existing_patched_desc.getText().toString();
																																			download_selected_0 = download_selected.getText().toString();
																																			download_ready_0 = download_ready.getText().toString();
																																			download_ready_desc_0 = download_ready_desc.getText().toString();
																																			downloading_file_0 = downloading_file.getText().toString();
																																			download_success_0 = download_success.getText().toString();
																																			installation_failed_0 = installation_failed.getText().toString();
																																			installation_failed_desc_0 = installation_failed_desc.getText().toString();
																																			installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																																			installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																																			select_language.setSelection((int)(32));
																																		}
																																		else {
																																			if (LANGUAGE.getString("LANGUAGE", "").equals("33")) {
																																				sub_text_installed.setText(R.string.installed_33);
																																				main_title.setText(R.string.main_title_33);
																																				about_title.setText(R.string.about_title_33);
																																				settings_title.setText(R.string.settings_title_33);
																																				experiment_title.setText(R.string.experimental_title_33);
																																				sub_title.setText(R.string.about_sub_33);
																																				sub_text_1.setText(R.string.latest_33);
																																				sub_text_2.setText(R.string.latest_33);
																																				sub_text_3.setText(R.string.latest_33);
																																				versions_1.setText(R.string.versions_33);
																																				versions_2.setText(R.string.versions_33);
																																				versions_3.setText(R.string.versions_33);
																																				title_sub.setText(R.string.manager_tools_33);
																																				source.setText(R.string.source_33);
																																				support.setText(R.string.support_33);
																																				donate.setText(R.string.donate_33);
																																				discord.setText(R.string.discord_33);
																																				about.setText(R.string.about_33);
																																				website.setText(R.string.website_33);
																																				reddit.setText(R.string.reddit_33);
																																				faq.setText(R.string.faq_33);
																																				theme.setText(R.string.show_themes_33);
																																				language.setText(R.string.language_33);
																																				download_update.setText(R.string.download_update_33);
																																				install_now.setText(R.string.install_now_33);
																																				install_update.setText(R.string.install_update_33);
																																				uninstall_patched.setText(R.string.uninstall_patched_33);
																																				open_settings.setText(R.string.open_settings_33);
																																				open_patched.setText(R.string.open_patched_33);
																																				lite.setText(R.string.lite_33);
																																				cloned.setText(R.string.cloned_33);
																																				spap.setText(R.string.spap_33);
																																				mirror.setText(R.string.mirror_33);
																																				download.setText(R.string.download_33);
																																				cancel.setText(R.string.cancel_33);
																																				later.setText(R.string.later_33);
																																				go_back.setText(R.string.go_back_33);
																																				not_now.setText(R.string.not_now_33);
																																				close.setText(R.string.close_33);
																																				continue_1.setText(R.string.continue_1_33);
																																				install.setText(R.string.install_33);
																																				uninstall.setText(R.string.uninstall_33);
																																				ignore.setText(R.string.ignore_33);
																																				delete.setText(R.string.delete_33);
																																				thanks.setText(R.string.thanks_33);
																																				new_update.setText(R.string.new_update_33);
																																				changelogs.setText(R.string.changelogs_33);
																																				reboot.setText(R.string.reboot_33);
																																				reset_preferences.setText(R.string.reset_preferences_33);
																																				list_auto_refresh.setText(R.string.list_auto_refresh_33);
																																				list_auto_refresh_info.setText(R.string.list_auto_refresh_desc_33);
																																				force_auto_install.setText(R.string.force_auto_install_33);
																																				force_auto_install_info.setText(R.string.force_auto_install_desc_33);
																																				apk_location.setText(R.string.apk_location_33);
																																				apk_location_info.setText(R.string.apk_location_desc_33);
																																				clear_directory_folders.setText(R.string.clear_directory_folders_33);
																																				clear_directory_folders_info.setText(R.string.clear_directory_folders_desc_33);
																																				cloned_version.setText(R.string.cloned_version_33);
																																				cloned_version_info.setText(R.string.cloned_version_desc_33);
																																				experiment_version.setText(R.string.experimental_version_33);
																																				experiment_version_info.setText(R.string.experimental_version_desc_33);
																																				disable_reward_ad.setText(R.string.disable_rewarded_ads_33);
																																				disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc_33);
																																				show_support.setText(R.string.show_support_33);
																																				show_support_desc.setText(R.string.show_support_desc_33);
																																				maintenance.setText(R.string.maintenance_33);
																																				maintenance_desc.setText(R.string.maintenance_desc_33);
																																				xmanager_dev.setText(R.string.xmanager_dev_33);
																																				patched_devs.setText(R.string.patched_devs_33);
																																				support_team.setText(R.string.support_team_33);
																																				manager_testers.setText(R.string.manager_testers_33);
																																				manager_hosting.setText(R.string.manager_hosting_33);
																																				mobilism_team.setText(R.string.mobilism_team_33);
																																				forum_team.setText(R.string.forum_team_33);
																																				contributors.setText(R.string.contributors_33);
																																				download_selected.setText(R.string.download_selected_33);
																																				download_ready.setText(R.string.download_ready_33);
																																				download_ready_desc.setText(R.string.download_ready_desc_33);
																																				downloading_file.setText(R.string.downloading_file_33);
																																				download_success.setText(R.string.download_success_33);
																																				installation_failed.setText(R.string.installation_failed_33);
																																				installation_failed_desc.setText(R.string.installation_failed_desc_33);
																																				installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc_33);
																																				installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc_33);
																																				existing_patched.setText(R.string.existing_patched_33);
																																				existing_patched_desc.setText(R.string.existing_patched_desc_33);
																																				lite_0 = lite.getText().toString();
																																				download_0 = download.getText().toString();
																																				continue_0 = continue_1.getText().toString();
																																				cancel_0 = cancel.getText().toString();
																																				later_0 = later.getText().toString();
																																				mirror_0 = mirror.getText().toString();
																																				install_now_0 = install_now.getText().toString();
																																				go_back_0 = go_back.getText().toString();
																																				install_update_0 = install_update.getText().toString();
																																				close_0 = close.getText().toString();
																																				uninstall_0 = uninstall.getText().toString();
																																				existing_patched_0 = existing_patched.getText().toString();
																																				existing_patched_desc_0 = existing_patched_desc.getText().toString();
																																				download_selected_0 = download_selected.getText().toString();
																																				download_ready_0 = download_ready.getText().toString();
																																				download_ready_desc_0 = download_ready_desc.getText().toString();
																																				downloading_file_0 = downloading_file.getText().toString();
																																				download_success_0 = download_success.getText().toString();
																																				installation_failed_0 = installation_failed.getText().toString();
																																				installation_failed_desc_0 = installation_failed_desc.getText().toString();
																																				installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
																																				installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
																																				select_language.setSelection((int)(33));
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _Language_Pack() {
		Language.add("English (Default)");
		Language.add("Bengali");
		Language.add("Chinese (Simplified)");
		Language.add("French");
		Language.add("Greek");
		Language.add("Indonesian");
		Language.add("Italian");
		Language.add("Polish");
		Language.add("Portuguese (Brazil)");
		Language.add("Portuguese (Portugal)");
		Language.add("Russian");
		Language.add("Spanish");
		Language.add("Ukranian");
		Language.add("Turkish");
		Language.add("Arabic");
		Language.add("Slovenian");
		Language.add("Romanian");
		Language.add("Korean");
		Language.add("Dutch");
		Language.add("Vietnamese");
		Language.add("German");
		Language.add("Persian");
		Language.add("Hebrew");
		Language.add("Slovak");
		Language.add("Swedish");
		Language.add("Finnish");
		Language.add("Czech");
		Language.add("Chinese (Traditional)");
		Language.add("Bulgarian");
		Language.add("Serbian (Cyrillic)");
		Language.add("Serbian (Latin)");
		Language.add("Catalan");
		Language.add("Latvian");
		Language.add("German");
		select_language.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, Language));
		((ArrayAdapter)select_language.getAdapter()).notifyDataSetChanged();
		select_language.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, Language) {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				TextView textViewv = (TextView) super.getView(position, convertView, parent);
				textViewv.setTextColor(Color.parseColor("#FFFFFF"));
				return textViewv; }
			
			@Override
			public View getDropDownView(int position, View convertView, ViewGroup parent) {
				TextView textViewv = (TextView) super.getDropDownView(position, convertView, parent); textViewv.setTextColor(Color.parseColor("#FFFFFF"));
				textViewv.setBackgroundColor(Color.parseColor("#212121"));
				
				
				return textViewv; }
		});
	}
	
	
	public void _Theme_Pack() {
		Theme.add("Black (Default)");
		Theme.add("Green");
		Theme.add("Purple");
		Theme.add("Red");
		Theme.add("Blue");
		Theme.add("Orange");
		Theme.add("Yellow");
		Theme.add("Grey");
		Theme.add("Blue Grey");
		Theme.add("Pink");
		Theme.add("Cyan");
		Theme.add("White");
		Theme.add("Brown");
		Theme.add("Indigo");
		select_theme.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, Theme));
		((ArrayAdapter)select_theme.getAdapter()).notifyDataSetChanged();
		select_theme.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, Theme) {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				TextView textViewv = (TextView) super.getView(position, convertView, parent);
				textViewv.setTextColor(Color.parseColor("#FFFFFF"));
				return textViewv; }
			
			@Override
			public View getDropDownView(int position, View convertView, ViewGroup parent) {
				TextView textViewv = (TextView) super.getDropDownView(position, convertView, parent); textViewv.setTextColor(Color.parseColor("#FFFFFF"));
				textViewv.setBackgroundColor(Color.parseColor("#212121"));
				
				
				return textViewv; }
		});
	}
	
	
	public void _Language_Fixer() {
		sub_text_installed.setText(R.string.installed);
		main_title.setText(R.string.main_title);
		about_title.setText(R.string.about_title);
		settings_title.setText(R.string.settings_title);
		experiment_title.setText(R.string.experimental_title);
		sub_title.setText(R.string.about_sub);
		sub_text_1.setText(R.string.latest);
		sub_text_2.setText(R.string.latest);
		sub_text_3.setText(R.string.latest);
		versions_1.setText(R.string.versions);
		versions_2.setText(R.string.versions);
		versions_3.setText(R.string.versions);
		title_sub.setText(R.string.manager_tools);
		source.setText(R.string.source);
		support.setText(R.string.support);
		donate.setText(R.string.donate);
		discord.setText(R.string.discord);
		about.setText(R.string.about);
		website.setText(R.string.website);
		reddit.setText(R.string.reddit);
		faq.setText(R.string.faq);
		theme.setText(R.string.show_themes);
		language.setText(R.string.language);
		download_update.setText(R.string.download_update);
		install_now.setText(R.string.install_now);
		install_update.setText(R.string.install_update);
		uninstall_patched.setText(R.string.uninstall_patched);
		open_settings.setText(R.string.open_settings);
		open_patched.setText(R.string.open_patched);
		lite.setText(R.string.lite);
		cloned.setText(R.string.cloned);
		spap.setText(R.string.spap);
		mirror.setText(R.string.mirror);
		download.setText(R.string.download);
		cancel.setText(R.string.cancel);
		later.setText(R.string.later);
		go_back.setText(R.string.go_back);
		not_now.setText(R.string.not_now);
		close.setText(R.string.close);
		continue_1.setText(R.string.continue_1);
		install.setText(R.string.install);
		uninstall.setText(R.string.uninstall);
		ignore.setText(R.string.ignore);
		delete.setText(R.string.delete);
		thanks.setText(R.string.thanks);
		new_update.setText(R.string.new_update);
		changelogs.setText(R.string.changelogs);
		reboot.setText(R.string.reboot);
		reset_preferences.setText(R.string.reset_preferences);
		list_auto_refresh.setText(R.string.list_auto_refresh);
		list_auto_refresh_info.setText(R.string.list_auto_refresh_desc);
		force_auto_install.setText(R.string.force_auto_install);
		force_auto_install_info.setText(R.string.force_auto_install_desc);
		apk_location.setText(R.string.apk_location);
		apk_location_info.setText(R.string.apk_location_desc);
		clear_directory_folders.setText(R.string.clear_directory_folders);
		clear_directory_folders_info.setText(R.string.clear_directory_folders_desc);
		cloned_version.setText(R.string.cloned_version);
		cloned_version_info.setText(R.string.cloned_version_desc);
		experiment_version.setText(R.string.experimental_version);
		experiment_version_info.setText(R.string.experimental_version_desc);
		disable_reward_ad.setText(R.string.disable_rewarded_ads);
		disable_reward_ad_info.setText(R.string.disable_rewarded_ads_desc);
		show_support.setText(R.string.show_support);
		show_support_desc.setText(R.string.show_support_desc);
		maintenance.setText(R.string.maintenance);
		maintenance_desc.setText(R.string.maintenance_desc);
		xmanager_dev.setText(R.string.xmanager_dev);
		patched_devs.setText(R.string.patched_devs);
		support_team.setText(R.string.support_team);
		manager_testers.setText(R.string.manager_testers);
		manager_hosting.setText(R.string.manager_hosting);
		mobilism_team.setText(R.string.mobilism_team);
		forum_team.setText(R.string.forum_team);
		contributors.setText(R.string.contributors);
		download_selected.setText(R.string.download_selected);
		download_ready.setText(R.string.download_ready);
		download_ready_desc.setText(R.string.download_ready_desc);
		downloading_file.setText(R.string.downloading_file);
		download_success.setText(R.string.download_success);
		installation_failed.setText(R.string.installation_failed);
		installation_failed_desc.setText(R.string.installation_failed_desc);
		installation_failed_spap_desc.setText(R.string.installation_failed_spap_desc);
		installation_failed_cloned_desc.setText(R.string.installation_failed_cloned_desc);
		existing_patched.setText(R.string.existing_patched);
		existing_patched_desc.setText(R.string.existing_patched_desc);
		lite_0 = lite.getText().toString();
		download_0 = download.getText().toString();
		continue_0 = continue_1.getText().toString();
		cancel_0 = cancel.getText().toString();
		later_0 = later.getText().toString();
		mirror_0 = mirror.getText().toString();
		install_now_0 = install_now.getText().toString();
		go_back_0 = go_back.getText().toString();
		install_update_0 = install_update.getText().toString();
		close_0 = close.getText().toString();
		uninstall_0 = uninstall.getText().toString();
		existing_patched_0 = existing_patched.getText().toString();
		existing_patched_desc_0 = existing_patched_desc.getText().toString();
		download_selected_0 = download_selected.getText().toString();
		download_ready_0 = download_ready.getText().toString();
		download_ready_desc_0 = download_ready_desc.getText().toString();
		downloading_file_0 = downloading_file.getText().toString();
		download_success_0 = download_success.getText().toString();
		installation_failed_0 = installation_failed.getText().toString();
		installation_failed_desc_0 = installation_failed_desc.getText().toString();
		installation_failed_spap_desc_0 = installation_failed_spap_desc.getText().toString();
		installation_failed_cloned_desc_0 = installation_failed_cloned_desc.getText().toString();
	}
	
	
	public void _Browser(final String _String_Text) {
		androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder();
		androidx.browser.customtabs.CustomTabsIntent customTabsIntent = builder.build();
		customTabsIntent.launchUrl(getCurrentContext(this), Uri.parse(_String_Text));
		
	} public Context getCurrentContext(Context c) {
			return c;
			
	} public Context getCurrentContext(Fragment c) {
			return c.getActivity();
			
	} public Context getCurrentContext(DialogFragment c) {
			return c.getActivity();
			
	}
	
	{
			
			
			
	}
	
	
	public void _Gate_Keeper() {
		
		
	}
	
	
	public void _Extra() {
		Timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										Animation animation;
										animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
										animation.setDuration(500); title_header_beta.startAnimation(animation);
										animation = null;
										
										title_header_beta.setText("NEW FEATURES");
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(3000));
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										Animation animation;
										animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
										animation.setDuration(500); title_header_beta.startAnimation(animation);
										animation = null;
										title_header_beta.setText("FREEDOM");
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(6000));
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										Animation animation;
										animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
										animation.setDuration(500); title_header_beta.startAnimation(animation);
										animation = null;
										title_header_beta.setText("AD-FREE");
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(9000));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(Timer, (int)(0), (int)(9000));
	}
	
	
	public void _Animation_3() {
		Animation a;
		a = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		a.setDuration(200); main_box_1.startAnimation(a);
		a = null;
		Animation b;
		b = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		b.setDuration(300); main_box_2.startAnimation(b);
		b = null;
		Animation c;
		c = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		c.setDuration(400); main_box_3.startAnimation(c);
		c = null;
		Animation d;
		d = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		d.setDuration(500); main_box_6.startAnimation(d);
		d = null;
		Animation e;
		e = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		e.setDuration(600); box_sub_header.startAnimation(e);
		e = null;
		Animation f;
		f = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		f.setDuration(700); main_box_4.startAnimation(f);
		f = null;
		Animation g;
		g = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		g.setDuration(800); main_box_15.startAnimation(g);
		g = null;
	}
	
	
	public void _Scroll_Fixed() {
		list_items_1.setOnScrollListener(new AbsListView.OnScrollListener() {
				@Override public void onScrollStateChanged(AbsListView view, int scrollState) { 
				}
				@Override public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
						int topRowVerticalPosition = (list_items_1 == null || list_items_1.getChildCount() == 0) ? 0 : list_items_1.getChildAt(0).getTop();
						main_refresh_layout.setEnabled(firstVisibleItem == 0 && topRowVerticalPosition >= 0);
				}
		});
		
		list_items_2.setOnScrollListener(new AbsListView.OnScrollListener() {
				@Override public void onScrollStateChanged(AbsListView view, int scrollState) { 
				}
				@Override public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
						int topRowVerticalPosition = (list_items_2 == null || list_items_2.getChildCount() == 0) ? 0 : list_items_2.getChildAt(0).getTop();
						main_refresh_layout.setEnabled(firstVisibleItem == 0 && topRowVerticalPosition >= 0);
				}
		});
		
		list_items_3.setOnScrollListener(new AbsListView.OnScrollListener() {
				@Override public void onScrollStateChanged(AbsListView view, int scrollState) { 
				}
				@Override public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
						int topRowVerticalPosition = (list_items_3 == null || list_items_3.getChildCount() == 0) ? 0 : list_items_3.getChildAt(0).getTop();
						main_refresh_layout.setEnabled(firstVisibleItem == 0 && topRowVerticalPosition >= 0);
				}
		});
		
		list_items_4.setOnScrollListener(new AbsListView.OnScrollListener() {
				@Override public void onScrollStateChanged(AbsListView view, int scrollState) { 
				}
				@Override public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
						int topRowVerticalPosition = (list_items_4 == null || list_items_4.getChildCount() == 0) ? 0 : list_items_4.getChildAt(0).getTop();
						main_refresh_layout.setEnabled(firstVisibleItem == 0 && topRowVerticalPosition >= 0);
				}
		});
		
	}
	
	
	public void _Tap_Animation(final View _Linear) {
		ScaleAnimation fade_in = new
		ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(80);
		fade_in.setFillAfter(true);
		_Linear.startAnimation(fade_in);
	}
	
	
	public void _Signature_Checker() {
	}
	public String getISignature(Context context) {
			try {
					android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.spotify.music", PackageManager.GET_SIGNATURES);
					for (android.content.pm.Signature signature : packageInfo.signatures) {
							String i_sha1 = geti_SHA1_(signature.toByteArray());
							return i_sha1;
					}
			} catch (android.content.pm.PackageManager.NameNotFoundException e) {
			}
			return "";
	}
	
	public String geti_SHA1_(byte[] sig) {
			try {
					java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
					digest.update(sig);
					byte[] hashtext = digest.digest();
					return i_bytes_To_Hex_(hashtext);
			} catch (java.security.NoSuchAlgorithmException e) {
			}
			return "";
	}
	
	public String i_bytes_To_Hex_(byte[] bytes) {
			final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
					'9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] hexChars = new char[bytes.length * 2];
			int v;
			for (int j = 0; j < bytes.length; j++) {
					v = bytes[j] & 0xFF;
					hexChars[j * 2] = hexArray[v >>> 4];
					hexChars[j * 2 + 1] = hexArray[v & 0x0F];
			}
			return new String(hexChars);
	}
	{
			
			
	}
	public String getDSignature(Context context) {
			try {
					android.content.pm.PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(apk_path_location.getText().toString().concat("Patched (xManager).apk"), PackageManager.GET_SIGNATURES);
					for (android.content.pm.Signature signature : packageArchiveInfo.signatures) {
							String d_sha1 = getd_SHA1_(signature.toByteArray());
							return d_sha1;
					}
			} catch (Exception e) {
			}
			return "";
	}
	
	public String getd_SHA1_(byte[] sig) {
			try {
					java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
					digest.update(sig);
					byte[] hashtext = digest.digest();
					return d_bytes_To_Hex_(hashtext);
			} catch (java.security.NoSuchAlgorithmException e) {
			}
			return "";
	}
	
	public String d_bytes_To_Hex_(byte[] bytes) {
			final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
					'9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] hexChars = new char[bytes.length * 2];
			int v;
			for (int j = 0; j < bytes.length; j++) {
					v = bytes[j] & 0xFF;
					hexChars[j * 2] = hexArray[v >>> 4];
					hexChars[j * 2 + 1] = hexArray[v & 0x0F];
			}
			return new String(hexChars);
	}
	{
			
			
	}
	
	
	public void _Download_Cloned(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "Patched Cloned (xManager).apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Reminder();
																																		_Browser(hidden_download_3.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																}
														});
														if (bytes_downloaded == bytes_total) {
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("PREPARING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING FILE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(3500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(4500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("FINALIZING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(5500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {	
																								try {
																										FileUtil.copyFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk", apk_path_location.getText().toString().concat("Patched Cloned (xManager).apk"));
																								}
																								catch(Exception e) {
																								}
																								if (!MainActivity.this.isFinishing()) {
																										_Extension_2();
																										prog.dismiss();
																								}
																								prog.dismiss();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(6500));
														}
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Download_Install_Cloned(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "Patched Cloned (xManager).apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Reminder();
																																		_Browser(hidden_download_3.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																		if (bytes_downloaded == bytes_total) {
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("PREPARING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING FILE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(3500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(4500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("FINALIZING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(5500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {	
																												try {
																														FileUtil.copyFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk", apk_path_location.getText().toString().concat("Patched Cloned (xManager).apk"));
																												}
																												catch(Exception e) {
																												}
																												Timer = new TimerTask() {
																														@Override
																														public void run() {
																																runOnUiThread(new Runnable() {
																																		@Override
																																		public void run() {
																																				prog.dismiss();
																																				if ((Installed_Version_Cloned < Downloaded_Version_Cloned) || ((Downloaded_Version_Cloned > Installed_Version_Cloned) || ((Installed_Version_Cloned == Downloaded_Version_Cloned) || Installed_Checker_Cloned.equals("false")))) {
																																						if (getICSignature(getApplicationContext()).equals(getDCSignature(getApplicationContext())) || Installed_Checker_Cloned.equals("false")) {
																																								StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
																																								if(android.os.Build.VERSION.SDK_INT >= 29){
																																										try {
																																												Intent intent = new Intent(Intent.ACTION_VIEW);
																																												intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
																																												intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")), "application/vnd.android.package-archive");
																																												startActivity(intent);
																																												_Reminder();
																																										}
																																										catch(Exception e) {
																																										}
																																								} else {
																																										try {
																																												Intent intent = new Intent(Intent.ACTION_VIEW);
																																												intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")), "application/vnd.android.package-archive");
																																												startActivity(intent);
																																												_Reminder();
																																										}
																																										catch(Exception e) {
																																										}
																																								} 
																																						} else {
																																								if (!MainActivity.this.isFinishing()) {
																																										final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
																																										String Title = "<b>".concat(installation_failed_0.concat("</b>"));
																																										String TitleColor = "1DB954";
																																										Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																										String Message = installation_failed_cloned_desc_0.replace("\n", "<br/>");
																																										String MessageColor = "FFFFFF";
																																										Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
																																										Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Signature_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																														try {
																																																Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
																																																startActivity(intent);
																																														}
																																														catch(Exception e) {
																																														}
																																												}
																																										});
																																										Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Signature_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																												}
																																										});
																																										AlertDialog = Signature_Check.create();
																																										AlertDialog.setCancelable(false);
																																										AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
																																										AlertDialog.show();
																																								}
																																						}	
																																				}
																																				else {
																																						if (Downloaded_Version_Cloned < Installed_Version_Cloned) {
																																								if (!MainActivity.this.isFinishing()) {
																																										final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
																																										String Title = "<b>".concat(installation_failed_0.concat("</b>"));
																																										String TitleColor = "1DB954";
																																										Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																										String Message = installation_failed_desc_0.replace("\n", "<br/>");
																																										String MessageColor = "FFFFFF";
																																										Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
																																										Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Downgrade_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																														try {
																																																Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
																																																startActivity(intent);
																																														}
																																														catch(Exception e) {
																																														}
																																												}
																																										});
																																										Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Downgrade_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																												}
																																										});
																																										AlertDialog = Downgrade_Check.create();
																																										AlertDialog.setCancelable(false);
																																										AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
																																										AlertDialog.show();
																																								}
																																						}
																																				}
																																		}
																																});
																														}
																												};
																												_timer.schedule(Timer, (int)(100));
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(6500));
																		}
																}
														});
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Signature_Checker_Cloned() {
	}
	public String getICSignature(Context context) {
			try {
					android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.spotify.musix", PackageManager.GET_SIGNATURES);
					for (android.content.pm.Signature signature : packageInfo.signatures) {
							String ic_sha1 = getic_SHA1_(signature.toByteArray());
							return ic_sha1;
					}
			} catch(android.content.pm.PackageManager.NameNotFoundException e) {
			}
			return "";
	}
	
	public String getic_SHA1_(byte[] sig) {
			try {
					java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
					digest.update(sig);
					byte[] hashtext = digest.digest();
					return ic_bytes_To_Hex_(hashtext);
			} catch(java.security.NoSuchAlgorithmException e) {}
			return "";
	}
	
	public String ic_bytes_To_Hex_(byte[] bytes) {
			final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
					'9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] hexChars = new char[bytes.length * 2];
			int v;
			for (int j = 0; j < bytes.length; j++) {
					v = bytes[j] & 0xFF;
					hexChars[j * 2] = hexArray[v >>> 4];
					hexChars[j * 2 + 1] = hexArray[v & 0x0F];
			}
			return new String(hexChars);
	}
	{
			
			
	}
	public String getDCSignature(Context context) {
			try {
					android.content.pm.PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(apk_path_location.getText().toString().concat("Patched Cloned (xManager).apk"), PackageManager.GET_SIGNATURES);
					for (android.content.pm.Signature signature : packageArchiveInfo.signatures) {
							
							String dc_sha1 = getdc_SHA1_(signature.toByteArray());
							return dc_sha1;
					}
			} catch(Exception e) {
			}
			return "";
	}
	
	public String getdc_SHA1_(byte[] sig) {
			try {
					java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
					digest.update(sig);
					byte[] hashtext = digest.digest();
					return dc_bytes_To_Hex_(hashtext);
			} catch(java.security.NoSuchAlgorithmException e) {}
			return "";
	}
	
	public String dc_bytes_To_Hex_(byte[] bytes) {
			final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
					'9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] hexChars = new char[bytes.length * 2];
			int v;
			for (int j = 0; j < bytes.length; j++) {
					v = bytes[j] & 0xFF;
					hexChars[j * 2] = hexArray[v >>> 4];
					hexChars[j * 2 + 1] = hexArray[v & 0x0F];
			}
			return new String(hexChars);
	}
	{
			
			
	}
	
	
	public void _Downgrade_Checker() {
		String uri_check = "com.spotify.music";
		android.content.pm.PackageManager pm_check = getPackageManager();
		
		try {
				android.content.pm.PackageInfo Installed_Reg = pm_check.getPackageInfo(uri_check, android.content.pm.PackageManager.GET_ACTIVITIES);
				Installed_Version = Installed_Reg.versionCode;
		}
		catch (Exception e) {
		}
		
		
		try {
				android.content.pm.PackageInfo Downloaded_Reg = this.getPackageManager().getPackageArchiveInfo(apk_path_location.getText().toString().concat("Patched (xManager).apk"), PackageManager.GET_ACTIVITIES);
				Downloaded_Version = Downloaded_Reg.versionCode;
		}
		catch (Exception e) {
				Downloaded_Version = Installed_Version;
		}
		
		
		String uri_cloned = "com.spotify.musix";
		android.content.pm.PackageManager pm_cloned = getPackageManager();
		
		try {
				android.content.pm.PackageInfo Installed_Cloned = pm_cloned.getPackageInfo(uri_cloned, android.content.pm.PackageManager.GET_ACTIVITIES);
				Installed_Version_Cloned = Installed_Cloned.versionCode;
		}
		catch (Exception e) {
		}
		
		
		try {
				android.content.pm.PackageInfo Downloaded_Cloned = this.getPackageManager().getPackageArchiveInfo(apk_path_location.getText().toString().concat("Patched Cloned (xManager).apk"), PackageManager.GET_ACTIVITIES);
				Downloaded_Version_Cloned = Downloaded_Cloned.versionCode;
		}
		catch (Exception e) {
				Downloaded_Version_Cloned = Installed_Version_Cloned;
		}
		
		String uri_lite = "com.spotify.lite";
		android.content.pm.PackageManager pm_lite = getPackageManager();
		
		try {
				android.content.pm.PackageInfo Installed_Lite = pm_lite.getPackageInfo(uri_lite, android.content.pm.PackageManager.GET_ACTIVITIES);
				Installed_Version_Lite = Installed_Lite.versionCode;
		}
		catch (Exception e) {
		}
		
		
		try {
				android.content.pm.PackageInfo Downloaded_Lite = this.getPackageManager().getPackageArchiveInfo(apk_path_location.getText().toString().concat("Patched Lite (xManager).apk"), PackageManager.GET_ACTIVITIES);
				Downloaded_Version_Lite = Downloaded_Lite.versionCode;
		}
		catch (Exception e) {
				Downloaded_Version_Lite = Installed_Version_Lite;
		}
		
	}
	
	
	public void _Maintenance() {
		try {
			final AlertDialog.Builder Update_Unauthorized = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
			
			String Title = "<b>".concat(maintenance.getText().toString().concat("</b>"));
			String TitleColor = "1DB954";
			
			Update_Unauthorized.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
			String Message = maintenance_desc.getText().toString();
			String MessageColor = "FFFFFF";
			
			Update_Unauthorized.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
			Update_Unauthorized.setPositiveButton(thanks.getText().toString(), new DialogInterface.OnClickListener(){
				
				                @Override
				                public void onClick(DialogInterface Update_Unauthorized, int p) {
					AlertDialog.setCancelable(true);
					finishAndRemoveTask();
					finishAffinity();
					                }
				            });
			 Update_Unauthorized.setNeutralButton(support.getText().toString(), new DialogInterface.OnClickListener(){
				
				                @Override
				                public void onClick(DialogInterface Update_Unauthorized, int p) {
					AlertDialog.setCancelable(false);
					AlertDialog.show();
					_Maintenance();
					try {
						_Browser(Datas.get("Telegram").toString());
					}
					catch(Exception e) {
					}
					                }
				            });
			AlertDialog = Update_Unauthorized.create();
			AlertDialog.setCancelable(false);
			AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
			AlertDialog.show();
		}
		catch(Exception e) {
		}
	}
	
	
	public void _Rewarded_AdMob() {
		
		    AdRequest adRequest = new AdRequest.Builder().build();
		
		    RewardedAd.load(MainActivity.this, AD_UNIT.getString("ADS", ""),
		      adRequest, new RewardedAdLoadCallback() {
			        @Override
			        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
				             
				          mRewardedAd = null;
			}
			        @Override
			        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
				          mRewardedAd = rewardedAd;
				           
				mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
					  @Override
					  public void onAdShowedFullScreenContent() {
						       
					}
					  @Override
					  public void onAdFailedToShowFullScreenContent(AdError adError) {
						       
					}
					  @Override
					  public void onAdDismissedFullScreenContent() {
						      _Rewarded_AdMob();
						    mRewardedAd = null;
						      }
					    });
				  }
		});
	}
	
	
	public void _Ads_AdMob() {
		Timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						        MobileAds.initialize(MainActivity.this, new OnInitializationCompleteListener() {
								            @Override
								            public void onInitializationComplete(InitializationStatus initializationStatus) {
										            }
								        });
						MobileAds.setAppMuted(true);
					}
				});
			}
		};
		_timer.schedule(Timer, (int)(100));
	}
	
	
	public void _API() {
		try {
				Connection.startRequestNetwork(RequestNetworkController.GET, this.getString(R.string.ㅤ), "null", _Connection_request_listener);
		} catch (Exception e) {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Invalid API Response", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Backbone() {
		Timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						try {
							Stock_Patched = (new Gson()).toJson(Datas.get("Stock_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Amoled_Patched = (new Gson()).toJson(Datas.get("Amoled_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Stock_Cloned_Patched = (new Gson()).toJson(Datas.get("Stock_Cloned_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Amoled_Cloned_Patched = (new Gson()).toJson(Datas.get("Amoled_Cloned_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Stock_Experimental_Patched = (new Gson()).toJson(Datas.get("Stock_Experimental_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Amoled_Experimental_Patched = (new Gson()).toJson(Datas.get("Amoled_Experimental_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Stock_Experimental_Cloned_Patched = (new Gson()).toJson(Datas.get("Stock_Experimental_Cloned_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Amoled_Experimental_Cloned_Patched = (new Gson()).toJson(Datas.get("Amoled_Experimental_Cloned_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Lite_Patched = (new Gson()).toJson(Datas.get("Lite_Patched"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							Patched_Changelogs = (new Gson()).toJson(Datas.get("Patched_Changelogs"), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							stock_patched = new Gson().fromJson(Stock_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							amoled_patched = new Gson().fromJson(Amoled_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							stock_cloned_patched = new Gson().fromJson(Stock_Cloned_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							amoled_cloned_patched = new Gson().fromJson(Amoled_Cloned_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							stock_experimental_patched = new Gson().fromJson(Stock_Experimental_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							amoled_experimental_patched = new Gson().fromJson(Amoled_Experimental_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							stock_experimental_cloned_patched = new Gson().fromJson(Stock_Experimental_Cloned_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							amoled_experimental_cloned_patched = new Gson().fromJson(Amoled_Experimental_Cloned_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							lite_patched = new Gson().fromJson(Lite_Patched, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							patched_changelogs = new Gson().fromJson(Patched_Changelogs, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							sub_1.setText(Datas.get("Stock_Patched_Latest").toString());
							sub_2.setText(Datas.get("Amoled_Patched_Latest").toString());
							sub_3.setText(Datas.get("SCP_Latest").toString());
							sub_4.setText(Datas.get("ACP_Latest").toString());
							sub_5.setText(Datas.get("SE_Patched_Latest").toString());
							sub_6.setText(Datas.get("AE_Patched_Latest").toString());
							sub_7.setText(Datas.get("SECP_Latest").toString());
							sub_8.setText(Datas.get("AECP_Latest").toString());
							sub_9.setText(Datas.get("Lite_Patched_Latest").toString());
							donors_1.setText(Datas.get("Supporters").toString());
							hidden_update.setText(Datas.get("Update").toString());
							app_changelogs.setText(Datas.get("App_Changelogs").toString());
							Current_Version = Double.parseDouble(local_version.getText().toString());
							Latest_Version = Double.parseDouble(Datas.get("Server").toString());
							AD_UNIT.edit().putString("ADS", Datas.get("Rewarded_Ads").toString()).commit();
							if (SWITCH_VERSION.getString("SWITCH", "").equals("A") || SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
								list_items_1.setAdapter(new List_items_1Adapter(stock_patched));
								list_items_2.setAdapter(new List_items_2Adapter(amoled_patched));
								
								
								((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
								((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
								
								
							}
							else {
								if (SWITCH_VERSION.getString("SWITCH", "").equals("C") || SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
									list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_patched));
									list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_patched));
									
									
									((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
									((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
									
									
								}
							}
							list_items_3.setAdapter(new List_items_3Adapter(lite_patched));
							list_items_4.setAdapter(new List_items_4Adapter(patched_changelogs));
							((BaseAdapter)list_items_3.getAdapter()).notifyDataSetChanged();
							((BaseAdapter)list_items_4.getAdapter()).notifyDataSetChanged();
							if (ON_SCREEN.getString("INITIALIZATION", "").equals("DONE")) {
								_Updater();
							}
						} catch (Exception e) {
								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Invalid API Response", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								box_header.setVisibility(View.GONE);
								main_body_optimization.setVisibility(View.VISIBLE);
								main_scroll_settings.setVisibility(View.GONE);
								main_scroll_about.setVisibility(View.GONE);
								main_refresh_layout.setVisibility(View.GONE);
								_Maintenance();
						}
						
					}
				});
			}
		};
		_timer.schedule(Timer, (int)(100));
	}
	
	
	public void _Initialize() {
		title_header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_sub.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_text_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_text_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_text_3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		versions_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		versions_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		versions_3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_installed.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_separator_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_installed_c.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_separator_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_installed_l.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_text_installed.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_sub.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		support.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		donate.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		about.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		source.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		website.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		discord.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		reddit.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		faq.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		theme.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_about.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		local_version.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		xmanager_dev.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		patched_devs.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		support_team.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_testers.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_hosting.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		mobilism_team.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		forum_team.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		developer_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		developer_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		support_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		testers_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		hosting_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		mobilism_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		forum_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		contributors.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_donors.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		donors_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		changelogs.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		sub_title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		list_auto_refresh.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		list_auto_refresh_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		apk_location_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		apk_location.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		reboot.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		reset_preferences.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		clear_directory_folders.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		force_auto_install.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		force_auto_install_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		clear_directory_folders_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		language.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		stock_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
		amoled_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
		lite_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 0);
		title_header_beta.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		title_header_separator.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		experiment_version.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		experiment_version_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		cloned_version.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		cloned_version_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		disable_reward_ad.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		disable_reward_ad_info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		box_sub_header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_16.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_17.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		main_box_18.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_support.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_donate.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_source.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_website.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_discord.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_reddit.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_faq.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF1DB954));
		box_about_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF171717));
		box_about_sub.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF2962FF));
		box_reboot.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF424242));
		box_reset_preferences.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF424242));
		box_separator_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF616161));
		box_separator_2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF616161));
		box_separator_4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF616161));
		box_separator_3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF616161));
		sub_1.setVisibility(View.GONE);
		sub_2.setVisibility(View.GONE);
		sub_3.setVisibility(View.GONE);
		sub_4.setVisibility(View.GONE);
		sub_5.setVisibility(View.GONE);
		sub_6.setVisibility(View.GONE);
		sub_7.setVisibility(View.GONE);
		sub_8.setVisibility(View.GONE);
		list_items_1.setVisibility(View.GONE);
		list_items_2.setVisibility(View.GONE);
		list_items_3.setVisibility(View.GONE);
		list_items_4.setVisibility(View.GONE);
		if (!ON_SCREEN.getString("INITIALIZATION", "").equals("DONE")) {
			try {
				box_header.setVisibility(View.GONE);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Intro_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				prog.setMax(100);
				prog.setMessage("Initial optimization...");
				prog.setIndeterminate(true);
				prog.setCancelable(false);
				if (!MainActivity.this.isFinishing()){
						prog.show();
				}
				
				if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/")) {
					FileUtil.deleteFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/");
				}
				Timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								prog.dismiss();
								final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Intro_Dialog);
								prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
								prog.setMax(100);
								prog.setMessage("Relaunching...");
								prog.setIndeterminate(true);
								prog.setCancelable(false);
								prog.show();
								if (!MainActivity.this.isFinishing()){
										return;
								}
								
								Timer = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												box_header.setVisibility(View.VISIBLE);
												prog.dismiss();
											}
										});
									}
								};
								_timer.schedule(Timer, (int)(9000));
							}
						});
					}
				};
				_timer.schedule(Timer, (int)(8000));
				Timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								ON_SCREEN.edit().putString("INITIALIZATION", "DONE").commit();
								try {
									Intent intent = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName() ); 
									
									intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
									intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
									startActivity(intent);
								}
								catch (Exception e) {
								}
							}
						});
					}
				};
				_timer.schedule(Timer, (int)(10000));
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =MainActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF171717);
				}
				main_body_optimization.setVisibility(View.VISIBLE);
				main_scroll_settings.setVisibility(View.GONE);
				main_scroll_about.setVisibility(View.GONE);
				main_refresh_layout.setVisibility(View.GONE);
				box_experiment.setVisibility(View.GONE);
				box_switch.setVisibility(View.GONE);
				box_update.setVisibility(View.GONE);
				_Reboot();
			}
			catch(Exception e) {
			}
		}
		else {
			try {
				if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
					cloned_version_switch.setChecked(false);
					experiment_version_switch.setChecked(false);
					sub_1.setVisibility(View.VISIBLE);
					sub_2.setVisibility(View.VISIBLE);
					sub_3.setVisibility(View.GONE);
					sub_4.setVisibility(View.GONE);
					sub_5.setVisibility(View.GONE);
					sub_6.setVisibility(View.GONE);
					sub_7.setVisibility(View.GONE);
					sub_8.setVisibility(View.GONE);
				}
				else {
					if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
						cloned_version_switch.setChecked(true);
						experiment_version_switch.setChecked(false);
						sub_1.setVisibility(View.GONE);
						sub_2.setVisibility(View.GONE);
						sub_3.setVisibility(View.VISIBLE);
						sub_4.setVisibility(View.VISIBLE);
						sub_5.setVisibility(View.GONE);
						sub_6.setVisibility(View.GONE);
						sub_7.setVisibility(View.GONE);
						sub_8.setVisibility(View.GONE);
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
							cloned_version_switch.setChecked(false);
							experiment_version_switch.setChecked(true);
							sub_1.setVisibility(View.GONE);
							sub_2.setVisibility(View.GONE);
							sub_3.setVisibility(View.GONE);
							sub_4.setVisibility(View.GONE);
							sub_5.setVisibility(View.VISIBLE);
							sub_6.setVisibility(View.VISIBLE);
							sub_7.setVisibility(View.GONE);
							sub_8.setVisibility(View.GONE);
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
								cloned_version_switch.setChecked(true);
								experiment_version_switch.setChecked(true);
								sub_1.setVisibility(View.GONE);
								sub_2.setVisibility(View.GONE);
								sub_3.setVisibility(View.GONE);
								sub_4.setVisibility(View.GONE);
								sub_5.setVisibility(View.GONE);
								sub_6.setVisibility(View.GONE);
								sub_7.setVisibility(View.VISIBLE);
								sub_8.setVisibility(View.VISIBLE);
							}
						}
					}
				}
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =MainActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF171717);
				}
				title_header.setTextColor(0xFF1DB954);
				title_header_separator.setTextColor(0xFFFFFFFF);
				title_header_beta.setTextColor(0xFFFFFFFF);
				box_header.setBackgroundColor(0xFF171717);
				main_body_optimization.setVisibility(View.GONE);
				main_scroll_settings.setVisibility(View.GONE);
				main_scroll_about.setVisibility(View.GONE);
				main_refresh_layout.setVisibility(View.VISIBLE);
				box_experiment.setVisibility(View.VISIBLE);
				box_switch.setVisibility(View.VISIBLE);
				box_update.setVisibility(View.VISIBLE);
				icon_experiment.setAlpha((float)(1.0d));
				icon_switch.setAlpha((float)(1.0d));
				icon_update.setAlpha((float)(1.0d));
				main_body.setAlpha((float)(0.50d));
				_Permission();
				_API_Token();
				_Updater();
			}
			catch(Exception e) {
			}
		}
		main_refresh_layout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override
			public void onRefresh() {
				try {
					main_refresh_layout.setRefreshing(true);
					Timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
										list_items_1.setVisibility(View.VISIBLE);
										list_items_2.setVisibility(View.GONE);
										list_items_3.setVisibility(View.GONE);
										list_items_4.setVisibility(View.GONE);
										list_items_1.setAdapter(new List_items_1Adapter(stock_patched));
										((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
									}
									else {
										if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
											list_items_1.setVisibility(View.VISIBLE);
											list_items_2.setVisibility(View.GONE);
											list_items_3.setVisibility(View.GONE);
											list_items_4.setVisibility(View.GONE);
											list_items_1.setAdapter(new List_items_1Adapter(stock_cloned_patched));
											((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
										}
										else {
											if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
												list_items_1.setVisibility(View.VISIBLE);
												list_items_2.setVisibility(View.GONE);
												list_items_3.setVisibility(View.GONE);
												list_items_4.setVisibility(View.GONE);
												list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_patched));
												((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
											}
											else {
												if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
													list_items_1.setVisibility(View.VISIBLE);
													list_items_2.setVisibility(View.GONE);
													list_items_3.setVisibility(View.GONE);
													list_items_4.setVisibility(View.GONE);
													list_items_1.setAdapter(new List_items_1Adapter(stock_experimental_cloned_patched));
													((BaseAdapter)list_items_1.getAdapter()).notifyDataSetChanged();
												}
											}
										}
									}
									Animation animation;
									animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
									animation.setDuration(500); version_oc_01.startAnimation(animation);
									animation = null;
									version_oc_01.setImageResource(R.drawable.open);
									version_oc_02.setImageResource(R.drawable.close);
									version_oc_03.setImageResource(R.drawable.close);
									changelogs_oc.setImageResource(R.drawable.close);
									Timer = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
														list_items_1.setVisibility(View.GONE);
														list_items_2.setVisibility(View.VISIBLE);
														list_items_3.setVisibility(View.GONE);
														list_items_4.setVisibility(View.GONE);
														list_items_2.setAdapter(new List_items_2Adapter(amoled_patched));
														((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
													}
													else {
														if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
															list_items_1.setVisibility(View.GONE);
															list_items_2.setVisibility(View.VISIBLE);
															list_items_3.setVisibility(View.GONE);
															list_items_4.setVisibility(View.GONE);
															list_items_2.setAdapter(new List_items_2Adapter(amoled_cloned_patched));
															((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
														}
														else {
															if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
																list_items_1.setVisibility(View.GONE);
																list_items_2.setVisibility(View.VISIBLE);
																list_items_3.setVisibility(View.GONE);
																list_items_4.setVisibility(View.GONE);
																list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_patched));
																((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
															}
															else {
																if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
																	list_items_1.setVisibility(View.GONE);
																	list_items_2.setVisibility(View.VISIBLE);
																	list_items_3.setVisibility(View.GONE);
																	list_items_4.setVisibility(View.GONE);
																	list_items_2.setAdapter(new List_items_2Adapter(amoled_experimental_cloned_patched));
																	((BaseAdapter)list_items_2.getAdapter()).notifyDataSetChanged();
																}
															}
														}
													}
													Animation animation;
													animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
													animation.setDuration(500); version_oc_02.startAnimation(animation);
													animation = null;
													version_oc_01.setImageResource(R.drawable.close);
													version_oc_02.setImageResource(R.drawable.open);
													version_oc_03.setImageResource(R.drawable.close);
													changelogs_oc.setImageResource(R.drawable.close);
													Timer = new TimerTask() {
														@Override
														public void run() {
															runOnUiThread(new Runnable() {
																@Override
																public void run() {
																	Animation animation;
																	animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
																	animation.setDuration(500); version_oc_03.startAnimation(animation);
																	animation = null;
																	list_items_1.setVisibility(View.GONE);
																	list_items_2.setVisibility(View.GONE);
																	list_items_3.setVisibility(View.VISIBLE);
																	list_items_4.setVisibility(View.GONE);
																	version_oc_01.setImageResource(R.drawable.close);
																	version_oc_02.setImageResource(R.drawable.close);
																	version_oc_03.setImageResource(R.drawable.open);
																	changelogs_oc.setImageResource(R.drawable.close);
																	list_items_3.setAdapter(new List_items_3Adapter(lite_patched));
																	((BaseAdapter)list_items_3.getAdapter()).notifyDataSetChanged();
																	Timer = new TimerTask() {
																		@Override
																		public void run() {
																			runOnUiThread(new Runnable() {
																				@Override
																				public void run() {
																					Animation animation;
																					animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
																					animation.setDuration(500); changelogs_oc.startAnimation(animation);
																					animation = null;
																					list_items_1.setVisibility(View.GONE);
																					list_items_2.setVisibility(View.GONE);
																					list_items_3.setVisibility(View.GONE);
																					list_items_4.setVisibility(View.VISIBLE);
																					version_oc_01.setImageResource(R.drawable.close);
																					version_oc_02.setImageResource(R.drawable.close);
																					version_oc_03.setImageResource(R.drawable.close);
																					changelogs_oc.setImageResource(R.drawable.open);
																					list_items_4.setAdapter(new List_items_4Adapter(patched_changelogs));
																					((BaseAdapter)list_items_4.getAdapter()).notifyDataSetChanged();
																					Timer = new TimerTask() {
																						@Override
																						public void run() {
																							runOnUiThread(new Runnable() {
																								@Override
																								public void run() {
																									main_refresh_layout.setRefreshing(false);
																									list_items_1.setVisibility(View.GONE);
																									list_items_2.setVisibility(View.GONE);
																									list_items_3.setVisibility(View.GONE);
																									list_items_4.setVisibility(View.GONE);
																									version_oc_01.setImageResource(R.drawable.close);
																									version_oc_02.setImageResource(R.drawable.close);
																									version_oc_03.setImageResource(R.drawable.close);
																									changelogs_oc.setImageResource(R.drawable.close);
																									main_body.setAlpha((float)(1.0d));
																									String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
																									
																									com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Data List Updated | " + (currentDateTimeString), com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																								}
																							});
																						}
																					};
																					_timer.schedule(Timer, (int)(700));
																				}
																			});
																		}
																	};
																	_timer.schedule(Timer, (int)(600));
																}
															});
														}
													};
													_timer.schedule(Timer, (int)(500));
												}
											});
										}
									};
									_timer.schedule(Timer, (int)(500));
								}
							});
						}
					};
					_timer.schedule(Timer, (int)(400));
					com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Refreshing Data List...", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
					main_body.setAlpha((float)(0.50d));
					_Animation_3();
					_Clickers();
				}
				catch(Exception e) {
				}
			}
		});
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
				CharSequence name = "Null";
				String description = "Null";
				int importance = NotificationManager.IMPORTANCE_MAX;
				NotificationChannel channel = new NotificationChannel("id 1", name, importance);
				channel.setDescription(description);
				
				NotificationManager notificationManager = getSystemService(NotificationManager.class);
				notificationManager.createNotificationChannel(channel);
		}
		
		apk_path_location.setText(APK_PATH.getString("PATH", ""));
		Timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										_Downgrade_Checker();
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(75));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(Timer, (int)(0), (int)(150));
		CHECK = 0;
		_Rewarded_AdMob();
		_Layout_Transition();
		_Update_Remover();
		_Language_Fixer();
		_Switch_Fixer();
		_Language_UI();
		_List_Updater();
		_Scroll_Fixed();
		_Ads_AdMob();
		_Theme_UI();
		_Clickers();
		_Effects();
		_Extra();
	}
	
	
	public void _API_Token() {
		main_refresh_layout.setRefreshing(true);
		if (SketchwareUtil.isConnected(getApplicationContext())) {
			try {
				Current_Version = Double.parseDouble(local_version.getText().toString());
				Latest_Version = Double.parseDouble(Datas.get("Server").toString());
			} catch (Exception e) {
			}
			Timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (Latest_Version < Current_Version) {
								com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "API Token Expired", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
								main_refresh_layout.setRefreshing(false);
								main_body.setAlpha((float)(1.0d));
							}
							else {
								if (Latest_Version > Current_Version) {
									com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "New Update Available", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
									main_refresh_layout.setRefreshing(false);
									main_body.setAlpha((float)(1.0d));
								}
								else {
									if (!list_auto_refresh_switch.isChecked()) {
										String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
										
										com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "API Updated | " + (currentDateTimeString), com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
										main_refresh_layout.setRefreshing(false);
										main_body.setAlpha((float)(1.0d));
									}
								}
							}
						}
					});
				}
			};
			_timer.schedule(Timer, (int)(500));
		}
		else {
			Timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "API Update Failed", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
							main_refresh_layout.setRefreshing(false);
							main_body.setAlpha((float)(1.0d));
						}
					});
				}
			};
			_timer.schedule(Timer, (int)(500));
		}
	}
	
	
	public void _Clickers() {
		CLICKER_1 = 1;
		CLICKER_2 = 1;
		CLICKER_3 = 1;
		CLICKER_4 = 1;
	}
	
	
	public void _Extension_1() {
		final AlertDialog.Builder Success_Download = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
		String Title = "<b>".concat(download_success_0.concat("</b>"));
		String TitleColor = "1DB954";
		Success_Download.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
		Success_Download.setPositiveButton(install_now_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						if ((Installed_Version < Downloaded_Version) || ((Downloaded_Version > Installed_Version) || ((Installed_Version == Downloaded_Version) || Installed_Checker.equals("false")))) {
								if (getISignature(getApplicationContext()).equals(getDSignature(getApplicationContext())) || Installed_Checker.equals("false")) {
										StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
										if(android.os.Build.VERSION.SDK_INT >= 29){
												try {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
														intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")), "application/vnd.android.package-archive");
														startActivity(intent);
														_Reminder();
												}
												catch(Exception e) {
												}
										} else {
												try {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")), "application/vnd.android.package-archive");
														startActivity(intent);
														_Reminder();
												}
												catch(Exception e) {
												}
										} 
								} else {
										if (!MainActivity.this.isFinishing()) {
												final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
												String Title = "<b>".concat(installation_failed_0.concat("</b>"));
												String TitleColor = "1DB954";
												Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
												String Message = installation_failed_spap_desc_0.replace("\n", "<br/>");
												String MessageColor = "FFFFFF";
												Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Signature_Check, int p) {
																AlertDialog.setCancelable(true);
																try {
																		Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
																		startActivity(intent);
																}
																catch(Exception e) {
																}
														}
												});
												Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Signature_Check, int p) {
																AlertDialog.setCancelable(true);
														}
												});
												AlertDialog = Signature_Check.create();
												AlertDialog.setCancelable(false);
												AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
												AlertDialog.show();
										}
								}	
						}
						else {
								if (Downloaded_Version < Installed_Version) {
										if (!MainActivity.this.isFinishing()) {
												final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
												String Title = "<b>".concat(installation_failed_0.concat("</b>"));
												String TitleColor = "1DB954";
												Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
												String Message = installation_failed_desc_0.replace("\n", "<br/>");
												String MessageColor = "FFFFFF";
												Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Downgrade_Check, int p) {
																AlertDialog.setCancelable(true);
																try {
																		Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
																		startActivity(intent);
																}
																catch(Exception e) {
																}
														}
												});
												Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Downgrade_Check, int p) {
																AlertDialog.setCancelable(true);
														}
												});
												AlertDialog = Downgrade_Check.create();
												AlertDialog.setCancelable(false);
												AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
												AlertDialog.show();
										}
								}
						}
				}
		});
		Success_Download.setNeutralButton(later_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						_Reminder();
				}
		});
		AlertDialog = Success_Download.create();
		AlertDialog.setCancelable(false);
		AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
		AlertDialog.show();
		
	}
	
	
	public void _Extension_2() {
		final AlertDialog.Builder Success_Download = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
		String Title = "<b>".concat(download_success_0.concat("</b>"));
		String TitleColor = "1DB954";
		Success_Download.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
		Success_Download.setPositiveButton(install_now_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						if ((Installed_Version_Cloned < Downloaded_Version_Cloned) || ((Downloaded_Version_Cloned > Installed_Version_Cloned) || ((Installed_Version_Cloned == Downloaded_Version_Cloned) || Installed_Checker_Cloned.equals("false")))) {
								if (getICSignature(getApplicationContext()).equals(getDCSignature(getApplicationContext())) || Installed_Checker_Cloned.equals("false")) {
										StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
										if(android.os.Build.VERSION.SDK_INT >= 29){
												try {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
														intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")), "application/vnd.android.package-archive");
														startActivity(intent);
														_Reminder();
												}
												catch(Exception e) {
												}
										} else {
												try {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")), "application/vnd.android.package-archive");
														startActivity(intent);
														_Reminder();
												}
												catch(Exception e) {
												}
										} 
								} else {
										if (!MainActivity.this.isFinishing()) {
												final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
												String Title = "<b>".concat(installation_failed_0.concat("</b>"));
												String TitleColor = "1DB954";
												Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
												String Message = installation_failed_cloned_desc_0.replace("\n", "<br/>");
												String MessageColor = "FFFFFF";
												Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Signature_Check, int p) {
																AlertDialog.setCancelable(true);
																try {
																		Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
																		startActivity(intent);
																}
																catch(Exception e) {
																}
														}
												});
												Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Signature_Check, int p) {
																AlertDialog.setCancelable(true);
														}
												});
												AlertDialog = Signature_Check.create();
												AlertDialog.setCancelable(false);
												AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
												AlertDialog.show();
										}
								}	
						}
						else {
								if (!MainActivity.this.isFinishing()) {
										if (Downloaded_Version_Cloned < Installed_Version_Cloned) {
												final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
												String Title = "<b>".concat(installation_failed_0.concat("</b>"));
												String TitleColor = "1DB954";
												Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
												String Message = installation_failed_desc_0.replace("\n", "<br/>");
												String MessageColor = "FFFFFF";
												Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Downgrade_Check, int p) {
																AlertDialog.setCancelable(true);
																try {
																		Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
																		startActivity(intent);
																}
																catch(Exception e) {
																}
														}
												});
												Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Downgrade_Check, int p) {
																AlertDialog.setCancelable(true);
														}
												});
												AlertDialog = Downgrade_Check.create();
												AlertDialog.setCancelable(false);
												AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
												AlertDialog.show();
										}
								}
						}
				}
		});
		Success_Download.setNeutralButton(later_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						_Reminder();
				}
		});
		AlertDialog = Success_Download.create();
		AlertDialog.setCancelable(false);
		AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
		AlertDialog.show();
		
	}
	
	
	public void _Extension_3() {
		final AlertDialog.Builder Success_Download = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
		String Title = "<b>".concat(download_success_0.concat("</b>"));
		String TitleColor = "1DB954";
		Success_Download.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
		Success_Download.setPositiveButton(install_update_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
						if(android.os.Build.VERSION.SDK_INT >= 29){
								try {
										Intent intent = new Intent(Intent.ACTION_VIEW);
										intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
										intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/xManager Update.apk")), "application/vnd.android.package-archive");
										startActivity(intent);
								}
								catch(Exception e) {
								}
						} else {
								try {
										Intent intent = new Intent(Intent.ACTION_VIEW);
										intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Update/xManager Update.apk")), "application/vnd.android.package-archive");
										startActivity(intent);
								}
								catch(Exception e) {
								}
						}
				}
		});
		Success_Download.setNeutralButton(later_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
				}
		});
		AlertDialog = Success_Download.create();
		AlertDialog.setCancelable(false);
		AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
		AlertDialog.show();
		
	}
	
	
	public void _Extension_4() {
		if ((Installed_Version < Downloaded_Version) || ((Downloaded_Version > Installed_Version) || ((Installed_Version == Downloaded_Version) || Installed_Checker.equals("false")))) {
				if (getISignature(getApplicationContext()).equals(getDSignature(getApplicationContext())) || Installed_Checker.equals("false")) {
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
						if(android.os.Build.VERSION.SDK_INT >= 29){
								try {
										Intent intent = new Intent(Intent.ACTION_VIEW);
										intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
										intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")), "application/vnd.android.package-archive");
										startActivity(intent);
						                _Reminder();
								}
								catch(Exception e) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Installation Failed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
						} else {
								try {
										Intent intent = new Intent(Intent.ACTION_VIEW);
										intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched (xManager).apk")), "application/vnd.android.package-archive");
										startActivity(intent);
						                _Reminder();
								}
								catch(Exception e) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Installation Failed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
						} 
				} else {
						final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						String Title = "<b>".concat(installation_failed_0.concat("</b>"));
						String TitleColor = "1DB954";
						Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = installation_failed_spap_desc_0.replace("\n", "<br/>");
						String MessageColor = "FFFFFF";
						Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Signature_Check, int p) {
										AlertDialog.setCancelable(true);
										try {
												Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
												startActivity(intent);
										}
										catch(Exception e) {
										}
								}
						});
						Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Signature_Check, int p) {
										AlertDialog.setCancelable(true);
								}
						});
						AlertDialog = Signature_Check.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
				}	
		}
		else {
				if (Downloaded_Version < Installed_Version) {
						final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						String Title = "<b>".concat(installation_failed_0.concat("</b>"));
						String TitleColor = "1DB954";
						Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = installation_failed_desc_0.replace("\n", "<br/>");
						String MessageColor = "FFFFFF";
						Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Downgrade_Check, int p) {
										AlertDialog.setCancelable(true);
										try {
												Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.music")); 
												startActivity(intent);
										}
										catch(Exception e) {
										}
								}
						});
						Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Downgrade_Check, int p) {
										AlertDialog.setCancelable(true);
								}
						});
						AlertDialog = Downgrade_Check.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
				}
		}	
		
	}
	
	
	public void _Extension_5() {
		if ((Installed_Version_Cloned < Downloaded_Version_Cloned) || ((Downloaded_Version_Cloned > Installed_Version_Cloned) || ((Installed_Version_Cloned == Downloaded_Version_Cloned) || Installed_Checker_Cloned.equals("false")))) {
				if (getICSignature(getApplicationContext()).equals(getDCSignature(getApplicationContext())) || Installed_Checker_Cloned.equals("false")) {
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
						if(android.os.Build.VERSION.SDK_INT >= 29){
								try {
										Intent intent = new Intent(Intent.ACTION_VIEW);
										intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
										intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")), "application/vnd.android.package-archive");
										startActivity(intent);
						                _Reminder();
								}
								catch(Exception e) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Installation Failed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
						} else {
								try {
										Intent intent = new Intent(Intent.ACTION_VIEW);
										intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Cloned (xManager).apk")), "application/vnd.android.package-archive");
										startActivity(intent);
						                _Reminder();
								}
								catch(Exception e) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Installation Failed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
						} 
				} else {
						final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						String Title = "<b>".concat(installation_failed_0.concat("</b>"));
						String TitleColor = "1DB954";
						Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = installation_failed_cloned_desc_0.replace("\n", "<br/>");
						String MessageColor = "FFFFFF";
						Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Signature_Check, int p) {
										AlertDialog.setCancelable(true);
										try {
												Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
												startActivity(intent);
										}
										catch(Exception e) {
										}
								}
						});
						Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Signature_Check, int p) {
										AlertDialog.setCancelable(true);
								}
						});
						AlertDialog = Signature_Check.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
				}	
		}
		else {
				if (Downloaded_Version_Cloned < Installed_Version_Cloned) {
						final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						String Title = "<b>".concat(installation_failed_0.concat("</b>"));
						String TitleColor = "1DB954";
						Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = installation_failed_desc_0.replace("\n", "<br/>");
						String MessageColor = "FFFFFF";
						Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Downgrade_Check, int p) {
										AlertDialog.setCancelable(true);
										try {
												Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.musix")); 
												startActivity(intent);
										}
										catch(Exception e) {
										}
								}
						});
						Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Downgrade_Check, int p) {
										AlertDialog.setCancelable(true);
								}
						});
						AlertDialog = Downgrade_Check.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
				}
		}
		
	}
	
	
	public void _Reinitialize() {
		manager_lang_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_16.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_17.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_18.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_19.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_20.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_21.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_22.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_23.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_24.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_25.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_26.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_27.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_28.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_29.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_30.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_31.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_32.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_33.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		manager_lang_34.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_16.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_17.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_18.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_19.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_20.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_21.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_22.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_23.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_24.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_25.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_26.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_27.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_28.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_29.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_30.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_31.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_32.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_33.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
		translator_34.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
	}
	
	
	public void _Reminder() {
		if (Build.VERSION.SDK_INT >= 21) {
				try {
						final String App = "xManager";
						final String contentTitle = "IMPORTANT NOTE";
						final String contentMessage = "After installing and logging-in, make sure to reopen or force close the Spotify app to enable the mod features.";
						
						androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(MainActivity.this, "id 1");
						builder.setStyle(new androidx.core.app.NotificationCompat.BigTextStyle(builder).bigText(contentMessage)
						.setBigContentTitle(contentTitle))
						.setContentTitle(contentTitle)
						.setContentText(contentMessage)
						.setSmallIcon(R.drawable.icon_notification)
						.setAutoCancel(true);
						
						final NotificationManager push = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
						builder.build().flags |= Notification.FLAG_AUTO_CANCEL;
						push.notify(1, builder.build());
				}
				catch(Exception e) {
				}
		} else {
				if (Build.VERSION.SDK_INT <= 20) {
						com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "IMPORTANT NOTE: After installing and logging-in, make sure to reopen or force close the Spotify app to enable the mod features.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
				}
		}
		
	}
	
	
	public void _Signature_Checker_Lite() {
	}
	public String getILSignature(Context context) {
			try {
					android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.spotify.lite", PackageManager.GET_SIGNATURES);
					for (android.content.pm.Signature signature : packageInfo.signatures) {
							String il_sha1 = geti_SHA1_(signature.toByteArray());
							return il_sha1;
					}
			} catch (android.content.pm.PackageManager.NameNotFoundException e) {
			}
			return "";
	}
	
	public String getil_SHA1_(byte[] sig) {
			try {
					java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
					digest.update(sig);
					byte[] hashtext = digest.digest();
					return il_bytes_To_Hex_(hashtext);
			} catch (java.security.NoSuchAlgorithmException e) {
			}
			return "";
	}
	
	public String il_bytes_To_Hex_(byte[] bytes) {
			final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
					'9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] hexChars = new char[bytes.length * 2];
			int v;
			for (int j = 0; j < bytes.length; j++) {
					v = bytes[j] & 0xFF;
					hexChars[j * 2] = hexArray[v >>> 4];
					hexChars[j * 2 + 1] = hexArray[v & 0x0F];
			}
			return new String(hexChars);
	}
	{
			
			
	}
	public String getDLSignature(Context context) {
			try {
					android.content.pm.PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(apk_path_location.getText().toString().concat("Patched Lite (xManager).apk"), PackageManager.GET_SIGNATURES);
					for (android.content.pm.Signature signature : packageArchiveInfo.signatures) {
							String dl_sha1 = getd_SHA1_(signature.toByteArray());
							return dl_sha1;
					}
			} catch (Exception e) {
			}
			return "";
	}
	
	public String getdl_SHA1_(byte[] sig) {
			try {
					java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
					digest.update(sig);
					byte[] hashtext = digest.digest();
					return dl_bytes_To_Hex_(hashtext);
			} catch (java.security.NoSuchAlgorithmException e) {
			}
			return "";
	}
	
	public String dl_bytes_To_Hex_(byte[] bytes) {
			final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
					'9', 'A', 'B', 'C', 'D', 'E', 'F' };
			char[] hexChars = new char[bytes.length * 2];
			int v;
			for (int j = 0; j < bytes.length; j++) {
					v = bytes[j] & 0xFF;
					hexChars[j * 2] = hexArray[v >>> 4];
					hexChars[j * 2 + 1] = hexArray[v & 0x0F];
			}
			return new String(hexChars);
	}
	{
			
			
	}
	
	
	public void _Download_Lite(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "Patched Lite (xManager).apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Reminder();
																																		_Browser(hidden_download_3.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																}
														});
														if (bytes_downloaded == bytes_total) {
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("PREPARING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING FILE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(3500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(4500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																								finalize.setDuration(1800);
																								finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																										public void onAnimationUpdate(ValueAnimator animation) {
																												prog.setProgress((int) animation.getAnimatedValue());
																												String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																												String TitleColor = "1DB954";
																												prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																												prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																												prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																												prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																												prog.setProgressNumberFormat("FINALIZING...");
																										}
																								});
																								finalize.start();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(5500));
																Timer = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {	
																								try {
																										FileUtil.copyFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk", apk_path_location.getText().toString().concat("Patched Lite (xManager).apk"));
																								}
																								catch(Exception e) {
																								}
																								if (!MainActivity.this.isFinishing()) {
																										_Extension_7();
																										prog.dismiss();
																								}
																								prog.dismiss();
																						}
																				});
																		}
																};
																_timer.schedule(Timer, (int)(6500));
														}
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Download_Install_Lite(final String _url, final String _path) {
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
				final String urlDownload = _url;
				final DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
				final String fileName = URLUtil.guessFileName(urlDownload, null, null);
				request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
				request.setMimeType("application/vnd.android.package-archive");
				request.allowScanningByMediaScanner();
				request.setDestinationInExternalFilesDir(MainActivity.this, Environment.DIRECTORY_DOWNLOADS, "Patched Lite (xManager).apk");
				final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				final long downloadId = manager.enqueue(request);
				final ProgressDialog prog = new ProgressDialog(MainActivity.this, R.style.Progress_Dialog);
				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
				Thread progress = new Thread() {
						@Override
						public void run() {
								boolean downloading = true;
								while (downloading) {
										DownloadManager.Query q = new DownloadManager.Query();
										q.setFilterById(downloadId);
										android.database.Cursor cursor = manager.query(q);
										if (cursor != null) { 
												if (cursor.moveToFirst()) {
														int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
														int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
																downloading = false;
														}
														if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_FAILED) {
																runOnUiThread(new Runnable() {
																		public void run() {
																				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "The file or link is currently unavailable. Please try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																				_File_Remover();
																		}
																});
														}				
														final int dl_progress = (int) (bytes_total != 0 ? (bytes_downloaded * 100l) / bytes_total : 0) ;
														final int dl_max = (int) (100);
														final float file_front = (float) ((bytes_downloaded * 1.0) / 1048576.0);
														final float file_end = (float) ((bytes_total * 1.0) / 1048576.0);
														String file_min = String.format("%.2f", file_front);
														String file_fix = String.format("%.2f", file_end);
														String file_max = file_fix.replace("-", "");
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																		finalize.setDuration(2000);
																		finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																				public void onAnimationUpdate(ValueAnimator animation) {
																						prog.setProgress((int) animation.getAnimatedValue());
																				}
																		});
																		finalize.start();
																		if (!MainActivity.this.isFinishing()) {
																				prog.getWindow().setBackgroundDrawableResource(R.drawable.progress_dialog);
																				String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																				String TitleColor = "1DB954";
																				prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																				prog.setProgressDrawable(getResources().getDrawable(R.drawable.progress_bar));
																				prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																				prog.setProgressNumberFormat((file_min) + " MB" + " | " + (file_max) + " MB");
																				prog.setCancelable(false);
																				prog.setProgress(dl_progress);
																				prog.setMax(dl_max);
																				prog.setButton(DialogInterface.BUTTON_NEGATIVE, cancel_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																prog.dismiss();
																																com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Download Cancelled", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.setButton(DialogInterface.BUTTON_NEUTRAL, mirror_0, new DialogInterface.OnClickListener() {
																						@Override
																						public void onClick(DialogInterface dialog, int which) {
																								prog.setCancelable(true);
																								manager.remove(downloadId);
																								_File_Remover();
																								Timer = new TimerTask() {
																										@Override
																										public void run() {
																												runOnUiThread(new Runnable() {
																														@Override
																														public void run() {
																																try {
																																		prog.dismiss();
																																		_Reminder();
																																		_Browser(hidden_download_3.getText().toString());
																																} catch (Exception e) {
																																}
																														}
																												});
																										}
																								};
																								_timer.schedule(Timer, (int)(0));
																						}
																				});
																				prog.show();
																		}
																		if (bytes_downloaded == bytes_total) {
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(prog.getProgress(), prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(downloading_file_0.concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("PREPARING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING FILE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(3500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("VERIFYING SIGNATURE...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(4500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												ValueAnimator finalize = ValueAnimator.ofInt(0, prog.getMax());
																												finalize.setDuration(1800);
																												finalize.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
																														public void onAnimationUpdate(ValueAnimator animation) {
																																prog.setProgress((int) animation.getAnimatedValue());
																																String Title = "<b>".concat(hidden_patched.getText().toString().concat("</b>"));
																																String TitleColor = "1DB954";
																																prog.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																prog.getButton(ProgressDialog.BUTTON_NEGATIVE).setVisibility(View.GONE);
																																prog.getButton(ProgressDialog.BUTTON_NEUTRAL).setVisibility(View.GONE);
																																prog.getWindow().setLayout(850, ViewGroup.LayoutParams.WRAP_CONTENT);
																																prog.setProgressNumberFormat("FINALIZING...");
																														}
																												});
																												finalize.start();
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(5500));
																				Timer = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {	
																												try {
																														FileUtil.copyFile("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk", apk_path_location.getText().toString().concat("Patched Lite (xManager).apk"));
																												}
																												catch(Exception e) {
																												}
																												Timer = new TimerTask() {
																														@Override
																														public void run() {
																																runOnUiThread(new Runnable() {
																																		@Override
																																		public void run() {
																																				prog.dismiss();
																																				if ((Installed_Version_Lite < Downloaded_Version_Lite) || ((Downloaded_Version_Lite > Installed_Version_Lite) || ((Installed_Version_Lite == Downloaded_Version_Lite) || Installed_Checker_Lite.equals("false")))) {
																																						if (getILSignature(getApplicationContext()).equals(getDLSignature(getApplicationContext())) || Installed_Checker_Lite.equals("false")) {
																																								StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
																																								if(android.os.Build.VERSION.SDK_INT >= 29){
																																										try {
																																												Intent intent = new Intent(Intent.ACTION_VIEW);
																																												intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
																																												intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")), "application/vnd.android.package-archive");
																																												startActivity(intent);
																																												_Reminder();
																																										}
																																										catch(Exception e) {
																																										}
																																								} else {
																																										try {
																																												Intent intent = new Intent(Intent.ACTION_VIEW);
																																												intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")), "application/vnd.android.package-archive");
																																												startActivity(intent);
																																												_Reminder();
																																										}
																																										catch(Exception e) {
																																										}
																																								} 
																																						} else {
																																								if (!MainActivity.this.isFinishing()) {
																																										final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
																																										String Title = "<b>".concat(installation_failed_0.concat("</b>"));
																																										String TitleColor = "1DB954";
																																										Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																										String Message = installation_failed_spap_desc_0.replace("\n", "<br/>");
																																										String MessageColor = "FFFFFF";
																																										Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
																																										Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Signature_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																														try {
																																																Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
																																																startActivity(intent);
																																														}
																																														catch(Exception e) {
																																														}
																																												}
																																										});
																																										Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Signature_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																												}
																																										});
																																										AlertDialog = Signature_Check.create();
																																										AlertDialog.setCancelable(false);
																																										AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
																																										AlertDialog.show();
																																								}
																																						}	
																																				}
																																				else {
																																						if (Downloaded_Version_Lite < Installed_Version_Lite) {
																																								if (!MainActivity.this.isFinishing()) {
																																										final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
																																										String Title = "<b>".concat(installation_failed_0.concat("</b>"));
																																										String TitleColor = "1DB954";
																																										Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
																																										String Message = installation_failed_desc_0.replace("\n", "<br/>");
																																										String MessageColor = "FFFFFF";
																																										Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
																																										Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Downgrade_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																														try {
																																																Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
																																																startActivity(intent);
																																														}
																																														catch(Exception e) {
																																														}
																																												}
																																										});
																																										Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
																																												@Override
																																												public void onClick(DialogInterface Downgrade_Check, int p) {
																																														AlertDialog.setCancelable(true);
																																												}
																																										});
																																										AlertDialog = Downgrade_Check.create();
																																										AlertDialog.setCancelable(false);
																																										AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
																																										AlertDialog.show();
																																								}
																																						}
																																				}
																																		}
																																});
																														}
																												};
																												_timer.schedule(Timer, (int)(100));
																										}
																								});
																						}
																				};
																				_timer.schedule(Timer, (int)(6500));
																		}
																}
														});
												}
												cursor.close();
										}
								}
						}
				};
				progress.start();
		} else {
				com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Slow or no internet connection. Try again later.", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
		}
		
	}
	
	
	public void _Extension_6() {
		if ((Installed_Version_Lite < Downloaded_Version_Lite) || ((Downloaded_Version_Lite > Installed_Version_Lite) || ((Installed_Version_Lite == Downloaded_Version_Lite) || Installed_Checker_Lite.equals("false")))) {
				if (getILSignature(getApplicationContext()).equals(getDLSignature(getApplicationContext())) || Installed_Checker_Lite.equals("false")) {
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
						if(android.os.Build.VERSION.SDK_INT >= 29){
								try {
										Intent intent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
										intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")), "application/vnd.android.package-archive");
						                intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
										startActivity(intent);
										_Reminder();
								}
								catch(Exception e) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Installation Failed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
						} else {
								try {
										Intent intent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
										intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")), "application/vnd.android.package-archive");
										startActivity(intent);
										_Reminder();
								}
								catch(Exception e) {
										SketchwareUtil.CustomToast(getApplicationContext(), "Installation Failed", 0xFF000000, 14, 0xFFE0E0E0, 30, SketchwareUtil.BOTTOM);
								}
						} 
				} else {
						final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						String Title = "<b>".concat(installation_failed_0.concat("</b>"));
						String TitleColor = "1DB954";
						Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = installation_failed_cloned_desc_0.replace("\n", "<br/>");
						String MessageColor = "FFFFFF";
						Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Signature_Check, int p) {
										AlertDialog.setCancelable(true);
										try {
												Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
												startActivity(intent);
										}
										catch(Exception e) {
										}
								}
						});
						Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Signature_Check, int p) {
										AlertDialog.setCancelable(true);
								}
						});
						AlertDialog = Signature_Check.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
				}	
		}
		else {
				if (Downloaded_Version_Lite < Installed_Version_Lite) {
						final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
						String Title = "<b>".concat(installation_failed_0.concat("</b>"));
						String TitleColor = "1DB954";
						Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
						String Message = installation_failed_desc_0.replace("\n", "<br/>");
						String MessageColor = "FFFFFF";
						Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
						Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Downgrade_Check, int p) {
										AlertDialog.setCancelable(true);
										try {
												Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
												startActivity(intent);
										}
										catch(Exception e) {
										}
								}
						});
						Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
								@Override
								public void onClick(DialogInterface Downgrade_Check, int p) {
										AlertDialog.setCancelable(true);
								}
						});
						AlertDialog = Downgrade_Check.create();
						AlertDialog.setCancelable(false);
						AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
						AlertDialog.show();
				}
		}
		
	}
	
	
	public void _Extension_7() {
		final AlertDialog.Builder Success_Download = new AlertDialog.Builder(MainActivity.this, R.style.Other_Dialog);
		String Title = "<b>".concat(download_success_0.concat("</b>"));
		String TitleColor = "1DB954";
		Success_Download.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
		Success_Download.setPositiveButton(install_now_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						if ((Installed_Version_Lite < Downloaded_Version_Lite) || ((Downloaded_Version_Lite > Installed_Version_Lite) || ((Installed_Version_Lite == Downloaded_Version_Lite) || Installed_Checker_Lite.equals("false")))) {
								if (getILSignature(getApplicationContext()).equals(getDLSignature(getApplicationContext())) || Installed_Checker_Lite.equals("false")) {
										StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(); StrictMode.setVmPolicy(builder.build());
										if(android.os.Build.VERSION.SDK_INT >= 29){
												try {
														Intent intent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
														intent.setDataAndType(FileProvider.getUriForFile(MainActivity.this, "com.xc3fff0e.xmanager.provider", new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")), "application/vnd.android.package-archive");
														intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
														startActivity(intent);
														_Reminder();
												}
												catch(Exception e) {
												}
										} else {
												try {
														Intent intent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
														intent.setDataAndType(Uri.fromFile(new File("/storage/emulated/0/Android/data/com.xc3fff0e.xmanager/files/Download/Patched Lite (xManager).apk")), "application/vnd.android.package-archive");
														startActivity(intent);
														_Reminder();
												}
												catch(Exception e) {
												}
										} 
								} else {
										if (!MainActivity.this.isFinishing()) {
												final AlertDialog.Builder Signature_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
												String Title = "<b>".concat(installation_failed_0.concat("</b>"));
												String TitleColor = "1DB954";
												Signature_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
												String Message = installation_failed_cloned_desc_0.replace("\n", "<br/>");
												String MessageColor = "FFFFFF";
												Signature_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												Signature_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Signature_Check, int p) {
																AlertDialog.setCancelable(true);
																try {
																		Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
																		startActivity(intent);
																}
																catch(Exception e) {
																}
														}
												});
												Signature_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Signature_Check, int p) {
																AlertDialog.setCancelable(true);
														}
												});
												AlertDialog = Signature_Check.create();
												AlertDialog.setCancelable(false);
												AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
												AlertDialog.show();
										}
								}	
						}
						else {
								if (!MainActivity.this.isFinishing()) {
										if (Downloaded_Version_Lite < Installed_Version_Lite) {
												final AlertDialog.Builder Downgrade_Check = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
												String Title = "<b>".concat(installation_failed_0.concat("</b>"));
												String TitleColor = "1DB954";
												Downgrade_Check.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
												String Message = installation_failed_desc_0.replace("\n", "<br/>");
												String MessageColor = "FFFFFF";
												Downgrade_Check.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
												Downgrade_Check.setPositiveButton(uninstall_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Downgrade_Check, int p) {
																AlertDialog.setCancelable(true);
																try {
																		Intent intent = new Intent(Intent.ACTION_DELETE); intent.setData(Uri.parse("package:com.spotify.lite")); 
																		startActivity(intent);
																}
																catch(Exception e) {
																}
														}
												});
												Downgrade_Check.setNeutralButton(close_0, new DialogInterface.OnClickListener(){
														@Override
														public void onClick(DialogInterface Downgrade_Check, int p) {
																AlertDialog.setCancelable(true);
														}
												});
												AlertDialog = Downgrade_Check.create();
												AlertDialog.setCancelable(false);
												AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
												AlertDialog.show();
										}
								}
						}
				}
		});
		Success_Download.setNeutralButton(later_0, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Success_Download, int p) {
						AlertDialog.setCancelable(true);
						_Reminder();
				}
		});
		AlertDialog = Success_Download.create();
		AlertDialog.setCancelable(false);
		AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
		AlertDialog.show();
		
	}
	
	
	public void _Permission() {
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
				_Storage_Permission();
		}
	}
	
	public void requestReadExternalStorage() {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
			super.onRequestPermissionsResult(requestCode, permissions, grantResults);
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
					try {
							_Installation_Permission();
							com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Permission Granted", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
					} catch (Exception e) {	
					}
			} else {
					final AlertDialog.Builder Storage_Failed = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
					String Message = "Storage permission not granted. You need to manually enable it.";
					String MessageColor = "FFFFFF";
					Storage_Failed.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
					Storage_Failed.setPositiveButton("SETUP", new DialogInterface.OnClickListener(){
							@Override
							public void onClick(DialogInterface Storage_Failed, int p) {
									AlertDialog.setCancelable(true);
									if (SDK_INT >= Build.VERSION_CODES.R) {
											try {
													Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
													intent.addCategory("android.intent.category.DEFAULT");
													intent.setData(Uri.parse(String.format("package:%s",getApplicationContext().getPackageName())));
													startActivityForResult(intent, 1000);
											} catch (Exception e) {
													Intent intent = new Intent();
													intent.setAction(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
													startActivityForResult(intent, 1000);
											}
									}
									if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
											final AlertDialog.Builder Storage = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
											AlertDialog = Storage.create();
											AlertDialog.dismiss();
									}else{
											_Permission();
									}
							}
					});
					try {
							AlertDialog = Storage_Failed.create();
							AlertDialog.setCancelable(false);
							AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
							AlertDialog.show();
							com.google.android.material.snackbar.Snackbar.make(main_refresh_layout, "Permission Denied", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show();
					} catch (Exception e) {
					}
			}
			
	}
	
	
	public void _Storage_Permission() {
		final AlertDialog.Builder Storage = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
		String Title = "<b>".concat("STORAGE PERMISSION".concat("</b>"));
		String TitleColor = "1DB954";
		Storage.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
		String Message = "xManager needs this permission to utilize the APK Location feature and to save the downloaded patched within that folder.";
		String MessageColor = "FFFFFF";
		Storage.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
		Storage.setPositiveButton("SETUP", new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Storage, int p) {
						AlertDialog.setCancelable(true);
						try {
								requestReadExternalStorage();
						} catch (Exception e) {
						}
				}
		});
		AlertDialog = Storage.create();
		AlertDialog.setCancelable(false);
		AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
		AlertDialog.show();
		
	}
	
	
	public void _Installation_Permission() {
		final AlertDialog.Builder Installation = new AlertDialog.Builder(MainActivity.this, R.style.Alert_Dialog);
		String Title = "<b>".concat("INSTALLATION PERMISSION".concat("</b>"));
		String TitleColor = "1DB954";
		Installation.setTitle(Html.fromHtml("<font color=\"#" + TitleColor + "\">"+Title+"</font>"));
		String Message = "xManager needs this permission to install the downloaded patched.";
		String MessageColor = "FFFFFF";
		Installation.setMessage(Html.fromHtml("<font color=\"#" + MessageColor + "\">"+Message+"</font>"));
		Installation.setPositiveButton("SETUP", new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface Installation, int p) {
						AlertDialog.setCancelable(true);
						try {
								startActivity(new Intent(android.provider.Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES, Uri.parse("package:com.xc3fff0e.xmanager")));
						} catch (Exception e) {		
						}
				}
		});
		AlertDialog = Installation.create();
		AlertDialog.setCancelable(false);
		AlertDialog.getWindow().setBackgroundDrawableResource(R.drawable.background);
		AlertDialog.show();
		
	}
	
	
	public void _Animation_4() {
		Animation a;
		a = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		a.setDuration(200); box_settings_close.startAnimation(a);
		a = null;
		Animation b;
		b = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		b.setDuration(300); title_header.startAnimation(b);
		b = null;
		Animation c;
		c = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		c.setDuration(400); main_box_16.startAnimation(c);
		c = null;
		Animation d;
		d = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		d.setDuration(500); main_box_18.startAnimation(d);
		d = null;
		Animation e;
		e = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
		e.setDuration(600); main_box_9.startAnimation(e);
		e = null;
	}
	
	
	public void _Layout_Transition() {
		if (Build.VERSION.SDK_INT >= 4.1) {
				((ViewGroup) findViewById(R.id.main_box_1)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.main_box_2)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.main_box_3)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.main_box_6)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.box_sub_header)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.main_box_4)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.main_box_15)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
			    
			    ((ViewGroup) findViewById(R.id.box_theme_switch)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
				
				((ViewGroup) findViewById(R.id.box_language_switch)).getLayoutTransition()
				.enableTransitionType(LayoutTransition.CHANGING);
		}
		
	}
	
	
	public void _Reboot() {
		Timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						cloned_version_switch.setChecked(true);
						Timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										cloned_version_switch.setChecked(false);
										Timer = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														experiment_version_switch.setChecked(true);
														Timer = new TimerTask() {
															@Override
															public void run() {
																runOnUiThread(new Runnable() {
																	@Override
																	public void run() {
																		experiment_version_switch.setChecked(false);
																		Timer = new TimerTask() {
																			@Override
																			public void run() {
																				runOnUiThread(new Runnable() {
																					@Override
																					public void run() {
																						list_auto_refresh_switch.setChecked(true);
																						Timer = new TimerTask() {
																							@Override
																							public void run() {
																								runOnUiThread(new Runnable() {
																									@Override
																									public void run() {
																										list_auto_refresh_switch.setChecked(false);
																										Timer = new TimerTask() {
																											@Override
																											public void run() {
																												runOnUiThread(new Runnable() {
																													@Override
																													public void run() {
																														force_auto_install_switch.setChecked(true);
																														Timer = new TimerTask() {
																															@Override
																															public void run() {
																																runOnUiThread(new Runnable() {
																																	@Override
																																	public void run() {
																																		force_auto_install_switch.setChecked(false);
																																		Timer = new TimerTask() {
																																			@Override
																																			public void run() {
																																				runOnUiThread(new Runnable() {
																																					@Override
																																					public void run() {
																																						disable_reward_ad_switch.setChecked(true);
																																						Timer = new TimerTask() {
																																							@Override
																																							public void run() {
																																								runOnUiThread(new Runnable() {
																																									@Override
																																									public void run() {
																																										disable_reward_ad_switch.setChecked(false);
																																									}
																																								});
																																							}
																																						};
																																						_timer.schedule(Timer, (int)(950));
																																					}
																																				});
																																			}
																																		};
																																		_timer.schedule(Timer, (int)(750));
																																	}
																																});
																															}
																														};
																														_timer.schedule(Timer, (int)(900));
																													}
																												});
																											}
																										};
																										_timer.schedule(Timer, (int)(700));
																									}
																								});
																							}
																						};
																						_timer.schedule(Timer, (int)(850));
																					}
																				});
																			}
																		};
																		_timer.schedule(Timer, (int)(650));
																	}
																});
															}
														};
														_timer.schedule(Timer, (int)(800));
													}
												});
											}
										};
										_timer.schedule(Timer, (int)(600));
									}
								});
							}
						};
						_timer.schedule(Timer, (int)(750));
					}
				});
			}
		};
		_timer.schedule(Timer, (int)(550));
	}
	
	public class List_items_1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public List_items_1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.list_versions, null);
			}
			
			final LinearLayout box = _view.findViewById(R.id.box);
			final TextView link = _view.findViewById(R.id.link);
			final TextView mirror = _view.findViewById(R.id.mirror);
			final ImageView icon = _view.findViewById(R.id.icon);
			final TextView sub = _view.findViewById(R.id.sub);
			final TextView sub_separator = _view.findViewById(R.id.sub_separator);
			final TextView title = _view.findViewById(R.id.title);
			
			try {
				sub.setVisibility(View.VISIBLE);
				sub_separator.setVisibility(View.VISIBLE);
				title.setVisibility(View.VISIBLE);
				if (_position < 1) {
					sub.setTextColor(0xFFFF1744);
					sub.setText("LATEST RELEASE");
					sub_separator.setTextColor(0xFF616161);
					sub_separator.setText("|");
				}
				else {
					sub.setTextColor(0xFFBDBDBD);
					sub.setText("OLDER RELEASE");
					sub_separator.setTextColor(0xFF616161);
					sub_separator.setText("|");
				}
				sub.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				sub_separator.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
					title.setText(stock_patched.get((int)(stock_patched.size() - 1) - _position).get("Title").toString());
				}
				else {
					if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
						title.setText(stock_cloned_patched.get((int)(stock_cloned_patched.size() - 1) - _position).get("Title").toString());
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
							title.setText(stock_experimental_patched.get((int)(stock_experimental_patched.size() - 1) - _position).get("Title").toString());
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
								title.setText(stock_experimental_cloned_patched.get((int)(stock_experimental_cloned_patched.size() - 1) - _position).get("Title").toString());
							}
						}
					}
				}
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); box.startAnimation(animation);
				animation = null;
			} catch (Exception e) {
			}
			
			return _view;
		}
	}
	
	public class List_items_2Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public List_items_2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.list_versions, null);
			}
			
			final LinearLayout box = _view.findViewById(R.id.box);
			final TextView link = _view.findViewById(R.id.link);
			final TextView mirror = _view.findViewById(R.id.mirror);
			final ImageView icon = _view.findViewById(R.id.icon);
			final TextView sub = _view.findViewById(R.id.sub);
			final TextView sub_separator = _view.findViewById(R.id.sub_separator);
			final TextView title = _view.findViewById(R.id.title);
			
			try {
				sub.setVisibility(View.VISIBLE);
				sub_separator.setVisibility(View.VISIBLE);
				title.setVisibility(View.VISIBLE);
				if (_position < 1) {
					sub.setTextColor(0xFFFF1744);
					sub.setText("LATEST RELEASE");
					sub_separator.setTextColor(0xFF616161);
					sub_separator.setText("|");
				}
				else {
					sub.setTextColor(0xFFBDBDBD);
					sub.setText("OLDER RELEASE");
					sub_separator.setTextColor(0xFF616161);
					sub_separator.setText("|");
				}
				sub.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				sub_separator.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				if (SWITCH_VERSION.getString("SWITCH", "").equals("A")) {
					title.setText(amoled_patched.get((int)(amoled_patched.size() - 1) - _position).get("Title").toString());
				}
				else {
					if (SWITCH_VERSION.getString("SWITCH", "").equals("B")) {
						title.setText(amoled_cloned_patched.get((int)(amoled_cloned_patched.size() - 1) - _position).get("Title").toString());
					}
					else {
						if (SWITCH_VERSION.getString("SWITCH", "").equals("C")) {
							title.setText(amoled_experimental_patched.get((int)(amoled_experimental_patched.size() - 1) - _position).get("Title").toString());
						}
						else {
							if (SWITCH_VERSION.getString("SWITCH", "").equals("D")) {
								title.setText(amoled_experimental_cloned_patched.get((int)(amoled_experimental_cloned_patched.size() - 1) - _position).get("Title").toString());
							}
						}
					}
				}
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); box.startAnimation(animation);
				animation = null;
			} catch (Exception e) {
			}
			
			return _view;
		}
	}
	
	public class List_items_3Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public List_items_3Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.list_versions, null);
			}
			
			final LinearLayout box = _view.findViewById(R.id.box);
			final TextView link = _view.findViewById(R.id.link);
			final TextView mirror = _view.findViewById(R.id.mirror);
			final ImageView icon = _view.findViewById(R.id.icon);
			final TextView sub = _view.findViewById(R.id.sub);
			final TextView sub_separator = _view.findViewById(R.id.sub_separator);
			final TextView title = _view.findViewById(R.id.title);
			
			try {
				sub.setVisibility(View.VISIBLE);
				sub_separator.setVisibility(View.VISIBLE);
				title.setVisibility(View.VISIBLE);
				link.setVisibility(View.GONE);
				mirror.setVisibility(View.GONE);
				if (_position < 1) {
					sub.setTextColor(0xFFFF1744);
					sub.setText("LATEST RELEASE");
					sub_separator.setTextColor(0xFF616161);
					sub_separator.setText("|");
				}
				else {
					sub.setTextColor(0xFFBDBDBD);
					sub.setText("OLDER RELEASE");
					sub_separator.setTextColor(0xFF616161);
					sub_separator.setText("|");
				}
				sub.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				sub_separator.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				title.setText(lite_patched.get((int)(lite_patched.size() - 1) - _position).get("Title").toString());
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); box.startAnimation(animation);
				animation = null;
			} catch (Exception e) {
			}
			
			return _view;
		}
	}
	
	public class List_items_4Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public List_items_4Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.list_changelogs, null);
			}
			
			final LinearLayout box = _view.findViewById(R.id.box);
			final TextView info = _view.findViewById(R.id.info);
			
			try {
				info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/base_font.ttf"), 1);
				info.setText(patched_changelogs.get((int)(patched_changelogs.size() - 1) - _position).get("Patched_Changelogs").toString());
				Animation animation;
				animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
				animation.setDuration(500); box.startAnimation(animation);
				animation = null;
			}
			catch(Exception e) {
			}
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}

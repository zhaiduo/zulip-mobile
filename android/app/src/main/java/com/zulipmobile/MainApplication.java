package com.zulipmobile;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.oblador.vectoricons.VectorIconsPackage;
import com.nikolaiwarner.RNTextInputReset.RNTextInputResetPackage;
import com.zmxv.RNSound.RNSoundPackage;
import io.sentry.RNSentryPackage;
import com.reactnative.photoview.PhotoViewPackage;
import com.github.yamill.orientation.OrientationPackage;
import com.wix.reactnativenotifications.RNNotificationsPackage;
import com.imagepicker.ImagePickerPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.remobile.toast.RCTToastPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.nikolaiwarner.RNTextInputReset.RNTextInputResetPackage;
import com.zmxv.RNSound.RNSoundPackage;
import io.sentry.RNSentryPackage;
import com.reactnative.photoview.PhotoViewPackage;
import com.github.yamill.orientation.OrientationPackage;
import com.wix.reactnativenotifications.RNNotificationsPackage;
import com.imagepicker.ImagePickerPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.remobile.toast.RCTToastPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.nikolaiwarner.RNTextInputReset.RNTextInputResetPackage;
import com.zmxv.RNSound.RNSoundPackage;
import io.sentry.RNSentryPackage;
import com.reactnative.photoview.PhotoViewPackage;
import com.github.yamill.orientation.OrientationPackage;
import com.wix.reactnativenotifications.RNNotificationsPackage;
import com.imagepicker.ImagePickerPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.remobile.toast.RCTToastPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new VectorIconsPackage(),
            new RNTextInputResetPackage(),
            new RNSoundPackage(),
            new RNSentryPackage(MainApplication.this),
            new PhotoViewPackage(),
            new OrientationPackage(),
            new RNNotificationsPackage(),
            new ImagePickerPackage(),
            new RNFetchBlobPackage(),
            new RNDeviceInfo(),
            new RCTToastPackage(),
            new VectorIconsPackage(),
            new VectorIconsPackage(),
            new VectorIconsPackage(),
            new RNTextInputResetPackage(),
            new RNSoundPackage(),
            new RNSentryPackage(MainApplication.this),
            new PhotoViewPackage(),
            new OrientationPackage(),
            new RNNotificationsPackage(),
            new ImagePickerPackage(),
            new RNFetchBlobPackage(),
            new RNDeviceInfo(),
            new RCTToastPackage(),
            new VectorIconsPackage(),
            new RNTextInputResetPackage(),
            new RNSoundPackage(),
            new RNSentryPackage(MainApplication.this),
            new PhotoViewPackage(),
            new OrientationPackage(),
            new RNNotificationsPackage(),
            new ImagePickerPackage(),
            new RNFetchBlobPackage(),
            new RNDeviceInfo(),
            new RCTToastPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}

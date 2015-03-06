package com.badlogic.gdx.physics.box2d.utils;

import java.io.File;

import com.badlogic.gdx.jnigen.AntScriptGenerator;
import com.badlogic.gdx.jnigen.BuildConfig;
import com.badlogic.gdx.jnigen.BuildExecutor;
import com.badlogic.gdx.jnigen.BuildTarget;
import com.badlogic.gdx.jnigen.NativeCodeGenerator;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;

public class Box2DBuild {
	public static void main(String[] args) throws Exception {
//		BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false); win32.compilerPrefix = "mingw32-";
//		BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
//		BuildTarget lin32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
//		BuildTarget lin64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
//		BuildTarget android = BuildTarget.newDefaultTarget(TargetOs.Android, false);
//		BuildTarget mac32 = BuildTarget.newDefaultTarget(TargetOs.MacOsX, false);
//		BuildTarget mac64 = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);
//		BuildTarget ios = BuildTarget.newDefaultTarget(TargetOs.IOS, false);
//		new NativeCodeGenerator().generate("src", "bin" + File.pathSeparator + "../libgdx-master/gdx/bin", "jni");
//		new AntScriptGenerator().generate(new BuildConfig("gdx-liquidfun"), win32, win64, lin32, lin64, mac32, mac64, android, ios);
		
		//BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean postcompile");
        //BuildExecutor.executeAnt("jni/build-windows64.xml", "-v -Dhas-compiler=true clean postcompile");
        //BuildExecutor.executeAnt("jni/build-linux32.xml", "-v -Dhas-compiler=true clean postcompile");
        //BuildExecutor.executeAnt("jni/build-linux64.xml", "-v -Dhas-compiler=true clean postcompile");
        //BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true  clean postcompile");
        BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
	}
}
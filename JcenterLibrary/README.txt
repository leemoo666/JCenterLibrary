第一步：
项目的根目录build.gradle下添加
        classpath 'com.novoda:bintray-release:0.8.0'
第二步：
module下的build.gradle下添加
    apply plugin: 'com.novoda.bintray-release'
第三步：
module下的build.gradle下添加
    publish {
        userOrg = 'aman'//bintray.com用户名
        groupId = 'com.lxm'//jcenter上的路径
        artifactId = 'common'//项目名称
        publishVersion = '0.1.0'//版本号
        desc = 'Oh hi, this is a nice description for a project, right?'//描述，不重要
        website = 'https://github.com/lixiaoming0314/JCenterLibrary'//网站，不重要；尽量模拟github上的地址，例如我这样的；当然你有地址最好了
    }
第四步：
在terminal下输入
    ./gradlew clean build bintrayUpload -PbintrayUser=aman -PbintrayKey=cc90626de7b9e0b11e24cccb0504c225ce63df71 -PdryRun=false
第五步：
    打开https://bintray.com/aman/maven，添加到 add to jcenter
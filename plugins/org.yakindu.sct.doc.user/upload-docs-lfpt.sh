#!/bin/sh -xv

server="ftp.hubapi.com"
port="3200"
userid="webdev@itemis.de"
password="Hs%?7kO9kB"

localFilePattern="website/images/*.png"
remoteDirectory="/portals/761475-itemis_ag/content/files/Yakindu/Statechart_Tools/Documentation/images/"
localFiles=""
url="ftp://${server}:${port}${remoteDirectory}"
for i in ${localFilePattern}
do
    curl --verbose --ssl --ftp-pasv --user webdev@itemis.de:Hs%?7kO9kB --ftp-method singlecwd --upload-file "${i}" "${url}"
    exit
    if [ "${localFiles}" == "" ]
    then
	localFiles="${i}"
    else
	localFiles="${localFiles},${i}"
    fi
done

#url="ftp://${server}:${port}${remoteDirectory}"
#curl --verbose --ssl --ftp-pasv --user webdev@itemis.de:Hs%?7kO9kB --ftp-method singlecwd --upload-file "{${localFiles}}" "${url}"

exit 


cssLocal="{website/css/ysct.css}"
cssRemote="/portals/761475-itemis_ag/content/templates/custom/page/YSCT_Templates/"

textLocal="{website/YSCT-installation.html,website/YSCT-tutorials.html,website/YSCT-user-guide.html}"
textRemote="/portals/761475-itemis_ag/content/templates/custom/page/YSCT_Templates/"



exit

CSS:
----
lokal:  statecharts/plugins/org.yakindu.sct.doc.user/website/css/ysct.css
remote: /portals/761475-itemis_ag/content/templates/custom/page/YSCT_Templates/ysct.css


Bilder:
-------
lokal:  statecharts/plugins/org.yakindu.sct.doc.user/website/images/*
remote: /portals/761475-itemis_ag/content/files/Yakindu/Statechart_Tools/Documentation/images/*


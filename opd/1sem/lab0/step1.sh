cd ~/
[ -d "./lab0" ] && chmod -R u+rwx,g+rwx,o+rwx ./lab0
[ -d "./lab0" ] && rm -R "./lab0"

mkdir "./lab0"
cd "lab0"

# === Task 1 ===

mkdir "./arcanine5"
mkdir "./arcanine5/torchic"
mkdir "./arcanine5/linoone"


mkdir "./clamperl5"
mkdir "./clamperl5/buizel"
mkdir "./clamperl5/skiploom"

mkdir "./gloom1"
mkdir "./gloom1/hydreigon"
mkdir "./gloom1/nidoranM"
mkdir "./gloom1/feebas"

echo "Xоды Ancientpower Dragon Pulse Earth Power Endeavor Fire" >> "./arcanine5/cranidos"
echo "Punch Iron Head Iron Tail Mud-Slap Rock Climb Shock Wave Sleep Talk Snore Spite Stealth Rock Superpower Thunderpunch Uproar Zen" >> "./arcanine5/cranidos"
echo "Headbutt" >> "./arcanine5/cranidos"

echo "Способности Dark Art Mach Speed Big Pecks" >> "./arcanine5/vullaby"
echo "Overcoat" >> "./arcanine5/vullaby"

echo "Способности Pure Blooded Rock Head Vital" >> "./bagon0"
echo "Spirit" >> "./bagon0"

echo "Развитые способности Hustle" >> "./clamperl5/combee"

echo "Тип покемона" >> "./gloom1/meowth"
echo "NORMAL NONE" >> "./gloom1/meowth"

echo "BoзMOжнOCTи" >> "./gloom1/pidove"
echo "Overland=4 Surface=1 Sky=6 Jump=3" >> "./gloom1/pidove"
echo "Power2=0 Intelligence=3 Guster=0" >> "./gloom1/pidove"

echo "weigth=177.5 height=83.0" >> "./gloom1/eelektross"
echo "atk=12 def=8" >> "./gloom1/eelektross"

echo "Способности Chip Away Body Slam Earth Power" >> "./nidoqueen0"
echo "Superpower" >> "./nidoqueen0"

echo "Способности Swarm Venom Battle Armor Poison Point" >> "./whirlpede5"

# === Task 2 ===

chmod u=wx,g=wxr,o=rx ./arcanine5
chmod 400 ./arcanine5/cranidos
chmod 337 ./arcanine5/torchic
chmod u=rw,g=w,o= ./arcanine5/vullaby
chmod u=rx,g=x,o=w ./arcanine5/linoone
chmod 600 ./bagon0
chmod u=rwx,g=rx,o=wx ./clamperl5
chmod u=wx,g=wx,o=wx ./clamperl5/buizel
chmod 317 ./clamperl5/skiploom
chmod u=rw,g=,o= ./clamperl5/combee
chmod u=wx,g=rw,o=wx ./gloom1
chmod u=rx,g=w,o=r ./gloom1/hydreigon
chmod u=rw,g=,o= ./gloom1/meowth
chmod 700 ./gloom1/nidoranM
chmod u=,g=r,o=rw ./gloom1/pidove
chmod 711 ./gloom1/feebas
chmod u=,g=,o=r ./gloom1/eelektross
chmod 660 ./nidoqueen0
chmod 066 ./whirlpede5




chmod -R u+rwx,g+rwx,o+rwx .

cp -R ./clamperl5 ./gloom1/hydreigon/
ln ./nidoqueen0 ./gloom1/meowthnidoqueen
cp ./nidoqueen0 ./arcanine5/linoone/
cat ./arcanine5/vullaby ./gloom1/meowth > ./nidoqueen0_29
ln -s ./whirlpede5 ./gloom1/eelektrosswhirlpede
cat ./bagon0 > ./gloom1/pidovebagon
ln -s ./arcanine5 ./Copy_20



# === Task 4 ===


echo --- 1 ---
ls -lR . 2>&1 | grep -E "^-.*e$" | sort -nk5
echo --- 2 ---
ls -lR . 2>~/tmp/lab0_errors | sort -nk5 | tail -n 4
echo --- 3 ---
cat -n nidoqueen0 2>&1 | grep -vi "t$"
echo --- 4 ---
ls -luR . 2>&1 | grep "^-.*5$" | sort -r -k8,9 | head -n 3
echo --- 5 ---
cat -n `grep -RIl . | grep -E "c[^ ]*$" | sort -i`
echo --- 6 ---
ls -lRlt clamperl5 2>/dev/null | grep -v '^total' | grep -v ':$'


# === Task 5 ===


rm ./nidoqueen0
rm ./gloom1/pidove
rm ./gloom1/eelektrosswhirlpe*
rm ./lab0/gloom1/meowthnidoque*

rm -rf ./arcanine5/*
rmdir ./arcanine5

rm -rf ./clamperl5/buizel/*
rmdir ./clamperl5/buizel
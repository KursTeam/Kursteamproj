PGDMP                 
        w            new    12.1    12.1     !           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            "           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            #           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            $           1262    28995    new    DATABASE     �   CREATE DATABASE new WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE new;
                postgres    false            �            1259    28996    Group    TABLE     l   CREATE TABLE public."Group" (
    group_id integer NOT NULL,
    name text NOT NULL,
    user_id integer
);
    DROP TABLE public."Group";
       public         heap    postgres    false            �            1259    29002    Group_group_id_seq    SEQUENCE     �   CREATE SEQUENCE public."Group_group_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public."Group_group_id_seq";
       public          postgres    false    202            %           0    0    Group_group_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public."Group_group_id_seq" OWNED BY public."Group".group_id;
          public          postgres    false    203            �
           2604    29038    Group group_id    DEFAULT     t   ALTER TABLE ONLY public."Group" ALTER COLUMN group_id SET DEFAULT nextval('public."Group_group_id_seq"'::regclass);
 ?   ALTER TABLE public."Group" ALTER COLUMN group_id DROP DEFAULT;
       public          postgres    false    203    202                      0    28996    Group 
   TABLE DATA           :   COPY public."Group" (group_id, name, user_id) FROM stdin;
    public          postgres    false    202          &           0    0    Group_group_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public."Group_group_id_seq"', 5, true);
          public          postgres    false    203            �
           2606    29045    Group Group_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Group"
    ADD CONSTRAINT "Group_pkey" PRIMARY KEY (group_id);
 >   ALTER TABLE ONLY public."Group" DROP CONSTRAINT "Group_pkey";
       public            postgres    false    202            �
           2606    29056    Group Group_user_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Group"
    ADD CONSTRAINT "Group_user_id_fkey" FOREIGN KEY (user_id) REFERENCES public."Users"(user_id);
 F   ALTER TABLE ONLY public."Group" DROP CONSTRAINT "Group_user_id_fkey";
       public          postgres    false    202               1   x�3��M,�H�M,�L.�0t��4�2Fs��rdT�Ԙp��qqq &�B     